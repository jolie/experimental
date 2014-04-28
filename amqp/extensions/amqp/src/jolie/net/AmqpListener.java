/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jolie.net;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import jolie.Interpreter;
import jolie.net.ext.CommProtocolFactory;
import jolie.net.ports.InputPort;

/**
 *
 * @author Claus Lindquist Henriksen & Michael Søby Andersen.
 */
public class AmqpListener extends CommListener {

  private final InputPort inputPort;
  private final String queue;
  private String consumerTag;
  private final Object lock = new Object();
  private AmqpMessage currentMessage = null;

  public AmqpListener(Interpreter interpreter, CommProtocolFactory protocolFactory, InputPort inputPort) throws IOException {
    super(interpreter, protocolFactory, inputPort);

    this.inputPort = inputPort;

    queue = locationParams().get("queue");
    consumerTag = locationParams().get("consumerTag");
    consumerTag = consumerTag != null ? consumerTag : "Jolie consumer";

    // Make sure that queue exists. If not create it as an auto-delete queue.
    try {
      // Try to declare queue, it will throw IOException if it exists, and close the channel.
      channel().queueDeclare(queue, false, false, true, null);
    } catch (IOException e) {
      // Reopen channel.
      connection().reopenChannel();
    }


    // Consume from queue.
    channel().basicConsume(queue, false, consumerTag,
      new DefaultConsumer(channel()) {
        @Override
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
          synchronized (lock) {
            currentMessage = new AmqpMessage(envelope, body, properties);
            lock.notify();
          }
        }
      });
  }

  @Override
  public void run() {
    while (true) {
      try {
        // Wait for a message from handleDelivery in basicConsume above.
        synchronized (lock) {
          while (currentMessage == null) {
            lock.wait();
          }
          // Create channel for receive implementation.
          AmqpCommChannel commChannel = new AmqpCommChannel(inputPort.location(), createProtocol());
          commChannel.setParentInputPort(inputPort);
          commChannel.setDataToProcess(currentMessage);

          // Receive.
          interpreter().commCore().scheduleReceive(commChannel, inputPort());

          // Reset.
          currentMessage = null;
        }
      } catch (InterruptedException | IOException ex) {
        Logger.getLogger(AmqpListener.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  @Override
  public void shutdown() {
    try {
      // Close current connection.
      AmqpConnectionHandler.closeConnection(inputPort().location());
    } catch (IOException ex) {
      Logger.getLogger(AmqpListener.class.getName()).log(Level.WARNING, null, ex);
    }
  }

  public final Channel channel() throws IOException {
    return connection().getChannel();
  }

  public final Map<String, String> locationParams() throws IOException {
    return connection().getLocationParams();
  }
  
  public final AmqpConnection connection() throws IOException {
    return AmqpConnectionHandler.getConnection(inputPort().location());
  }

}
