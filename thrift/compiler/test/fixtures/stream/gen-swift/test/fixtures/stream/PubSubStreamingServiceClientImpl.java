/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.stream;

import com.facebook.nifty.client.RequestChannel;
import com.facebook.swift.codec.*;
import com.facebook.swift.service.*;
import com.facebook.swift.transport.client.RpcOptions;
import java.io.*;
import java.lang.reflect.Method;
import java.util.*;

@SwiftGenerated
public class PubSubStreamingServiceClientImpl extends AbstractThriftClient implements PubSubStreamingService {


    // Method Handlers
    private ThriftMethodHandler returnstreamMethodHandler;
    private ThriftMethodHandler streamthrowsMethodHandler;
    private ThriftMethodHandler boththrowsMethodHandler;
    private ThriftMethodHandler responseandstreamthrowsMethodHandler;

    // Method Exceptions
    private static final Class[] returnstreamExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] streamthrowsExceptions = new Class[] {
        org.apache.thrift.TException.class};
    private static final Class[] boththrowsExceptions = new Class[] {
        test.fixtures.stream.FooEx.class, org.apache.thrift.TException.class};
    private static final Class[] responseandstreamthrowsExceptions = new Class[] {
        test.fixtures.stream.FooEx.class, org.apache.thrift.TException.class};

    public PubSubStreamingServiceClientImpl(
        RequestChannel channel,
        Map<Method, ThriftMethodHandler> methods,
        Map<String, String> headers,
        Map<String, String> persistentHeaders,
        List<? extends ThriftClientEventHandler> eventHandlers) {
      super(channel, headers, persistentHeaders, eventHandlers);

      Map<String, ThriftMethodHandler> methodHandlerMap = new HashMap<>();
      methods.forEach(
          (key, value) -> {
            methodHandlerMap.put(key.getName(), value);
          });

      // Set method handlers
      returnstreamMethodHandler = methodHandlerMap.get("returnstream");
      streamthrowsMethodHandler = methodHandlerMap.get("streamthrows");
      boththrowsMethodHandler = methodHandlerMap.get("boththrows");
      responseandstreamthrowsMethodHandler = methodHandlerMap.get("responseandstreamthrows");
    }

    @Override
    public void close() {
        super.close();
    }


}