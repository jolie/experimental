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
  private String queue;
  private boolean autoAck;
  private String consumerTag;
  private final Object lock = new Object();
  private AmqpMessage currentMessage = null;

  public AmqpListener(Interpreter interpreter, CommProtocolFactory protocolFactory, InputPort inputPort) throws IOException {
    super(interpreter, protocolFactory, inputPort);
    
    this.inputPort = inputPort;
    
    queue = locationParams().get("queue");
    String ackTmp = locationParams().get("autoAck");
    autoAck = ackTmp != null ? !ackTmp.toLowerCase().equals("true") : false;
    consumerTag = locationParams().get("consumerTag");
    consumerTag = consumerTag != null ? consumerTag : "Jolie consumer";
    
    channel().basicConsume(queue, autoAck, consumerTag,
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
        synchronized (lock) {
          while (currentMessage == null) {
            lock.wait();
          }
          // Create channel for receive implementation.
          AmqpCommChannel commChannel = new AmqpCommChannel(inputPort.location(), createProtocol());
          commChannel.setParentInputPort(inputPort);
          commChannel.setDataToProcess(currentMessage);
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
      AmqpConnectionHandler.closeConnection(inputPort().location());
    } catch (IOException ex) {
      Logger.getLogger(AmqpListener.class.getName()).log(Level.WARNING, null, ex);
    }
  }
  
  public final Channel channel() throws IOException {
    return AmqpConnectionHandler.getConnection(inputPort().location()).getChannel();
  }
  
  public final Map<String, String> locationParams() throws IOException {
    return AmqpConnectionHandler.getConnection(inputPort().location()).getLocationParams();
  }

}
