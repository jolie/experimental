/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jolie.net;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jolie.net.protocols.CommProtocol;
import jolie.runtime.Value;

/**
 *
 * @author Claus Lindquist Henriksen & Michael Søby Andersen.
 */
public class AmqpCommChannel extends StreamingCommChannel {
    private Connection conn;
    private Channel chan;
    private String exchName;
    private String routingKey;
    private String queueName;
    
    public AmqpCommChannel(URI location, CommProtocol protocol) throws IOException {
        super(location, protocol);
        try {
            exchName = "exchange";
            routingKey = "";
            queueName = "queue";
            
            // Connect to the AMQP server.
            ConnectionFactory factory = new ConnectionFactory();
            factory.setUri(location);
            conn = factory.newConnection();
            
            // Create the channel.
            chan = conn.createChannel();
            
            // Bind to the queue defined.
            chan.queueBind(queueName, exchName, routingKey);
            while (true) { }
        } catch (URISyntaxException | NoSuchAlgorithmException | KeyManagementException ex) {
            Logger.getLogger(AmqpCommChannel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    protected CommMessage recvImpl() throws IOException {
        System.out.println("DEBUG: Receiving some stuff");
        return CommMessage.createResponse(CommMessage.UNDEFINED_MESSAGE, Value.create("Testresponse"));
    }

    @Override
    protected void sendImpl(CommMessage message) throws IOException {
        byte[] messageBodyBytes = "Hello, world!".getBytes();
        chan.basicPublish(exchName, routingKey, null, messageBodyBytes);
        
        System.out.println("DEBUG: Sending some stuff");
        System.out.println(message.value().strValue());
    }

    @Override
    protected void closeImpl() throws IOException {
        chan.close();
        conn.close();
    }
}