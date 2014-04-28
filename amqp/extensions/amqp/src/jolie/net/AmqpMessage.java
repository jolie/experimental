package jolie.net;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Envelope;

/**
 * Class for containing an AmqpMessage.
 * @author Claus Lindquist Henriksen (clih@itu.dk).
 * @author Michael Søby Andersen (msoa@itu.dk).
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
