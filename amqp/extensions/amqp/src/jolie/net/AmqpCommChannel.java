/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jolie.net;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
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
    
    public AmqpCommChannel(URI location, CommProtocol protocol) throws IOException {
        super(location, protocol);
        try {
            String schemeAndPath = location.toString().split("\\?")[0];
            Map<String, String> query = getQueryMap(location.getQuery());
            
            exchName = query.get("exchange");
            routingKey = query.get("routingkey");
            routingKey = routingKey == null ? routingKey : "";
            
            // Connect to the AMQP server.
            ConnectionFactory factory = new ConnectionFactory();
            factory.setUri(schemeAndPath);
            conn = factory.newConnection();
            
            // Create the channel.
            chan = conn.createChannel();
        } catch (URISyntaxException | NoSuchAlgorithmException | KeyManagementException ex) {
            Logger.getLogger(AmqpCommChannel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    protected CommMessage recvImpl() throws IOException {
        System.out.println("DEBUG: Receiving some stuff");
        return CommMessage.createResponse(CommMessage.UNDEFINED_MESSAGE, Value.create(true));
    }

    @Override
    protected void sendImpl(CommMessage message) throws IOException {
        // Make protocol give us the bytes to send.
        ByteArrayOutputStream ostream = new ByteArrayOutputStream();
	protocol().send(ostream, message, null); // TODO Awaiting FMontesi
        
        chan.basicPublish(exchName, routingKey, null, ostream.toByteArray());
    }

    @Override
    protected void closeImpl() throws IOException {
        chan.close();
        conn.close();
    }
    public static Map<String, String> getQueryMap(String query)  
    {  
        String[] params = query.split("&");  
        Map<String, String> map = new HashMap();  
        for (String param : params)  
        {  
            String name = param.split("=")[0];  
            String value = param.split("=")[1];  
            map.put(name, value);  
        }  
        return map;  
    }  
}