/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jolie.net;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Envelope;

/**
 *
 * @author michael
 */
public class AmqpMessage {
  public byte[] body;
  public Envelope envelope;
  public AMQP.BasicProperties properties;
  public AmqpMessage(Envelope envelope, byte[] body, AMQP.BasicProperties properties) {
    this.envelope = envelope;
    this.body = body;
    this.properties = properties;
  }

  public AmqpMessage() {

  }
}
