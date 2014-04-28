/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jolie.net;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ShutdownSignalException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author michael
 */
public final class AmqpConnection {
  private Connection conn;
  private Channel chan;
  
  private final URI location;
  private Map<String, String> locationParams;
  
  public AmqpConnection(URI location) throws IOException {
    this.location = location;
    
    parseLocation();
    try {
      connect();
    } catch (URISyntaxException | NoSuchAlgorithmException | KeyManagementException | IOException ex) {
      throw new IOException("Error during connect", ex);
    }
  }
  
  public void connect() throws URISyntaxException, NoSuchAlgorithmException, KeyManagementException, IOException {
    // Connect to the AMQP server.
    String schemeAndPath = location.toString().split("\\?")[0];
    ConnectionFactory factory = new ConnectionFactory();
    factory.setUri(schemeAndPath);
    conn = factory.newConnection();

    // Create the channel.
    chan = conn.createChannel();
  }
  
  public void reopenChannel() throws IOException {
    chan = conn.createChannel();
  }
  
  public void parseLocation() {
    locationParams = getQueryMap(location.getQuery());
  }
  
  public Channel getChannel() {
    return chan;
  }
  
  public Map<String, String> getLocationParams() {
    return locationParams;
  }
  
  public void close() throws IOException {
    try {
      chan.close();
      conn.close();
    } catch (ShutdownSignalException e) { }
  }
  
  public static Map<String, String> getQueryMap(String query) {
    String[] params = query.split("&");
    Map<String, String> map = new HashMap();
    for (String param : params) {
      String[] split = param.split("=");
      String name = split[0];
      String value = split.length >= 2 ? param.split("=")[1] : null;
      map.put(name, value);
    }
    return map;
  }
}
