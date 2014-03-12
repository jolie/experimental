/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jolie.net;

import java.io.IOException;
import jolie.Interpreter;
import jolie.net.ext.CommProtocolFactory;
import jolie.net.ports.InputPort;

/**
 *
 * @author Claus Lindquist Henriksen & Michael Søby Andersen.
 */
public class AmqpListener extends CommListener {

    public AmqpListener(Interpreter interpreter, CommProtocolFactory protocolFactory, InputPort inputPort) throws IOException
    {
        super( interpreter, protocolFactory, inputPort );
    }

    @Override
    public void shutdown() {
        // TODO
    }
    
}
