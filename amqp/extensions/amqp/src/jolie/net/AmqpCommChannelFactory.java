/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jolie.net;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import jolie.net.ext.CommChannelFactory;
import jolie.net.ports.OutputPort;
import jolie.runtime.AndJarDeps;

/**
 *
 * @author Claus Lindquist Henriksen & Michael Søby Andersen.
 */
@AndJarDeps({"rabbitmq-client.jar"})
public class AmqpCommChannelFactory extends CommChannelFactory {

  /**
   *
   * @param commCore
   */
  public AmqpCommChannelFactory(CommCore commCore) {
    super(commCore);
  }

  @Override
  public CommChannel createChannel(URI location, OutputPort port) throws IOException {
    try {
      return new AmqpCommChannel(location, port.getProtocol());
    } catch (URISyntaxException ex) {
      throw new IOException(ex);
    }
  }
}
