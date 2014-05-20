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
public class AmqpCommListenerFactory extends CommListenerFactory {
    public AmqpCommListenerFactory( CommCore commCore ) {
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
        return new AmqpCommListener(interpreter, protocolFactory, inputPort);
    }
}