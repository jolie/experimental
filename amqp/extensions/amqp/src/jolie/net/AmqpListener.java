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

  private String queue;
  private boolean autoAck;
  private String consumerTag;
  private final Object lock = new Object();
  private AmqpMessage currentMessage = null;
  private AmqpCommChannel commChannel;

  public AmqpListener(Interpreter interpreter, CommProtocolFactory protocolFactory, InputPort inputPort) throws IOException {
    super(interpreter, protocolFactory, inputPort);
    
    commChannel = new AmqpCommChannel(inputPort.location(), createProtocol());
    queue = locationParams().get("queue");
    String ackTmp = locationParams().get("autoAck");
    autoAck = ackTmp != null ? !ackTmp.toLowerCase().equals("true") : false;
    consumerTag = locationParams().get("consumerTag");
    consumerTag = consumerTag != null ? consumerTag : "Jolie consumer";
    
    commChannel.setParentInputPort(inputPort());
    
    channel().basicConsume(queue, autoAck, consumerTag,
      new DefaultConsumer(channel()) {
        @Override
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
          synchronized (lock) {
            currentMessage = new AmqpMessage(envelope, body);
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
          long deliveryTag = currentMessage.envelope.getDeliveryTag();
          
          // Create channel for receive implementation.
          commChannel.setDataToProcess(currentMessage.body);
          interpreter().commCore().scheduleReceive(commChannel, inputPort());
          
          // Don't know why 2nd parameter is false, and API is no help.
          channel().basicAck(deliveryTag, false);
          // Reset.
          currentMessage = null;
        }
      } catch (IOException | InterruptedException ex) {
        Logger.getLogger(AmqpListener.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  @Override
  public void shutdown() {
    try {
      commChannel.close();
    } catch (IOException ex) {
      Logger.getLogger(AmqpListener.class.getName()).log(Level.WARNING, null, ex);
    }
  }
  
  private class AmqpMessage {
    public byte[] body;
    public Envelope envelope;
    public AmqpMessage(Envelope envelope, byte[] body) {
      this.envelope = envelope;
      this.body = body;
    }
  }
  
  private Channel channel() {
    return commChannel.getChannel();
  }
  
  private Map<String, String> locationParams() {
    return commChannel.getLocationParams();
  }

}
