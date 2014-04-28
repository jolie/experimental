package jolie.net;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import jolie.net.ext.CommChannelFactory;
import jolie.net.ports.OutputPort;
import jolie.runtime.AndJarDeps;

/**
 * Factory for creating a CommChannel for the Amqp implementation.
 * @author Claus Lindquist Henriksen (clih@itu.dk).
 * @author Michael Søby Andersen (msoa@itu.dk).
 */
@AndJarDeps({"rabbitmq-client.jar"})
public class AmqpCommChannelFactory extends CommChannelFactory {

  /**
   * @param commCore The communication core.
   */
  public AmqpCommChannelFactory(CommCore commCore) {
    super(commCore);
  }

  /**
   * Create a CommChannel.
   * @param location The location of the channel.
   * @param port The port (input/output) of the channel.
   * @return The new CommChannel
   * @throws IOException 
   */
  @Override
  public CommChannel createChannel(URI location, OutputPort port) throws IOException {
    try {
      return new AmqpCommChannel(location, port.getProtocol());
    } catch (URISyntaxException ex) {
      throw new IOException(ex);
    }
  }
}
