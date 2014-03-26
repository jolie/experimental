/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jolie.net;

import java.io.IOException;
import jolie.Interpreter;
import jolie.net.ext.CommListenerFactory;
import jolie.net.ext.CommProtocolFactory;
import jolie.net.ports.InputPort;
import jolie.runtime.AndJarDeps;

/**
 *
 * @author Claus Lindquist Henriksen & Michael Søby Andersen.
 */
@AndJarDeps({"rabbitmq-client.jar"})
public class AmqpListenerFactory extends CommListenerFactory {
    public AmqpListenerFactory( CommCore commCore ) {
        super(commCore);
    }
    @Override
    public CommListener createListener(Interpreter interpreter, CommProtocolFactory protocolFactory, InputPort inputPort) throws IOException {
        return new AmqpListener(interpreter, protocolFactory, inputPort);
    }
}