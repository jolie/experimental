/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jolie.net;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.ByteArrayInputStream;
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
import jolie.net.ports.OutputPort;
import jolie.net.protocols.CommProtocol;
import jolie.runtime.Value;

/**
 *
 * @author Claus Lindquist Henriksen & Michael Søby Andersen.
 */
public class AmqpCommChannel extends StreamingCommChannel {

  // General.
  private Connection conn;
  private Channel chan;
  private URI location;
  private Map<String, String> locationParams;

  // For use in InputPort only.
  private byte[] dataToProcess;

  // For use in OutputPort only.
  private CommMessage message = null;

  public AmqpCommChannel(URI location, CommProtocol protocol) throws IOException {
    super(location, protocol);
    this.location = location;

    connect();
  }

  @Override
  protected CommMessage recvImpl() throws IOException {
    // Make protocol give us the bytes to send.
    ByteArrayOutputStream ostream = new ByteArrayOutputStream();
    CommMessage returnMessage;
    if (dataToProcess != null) {
      returnMessage = protocol().recv(new ByteArrayInputStream(dataToProcess), ostream);
      dataToProcess = null;
      return returnMessage;
    } else if (message != null) {
      returnMessage = CommMessage.createResponse(message, Value.UNDEFINED_VALUE);
      message = null;
      return returnMessage;
    } else {
      throw new IOException("Wrong context for receive!");
    }
  }

  @Override
  protected void sendImpl(CommMessage message) throws IOException {
    if (parentPort() instanceof OutputPort) {
      // Make protocol give us the bytes to send.
      ByteArrayOutputStream ostream = new ByteArrayOutputStream();

      protocol().send(ostream, message, null);

      String exchName = locationParams.get("exchange");
      String routingKey = locationParams.get("routingkey");
      routingKey = routingKey != null ? routingKey : "";
      this.message = message;

      chan.basicPublish(exchName, routingKey, null, ostream.toByteArray());
    }
  }

  @Override
  protected void closeImpl() throws IOException {
    chan.close();
    conn.close();
  }

  public static Map<String, String> getQueryMap(String query) {
    String[] params = query.split("&");
    Map<String, String> map = new HashMap();
    for (String param : params) {
      String name = param.split("=")[0];
      String value = param.split("=")[1];
      map.put(name, value);
    }
    return map;
  }

  private void connect() throws IOException {
    try {
      // Parse parameters from url.
      locationParams = getQueryMap(location.getQuery());

      // Connect to the AMQP server.
      String schemeAndPath = location.toString().split("\\?")[0];
      ConnectionFactory factory = new ConnectionFactory();
      factory.setUri(schemeAndPath);
      conn = factory.newConnection();

      // Create the channel.
      chan = conn.createChannel();

      // AMQP-connections are persistent.
      setToBeClosed(false);
    } catch (URISyntaxException | NoSuchAlgorithmException | KeyManagementException ex) {
      Logger.getLogger(AmqpCommChannel.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public Channel getChannel() {
    return chan;
  }

  public Map<String, String> getLocationParams() {
    return locationParams;
  }

  public void setDataToProcess(byte[] data) {
    this.dataToProcess = data;
  }
  
  public void close() throws IOException {
    closeImpl();
  }
}
