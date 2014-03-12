/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jolie.net;

import java.io.IOException;
import java.net.URI;
import jolie.net.ext.CommChannelFactory;
import jolie.net.ports.OutputPort;
import jolie.net.protocols.CommProtocol;
import jolie.runtime.AndJarDeps;

/**
 *
 * @author Claus Lindquist Henriksen & Michael Søby Andersen.
 */
@AndJarDeps({"rabbitmq-client.jar"})
public class AmqpCommChannelFactory  extends CommChannelFactory {

    /**
     *
     */
    public AmqpCommChannelFactory( CommCore commCore )
    {
        super( commCore );
    }
    
    @Override
    public CommChannel createChannel(URI location, OutputPort port) throws IOException {
        // We hardcode using the sodep protocol.
        CommProtocol protocol = this.commCore().createOutputCommProtocol(
			"sodep",
			null,
			location
		);
	return new AmqpCommChannel(location, protocol);
    }
}