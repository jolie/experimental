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
 * The factory for creating the listener.
 * @author Claus Lindquist Henriksen (clih@itu.dk).
 * @author Michael Søby Andersen (msoa@itu.dk).
 */
@AndJarDeps({"rabbitmq-client.jar"})
public class AmqpListenerFactory extends CommListenerFactory {
    public AmqpListenerFactory( CommCore commCore ) {
        super(commCore);
    }
    
    /**
     * Create a listener.
     * @param interpreter The interpreter.
     * @param protocolFactory The factory for the protocol.
     * @param inputPort The InputPort for the listener.
     * @return The new CommListener.
     * @throws IOException 
     */
    @Override
    public CommListener createListener(Interpreter interpreter, CommProtocolFactory protocolFactory, InputPort inputPort) throws IOException {
        return new AmqpListener(interpreter, protocolFactory, inputPort);
    }
}