package ai.h2o.deepwater.backends.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.2)",
    comments = "Source: grpc_service.proto")
public class DeepWaterTrainBackendGrpc {

  private DeepWaterTrainBackendGrpc() {}

  public static final String SERVICE_NAME = "deepwater.DeepWaterTrainBackend";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ai.h2o.deepwater.backends.grpc.CreateModelRequest,
      ai.h2o.deepwater.backends.grpc.CreateModelResponse> METHOD_CREATE_MODEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "deepwater.DeepWaterTrainBackend", "CreateModel"),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.CreateModelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.CreateModelResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ai.h2o.deepwater.backends.grpc.CreateSessionRequest,
      ai.h2o.deepwater.backends.grpc.CreateSessionResponse> METHOD_CREATE_SESSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "deepwater.DeepWaterTrainBackend", "CreateSession"),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.CreateSessionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.CreateSessionResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ai.h2o.deepwater.backends.grpc.DeleteSessionRequest,
      ai.h2o.deepwater.backends.grpc.Status> METHOD_DELETE_SESSION =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "deepwater.DeepWaterTrainBackend", "DeleteSession"),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.DeleteSessionRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.Status.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ai.h2o.deepwater.backends.grpc.LoadModelRequest,
      ai.h2o.deepwater.backends.grpc.Status> METHOD_LOAD_MODEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "deepwater.DeepWaterTrainBackend", "LoadModel"),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.LoadModelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.Status.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ai.h2o.deepwater.backends.grpc.SaveModelRequest,
      ai.h2o.deepwater.backends.grpc.Status> METHOD_SAVE_MODEL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "deepwater.DeepWaterTrainBackend", "SaveModel"),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.SaveModelRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.Status.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ai.h2o.deepwater.backends.grpc.LoadWeightsRequest,
      ai.h2o.deepwater.backends.grpc.Status> METHOD_LOAD_WEIGHTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "deepwater.DeepWaterTrainBackend", "LoadWeights"),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.LoadWeightsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.Status.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ai.h2o.deepwater.backends.grpc.SaveWeightsRequest,
      ai.h2o.deepwater.backends.grpc.Status> METHOD_SAVE_WEIGHTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "deepwater.DeepWaterTrainBackend", "SaveWeights"),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.SaveWeightsRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.Status.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ai.h2o.deepwater.backends.grpc.SetParametersRequest,
      ai.h2o.deepwater.backends.grpc.SetParametersResponse> METHOD_SET_PARAMETERS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "deepwater.DeepWaterTrainBackend", "SetParameters"),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.SetParametersRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.SetParametersResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ai.h2o.deepwater.backends.grpc.ExecuteRequest,
      ai.h2o.deepwater.backends.grpc.ExecuteResponse> METHOD_EXECUTE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "deepwater.DeepWaterTrainBackend", "Execute"),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.ExecuteRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ai.h2o.deepwater.backends.grpc.ExecuteResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeepWaterTrainBackendStub newStub(io.grpc.Channel channel) {
    return new DeepWaterTrainBackendStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeepWaterTrainBackendBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeepWaterTrainBackendBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static DeepWaterTrainBackendFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeepWaterTrainBackendFutureStub(channel);
  }

  /**
   */
  public static abstract class DeepWaterTrainBackendImplBase implements io.grpc.BindableService {

    /**
     */
    public void createModel(ai.h2o.deepwater.backends.grpc.CreateModelRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.CreateModelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_MODEL, responseObserver);
    }

    /**
     */
    public void createSession(ai.h2o.deepwater.backends.grpc.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.CreateSessionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_SESSION, responseObserver);
    }

    /**
     */
    public void deleteSession(ai.h2o.deepwater.backends.grpc.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE_SESSION, responseObserver);
    }

    /**
     */
    public void loadModel(ai.h2o.deepwater.backends.grpc.LoadModelRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOAD_MODEL, responseObserver);
    }

    /**
     */
    public void saveModel(ai.h2o.deepwater.backends.grpc.SaveModelRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_MODEL, responseObserver);
    }

    /**
     */
    public void loadWeights(ai.h2o.deepwater.backends.grpc.LoadWeightsRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOAD_WEIGHTS, responseObserver);
    }

    /**
     */
    public void saveWeights(ai.h2o.deepwater.backends.grpc.SaveWeightsRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_WEIGHTS, responseObserver);
    }

    /**
     */
    public void setParameters(ai.h2o.deepwater.backends.grpc.SetParametersRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.SetParametersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_PARAMETERS, responseObserver);
    }

    /**
     */
    public void execute(ai.h2o.deepwater.backends.grpc.ExecuteRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.ExecuteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_MODEL,
            asyncUnaryCall(
              new MethodHandlers<
                ai.h2o.deepwater.backends.grpc.CreateModelRequest,
                ai.h2o.deepwater.backends.grpc.CreateModelResponse>(
                  this, METHODID_CREATE_MODEL)))
          .addMethod(
            METHOD_CREATE_SESSION,
            asyncUnaryCall(
              new MethodHandlers<
                ai.h2o.deepwater.backends.grpc.CreateSessionRequest,
                ai.h2o.deepwater.backends.grpc.CreateSessionResponse>(
                  this, METHODID_CREATE_SESSION)))
          .addMethod(
            METHOD_DELETE_SESSION,
            asyncUnaryCall(
              new MethodHandlers<
                ai.h2o.deepwater.backends.grpc.DeleteSessionRequest,
                ai.h2o.deepwater.backends.grpc.Status>(
                  this, METHODID_DELETE_SESSION)))
          .addMethod(
            METHOD_LOAD_MODEL,
            asyncUnaryCall(
              new MethodHandlers<
                ai.h2o.deepwater.backends.grpc.LoadModelRequest,
                ai.h2o.deepwater.backends.grpc.Status>(
                  this, METHODID_LOAD_MODEL)))
          .addMethod(
            METHOD_SAVE_MODEL,
            asyncUnaryCall(
              new MethodHandlers<
                ai.h2o.deepwater.backends.grpc.SaveModelRequest,
                ai.h2o.deepwater.backends.grpc.Status>(
                  this, METHODID_SAVE_MODEL)))
          .addMethod(
            METHOD_LOAD_WEIGHTS,
            asyncUnaryCall(
              new MethodHandlers<
                ai.h2o.deepwater.backends.grpc.LoadWeightsRequest,
                ai.h2o.deepwater.backends.grpc.Status>(
                  this, METHODID_LOAD_WEIGHTS)))
          .addMethod(
            METHOD_SAVE_WEIGHTS,
            asyncUnaryCall(
              new MethodHandlers<
                ai.h2o.deepwater.backends.grpc.SaveWeightsRequest,
                ai.h2o.deepwater.backends.grpc.Status>(
                  this, METHODID_SAVE_WEIGHTS)))
          .addMethod(
            METHOD_SET_PARAMETERS,
            asyncUnaryCall(
              new MethodHandlers<
                ai.h2o.deepwater.backends.grpc.SetParametersRequest,
                ai.h2o.deepwater.backends.grpc.SetParametersResponse>(
                  this, METHODID_SET_PARAMETERS)))
          .addMethod(
            METHOD_EXECUTE,
            asyncUnaryCall(
              new MethodHandlers<
                ai.h2o.deepwater.backends.grpc.ExecuteRequest,
                ai.h2o.deepwater.backends.grpc.ExecuteResponse>(
                  this, METHODID_EXECUTE)))
          .build();
    }
  }

  /**
   */
  public static final class DeepWaterTrainBackendStub extends io.grpc.stub.AbstractStub<DeepWaterTrainBackendStub> {
    private DeepWaterTrainBackendStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeepWaterTrainBackendStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeepWaterTrainBackendStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeepWaterTrainBackendStub(channel, callOptions);
    }

    /**
     */
    public void createModel(ai.h2o.deepwater.backends.grpc.CreateModelRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.CreateModelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_MODEL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSession(ai.h2o.deepwater.backends.grpc.CreateSessionRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.CreateSessionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_SESSION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSession(ai.h2o.deepwater.backends.grpc.DeleteSessionRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE_SESSION, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadModel(ai.h2o.deepwater.backends.grpc.LoadModelRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOAD_MODEL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveModel(ai.h2o.deepwater.backends.grpc.SaveModelRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_MODEL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadWeights(ai.h2o.deepwater.backends.grpc.LoadWeightsRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOAD_WEIGHTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveWeights(ai.h2o.deepwater.backends.grpc.SaveWeightsRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_WEIGHTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setParameters(ai.h2o.deepwater.backends.grpc.SetParametersRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.SetParametersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_PARAMETERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void execute(ai.h2o.deepwater.backends.grpc.ExecuteRequest request,
        io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.ExecuteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXECUTE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeepWaterTrainBackendBlockingStub extends io.grpc.stub.AbstractStub<DeepWaterTrainBackendBlockingStub> {
    private DeepWaterTrainBackendBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeepWaterTrainBackendBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeepWaterTrainBackendBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeepWaterTrainBackendBlockingStub(channel, callOptions);
    }

    /**
     */
    public ai.h2o.deepwater.backends.grpc.CreateModelResponse createModel(ai.h2o.deepwater.backends.grpc.CreateModelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_MODEL, getCallOptions(), request);
    }

    /**
     */
    public ai.h2o.deepwater.backends.grpc.CreateSessionResponse createSession(ai.h2o.deepwater.backends.grpc.CreateSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_SESSION, getCallOptions(), request);
    }

    /**
     */
    public ai.h2o.deepwater.backends.grpc.Status deleteSession(ai.h2o.deepwater.backends.grpc.DeleteSessionRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE_SESSION, getCallOptions(), request);
    }

    /**
     */
    public ai.h2o.deepwater.backends.grpc.Status loadModel(ai.h2o.deepwater.backends.grpc.LoadModelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOAD_MODEL, getCallOptions(), request);
    }

    /**
     */
    public ai.h2o.deepwater.backends.grpc.Status saveModel(ai.h2o.deepwater.backends.grpc.SaveModelRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_MODEL, getCallOptions(), request);
    }

    /**
     */
    public ai.h2o.deepwater.backends.grpc.Status loadWeights(ai.h2o.deepwater.backends.grpc.LoadWeightsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOAD_WEIGHTS, getCallOptions(), request);
    }

    /**
     */
    public ai.h2o.deepwater.backends.grpc.Status saveWeights(ai.h2o.deepwater.backends.grpc.SaveWeightsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_WEIGHTS, getCallOptions(), request);
    }

    /**
     */
    public ai.h2o.deepwater.backends.grpc.SetParametersResponse setParameters(ai.h2o.deepwater.backends.grpc.SetParametersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_PARAMETERS, getCallOptions(), request);
    }

    /**
     */
    public ai.h2o.deepwater.backends.grpc.ExecuteResponse execute(ai.h2o.deepwater.backends.grpc.ExecuteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXECUTE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeepWaterTrainBackendFutureStub extends io.grpc.stub.AbstractStub<DeepWaterTrainBackendFutureStub> {
    private DeepWaterTrainBackendFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeepWaterTrainBackendFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeepWaterTrainBackendFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeepWaterTrainBackendFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.h2o.deepwater.backends.grpc.CreateModelResponse> createModel(
        ai.h2o.deepwater.backends.grpc.CreateModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_MODEL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.h2o.deepwater.backends.grpc.CreateSessionResponse> createSession(
        ai.h2o.deepwater.backends.grpc.CreateSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_SESSION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.h2o.deepwater.backends.grpc.Status> deleteSession(
        ai.h2o.deepwater.backends.grpc.DeleteSessionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE_SESSION, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.h2o.deepwater.backends.grpc.Status> loadModel(
        ai.h2o.deepwater.backends.grpc.LoadModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOAD_MODEL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.h2o.deepwater.backends.grpc.Status> saveModel(
        ai.h2o.deepwater.backends.grpc.SaveModelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_MODEL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.h2o.deepwater.backends.grpc.Status> loadWeights(
        ai.h2o.deepwater.backends.grpc.LoadWeightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOAD_WEIGHTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.h2o.deepwater.backends.grpc.Status> saveWeights(
        ai.h2o.deepwater.backends.grpc.SaveWeightsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_WEIGHTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.h2o.deepwater.backends.grpc.SetParametersResponse> setParameters(
        ai.h2o.deepwater.backends.grpc.SetParametersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_PARAMETERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.h2o.deepwater.backends.grpc.ExecuteResponse> execute(
        ai.h2o.deepwater.backends.grpc.ExecuteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXECUTE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MODEL = 0;
  private static final int METHODID_CREATE_SESSION = 1;
  private static final int METHODID_DELETE_SESSION = 2;
  private static final int METHODID_LOAD_MODEL = 3;
  private static final int METHODID_SAVE_MODEL = 4;
  private static final int METHODID_LOAD_WEIGHTS = 5;
  private static final int METHODID_SAVE_WEIGHTS = 6;
  private static final int METHODID_SET_PARAMETERS = 7;
  private static final int METHODID_EXECUTE = 8;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeepWaterTrainBackendImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(DeepWaterTrainBackendImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MODEL:
          serviceImpl.createModel((ai.h2o.deepwater.backends.grpc.CreateModelRequest) request,
              (io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.CreateModelResponse>) responseObserver);
          break;
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((ai.h2o.deepwater.backends.grpc.CreateSessionRequest) request,
              (io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.CreateSessionResponse>) responseObserver);
          break;
        case METHODID_DELETE_SESSION:
          serviceImpl.deleteSession((ai.h2o.deepwater.backends.grpc.DeleteSessionRequest) request,
              (io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status>) responseObserver);
          break;
        case METHODID_LOAD_MODEL:
          serviceImpl.loadModel((ai.h2o.deepwater.backends.grpc.LoadModelRequest) request,
              (io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status>) responseObserver);
          break;
        case METHODID_SAVE_MODEL:
          serviceImpl.saveModel((ai.h2o.deepwater.backends.grpc.SaveModelRequest) request,
              (io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status>) responseObserver);
          break;
        case METHODID_LOAD_WEIGHTS:
          serviceImpl.loadWeights((ai.h2o.deepwater.backends.grpc.LoadWeightsRequest) request,
              (io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status>) responseObserver);
          break;
        case METHODID_SAVE_WEIGHTS:
          serviceImpl.saveWeights((ai.h2o.deepwater.backends.grpc.SaveWeightsRequest) request,
              (io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.Status>) responseObserver);
          break;
        case METHODID_SET_PARAMETERS:
          serviceImpl.setParameters((ai.h2o.deepwater.backends.grpc.SetParametersRequest) request,
              (io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.SetParametersResponse>) responseObserver);
          break;
        case METHODID_EXECUTE:
          serviceImpl.execute((ai.h2o.deepwater.backends.grpc.ExecuteRequest) request,
              (io.grpc.stub.StreamObserver<ai.h2o.deepwater.backends.grpc.ExecuteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CREATE_MODEL,
        METHOD_CREATE_SESSION,
        METHOD_DELETE_SESSION,
        METHOD_LOAD_MODEL,
        METHOD_SAVE_MODEL,
        METHOD_LOAD_WEIGHTS,
        METHOD_SAVE_WEIGHTS,
        METHOD_SET_PARAMETERS,
        METHOD_EXECUTE);
  }

}