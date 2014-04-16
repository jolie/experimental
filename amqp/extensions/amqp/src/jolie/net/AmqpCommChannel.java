/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jolie.net;

import com.rabbitmq.client.Channel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import jolie.net.ports.OutputPort;
import jolie.net.protocols.CommProtocol;
import jolie.runtime.Value;
import com.rabbitmq.client.RpcClient;
import com.rabbitmq.client.ShutdownSignalException;
import java.util.concurrent.TimeoutException;
import jolie.net.ports.InputPort;

/**
 *
 * @author Claus Lindquist Henriksen & Michael Søby Andersen.
 */
public class AmqpCommChannel extends StreamingCommChannel {

  // General.
  private final URI location;

  // For use in InputPort only.
  private AmqpMessage dataToProcess;

  // For use in OutputPort only.
  private CommMessage message = null;
  
  public AmqpCommChannel(URI location, CommProtocol protocol) throws IOException {
    super(location, protocol);
    this.location = location;

    setToBeClosed(false);
  }

  @Override
  protected CommMessage recvImpl() throws IOException {
    
    // Make protocol give us the bytes to send.
    ByteArrayOutputStream ostream = new ByteArrayOutputStream();
    CommMessage returnMessage;

    // If we have some data to process.
    if (dataToProcess != null) {
      returnMessage = protocol().recv(new ByteArrayInputStream(dataToProcess.body), ostream);
      return returnMessage;
    }

    // Otherwise we just have a message, data is not present.
    if (message != null) {
      returnMessage = CommMessage.createResponse(message, Value.UNDEFINED_VALUE);
      message = null;
      return returnMessage;
    }

    // If we end up here, something is wrong.
    throw new IOException("Wrong context for receive!");
  }

  @Override
  protected void sendImpl(CommMessage message) throws IOException {
    String exchName = locationParams().get("exchange");
    String routingKey = locationParams().get("routingkey");
    routingKey = routingKey != null ? routingKey : "";
      
    // Make protocol give us the bytes to send.
    ByteArrayOutputStream ostream = new ByteArrayOutputStream();
    protocol().send(ostream, message, null);
        
    this.message = message;
          
    // If from OutputPort.
    if (parentPort() instanceof OutputPort) {
      
      // Check if this is an RPC call.
      boolean isRpc = parentPort().getOperationTypeDescription(message.operationName(), message.resourcePath()).asRequestResponseTypeDescription() != null;
      if (isRpc) {
        // Send the call, getting bytearray back.
        RpcClient rpc = new RpcClient(channel(), exchName, routingKey);
        try {
          dataToProcess = new AmqpMessage(null, rpc.primitiveCall(ostream.toByteArray()), null);
        } catch (ShutdownSignalException | TimeoutException ex) {
          throw new IOException("Timeout for RPC call", ex);
        }
      }
      else {
        // Else we just publish normally.
        channel().basicPublish(exchName, routingKey, null, ostream.toByteArray());
      }
    }
    
    // If from InputPort. We assume that we have something to send back to caller.
    else if (parentPort() instanceof InputPort) {
      boolean isRpc = dataToProcess != null && dataToProcess.properties != null && dataToProcess.properties.getReplyTo() != null;
      // If this recv is from an RPC call.
      if (isRpc) {
        RpcClient rpc = new RpcClient(channel(), exchName, routingKey);
        
        // Reply to RPC call.
        rpc.publish(dataToProcess.properties, ostream.toByteArray());
      }
      
      acknowledge(dataToProcess.envelope.getDeliveryTag());
      dataToProcess = null;
    }
    
    // Something went wrong.
    else {
      throw new IOException("Port is of unexpected type!");
    }
  }

  @Override
  protected void closeImpl() throws IOException {
    AmqpConnectionHandler.closeConnection(location);
  }
  
  public void setDataToProcess(AmqpMessage message) {
    this.dataToProcess = message;
  }
  
  public void acknowledge(long deliveryTag) throws IOException {
    // Don't know why 2nd parameter is false, and API is no help.
    channel().basicAck(deliveryTag, false);
  }
  
  public Channel channel() throws IOException {
    return AmqpConnectionHandler.getConnection(location).getChannel();
  }
  
  public Map<String, String> locationParams() throws IOException {
    return AmqpConnectionHandler.getConnection(location).getLocationParams();
  }
}
