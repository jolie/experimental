package jolie.net;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.RpcClient;
import com.rabbitmq.client.ShutdownSignalException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/**
 * Class for handling a connection.
 * @author Claus Lindquist Henriksen (clih@itu.dk).
 * @author Michael Søby Andersen (msoa@itu.dk).
 */
public final class AmqpConnection {
  private Connection conn;
  private Channel chan;
  
  private final URI location;
  private Map<String, String> locationParams;
  private Map<String, RpcClient> rpcs = new HashMap();
  
  public AmqpConnection(URI location) throws IOException {
    this.location = location;
    
    parseLocation();
    try {
      connect();
    } catch (URISyntaxException | NoSuchAlgorithmException | KeyManagementException | IOException ex) {
      throw new IOException("Error during connect", ex);
    }
  }
  
  /**
   * Connect to the location specified.
   * @throws URISyntaxException
   * @throws NoSuchAlgorithmException
   * @throws KeyManagementException
   * @throws IOException 
   */
  public void connect() throws URISyntaxException, NoSuchAlgorithmException, KeyManagementException, IOException {
    // Connect to the AMQP server.
    String schemeAndPath = location.toString().split("\\?")[0];
    ConnectionFactory factory = new ConnectionFactory();
    factory.setUri(schemeAndPath);
    conn = factory.newConnection();

    // Create the channel.
    chan = conn.createChannel();
  }
  
  /**
   * Reopen the channel. Some exceptions close the channel, and we need to be able to reopen it.
   * @throws IOException 
   */
  public void reopenChannel() throws IOException {
    chan = conn.createChannel();
  }
  
  /**
   * Parse the location to a key/value map.
   */
  public void parseLocation() {
    locationParams = getQueryMap(location.getQuery());
  }
  
  /**
   * Get the channel associated with the connection.
   * @return The channel.
   */
  public Channel getChannel() {
    return chan;
  }
  
  /**
   * Get the map of location parameters.
   * @return The map of parameters.
   */
  public Map<String, String> getLocationParams() {
    return locationParams;
  }
  
  /**
   * Close the connection.
   * @throws IOException 
   */
  public void close() throws IOException {
    try {
      chan.close();
      conn.close();
    } catch (ShutdownSignalException e) { }
  }

  /**
   * Get the RPC client for the queue on this connection. If not already initialized, do it.
   * @param queueName The name of the queue for the client.
   * @return The RpcClient object.
   * @throws IOException 
   */
  public RpcClient getRpcClient(String queueName) throws IOException {
    if (rpcs.get(queueName) == null) {
      rpcs.put(queueName, new RpcClient(chan, "", queueName));
    }
    return this.rpcs.get(queueName);
  }
  
  /**
   * Parse a location to a map of keys to values.
   * @param query The query string to parse.
   * @return The map of key/value pairs.
   */
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
