/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jolie.net;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author michael
 */
public class AmqpConnectionHandler {
  private static final Map<URI, AmqpConnection> connections = new HashMap();
  
  public static AmqpConnection getConnection(URI location) throws IOException {
    // If not already connected, do this.
    if (!connections.containsKey(location)) {
      setConnection(location);
    }
    
    return connections.get(location);
  }
  
  private static void setConnection(URI location) throws IOException {
    connections.put(location, new AmqpConnection(location));
  }
  
  public static void closeConnection(URI location) throws IOException {
    connections.get(location).close();
    connections.remove(location);
  }
}
