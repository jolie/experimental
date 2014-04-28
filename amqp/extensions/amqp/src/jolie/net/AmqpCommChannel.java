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
public final class AmqpCommChannel extends StreamingCommChannel {

  // General.
  private final URI location;

  // For use in InputPort only.
  private AmqpMessage dataToProcess;

  // For use in OutputPort only.
  private CommMessage message = null;
  
  // From params.
  String exchName;
  String queueName;
  String routingKey;
  
  public AmqpCommChannel(URI location, CommProtocol protocol) throws IOException {
    super(location, protocol);
    this.location = location;
    
    exchName = locationParams().get("exchange");
    queueName = locationParams().get("queue");
    routingKey = locationParams().get("routingkey");
    routingKey = routingKey != null ? routingKey : "";

    setToBeClosed(false);
  }

  @Override
  protected CommMessage recvImpl() throws IOException {
    // Make protocol give us the bytes to send.
    ByteArrayOutputStream ostream = new ByteArrayOutputStream();
    CommMessage returnMessage;

    // If we have some data to process.
    // This would come from the AmqpListener class, and should only be if we are an InputPort.
    if (dataToProcess != null) {
      returnMessage = protocol().recv(new ByteArrayInputStream(dataToProcess.body), ostream);
      return returnMessage;
    }

    // Otherwise we just have a message, data is not present.
    // This would come from sendImpl below, and only if we are an OutputPort.
    if (message != null) {
      returnMessage = CommMessage.createResponse(message, Value.UNDEFINED_VALUE);
      message = null;
      return returnMessage;
    }

    // If we end up here, something is wrong.
    // The two cases above are the only ones we handle.
    throw new IOException("Wrong context for receive!");
  }

  @Override
  protected void sendImpl(CommMessage message) throws IOException {
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
        try {
          RpcClient rpc = new RpcClient(channel(), "", queueName);
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
      // If we have a reply-to queue, this is an RPC-call.
      if (dataToProcess.properties.getReplyTo() != null) {
        // Publish to reply-to queue.
        channel().basicPublish("", dataToProcess.properties.getReplyTo(), dataToProcess.properties, ostream.toByteArray());
      }
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
