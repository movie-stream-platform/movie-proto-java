package com.movieplatform.proto.playback;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Streaming and playback management service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: playback/playback_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PlaybackServiceGrpc {

  private PlaybackServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.playback.PlaybackService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.CreatePlaybackSessionRequest,
      com.movieplatform.proto.playback.CreatePlaybackSessionResponse> getCreatePlaybackSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePlaybackSession",
      requestType = com.movieplatform.proto.playback.CreatePlaybackSessionRequest.class,
      responseType = com.movieplatform.proto.playback.CreatePlaybackSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.CreatePlaybackSessionRequest,
      com.movieplatform.proto.playback.CreatePlaybackSessionResponse> getCreatePlaybackSessionMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.CreatePlaybackSessionRequest, com.movieplatform.proto.playback.CreatePlaybackSessionResponse> getCreatePlaybackSessionMethod;
    if ((getCreatePlaybackSessionMethod = PlaybackServiceGrpc.getCreatePlaybackSessionMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getCreatePlaybackSessionMethod = PlaybackServiceGrpc.getCreatePlaybackSessionMethod) == null) {
          PlaybackServiceGrpc.getCreatePlaybackSessionMethod = getCreatePlaybackSessionMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.CreatePlaybackSessionRequest, com.movieplatform.proto.playback.CreatePlaybackSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePlaybackSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.CreatePlaybackSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.CreatePlaybackSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("CreatePlaybackSession"))
              .build();
        }
      }
    }
    return getCreatePlaybackSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackSessionRequest,
      com.movieplatform.proto.playback.GetPlaybackSessionResponse> getGetPlaybackSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlaybackSession",
      requestType = com.movieplatform.proto.playback.GetPlaybackSessionRequest.class,
      responseType = com.movieplatform.proto.playback.GetPlaybackSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackSessionRequest,
      com.movieplatform.proto.playback.GetPlaybackSessionResponse> getGetPlaybackSessionMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackSessionRequest, com.movieplatform.proto.playback.GetPlaybackSessionResponse> getGetPlaybackSessionMethod;
    if ((getGetPlaybackSessionMethod = PlaybackServiceGrpc.getGetPlaybackSessionMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetPlaybackSessionMethod = PlaybackServiceGrpc.getGetPlaybackSessionMethod) == null) {
          PlaybackServiceGrpc.getGetPlaybackSessionMethod = getGetPlaybackSessionMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetPlaybackSessionRequest, com.movieplatform.proto.playback.GetPlaybackSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlaybackSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetPlaybackSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetPlaybackSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetPlaybackSession"))
              .build();
        }
      }
    }
    return getGetPlaybackSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.UpdatePlaybackSessionRequest,
      com.movieplatform.proto.playback.UpdatePlaybackSessionResponse> getUpdatePlaybackSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePlaybackSession",
      requestType = com.movieplatform.proto.playback.UpdatePlaybackSessionRequest.class,
      responseType = com.movieplatform.proto.playback.UpdatePlaybackSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.UpdatePlaybackSessionRequest,
      com.movieplatform.proto.playback.UpdatePlaybackSessionResponse> getUpdatePlaybackSessionMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.UpdatePlaybackSessionRequest, com.movieplatform.proto.playback.UpdatePlaybackSessionResponse> getUpdatePlaybackSessionMethod;
    if ((getUpdatePlaybackSessionMethod = PlaybackServiceGrpc.getUpdatePlaybackSessionMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getUpdatePlaybackSessionMethod = PlaybackServiceGrpc.getUpdatePlaybackSessionMethod) == null) {
          PlaybackServiceGrpc.getUpdatePlaybackSessionMethod = getUpdatePlaybackSessionMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.UpdatePlaybackSessionRequest, com.movieplatform.proto.playback.UpdatePlaybackSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePlaybackSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.UpdatePlaybackSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.UpdatePlaybackSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("UpdatePlaybackSession"))
              .build();
        }
      }
    }
    return getUpdatePlaybackSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.EndPlaybackSessionRequest,
      com.movieplatform.proto.playback.EndPlaybackSessionResponse> getEndPlaybackSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndPlaybackSession",
      requestType = com.movieplatform.proto.playback.EndPlaybackSessionRequest.class,
      responseType = com.movieplatform.proto.playback.EndPlaybackSessionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.EndPlaybackSessionRequest,
      com.movieplatform.proto.playback.EndPlaybackSessionResponse> getEndPlaybackSessionMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.EndPlaybackSessionRequest, com.movieplatform.proto.playback.EndPlaybackSessionResponse> getEndPlaybackSessionMethod;
    if ((getEndPlaybackSessionMethod = PlaybackServiceGrpc.getEndPlaybackSessionMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getEndPlaybackSessionMethod = PlaybackServiceGrpc.getEndPlaybackSessionMethod) == null) {
          PlaybackServiceGrpc.getEndPlaybackSessionMethod = getEndPlaybackSessionMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.EndPlaybackSessionRequest, com.movieplatform.proto.playback.EndPlaybackSessionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndPlaybackSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.EndPlaybackSessionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.EndPlaybackSessionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("EndPlaybackSession"))
              .build();
        }
      }
    }
    return getEndPlaybackSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.StartPlaybackRequest,
      com.movieplatform.proto.playback.StartPlaybackResponse> getStartPlaybackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartPlayback",
      requestType = com.movieplatform.proto.playback.StartPlaybackRequest.class,
      responseType = com.movieplatform.proto.playback.StartPlaybackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.StartPlaybackRequest,
      com.movieplatform.proto.playback.StartPlaybackResponse> getStartPlaybackMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.StartPlaybackRequest, com.movieplatform.proto.playback.StartPlaybackResponse> getStartPlaybackMethod;
    if ((getStartPlaybackMethod = PlaybackServiceGrpc.getStartPlaybackMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getStartPlaybackMethod = PlaybackServiceGrpc.getStartPlaybackMethod) == null) {
          PlaybackServiceGrpc.getStartPlaybackMethod = getStartPlaybackMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.StartPlaybackRequest, com.movieplatform.proto.playback.StartPlaybackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartPlayback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.StartPlaybackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.StartPlaybackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("StartPlayback"))
              .build();
        }
      }
    }
    return getStartPlaybackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.PausePlaybackRequest,
      com.movieplatform.proto.playback.PausePlaybackResponse> getPausePlaybackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PausePlayback",
      requestType = com.movieplatform.proto.playback.PausePlaybackRequest.class,
      responseType = com.movieplatform.proto.playback.PausePlaybackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.PausePlaybackRequest,
      com.movieplatform.proto.playback.PausePlaybackResponse> getPausePlaybackMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.PausePlaybackRequest, com.movieplatform.proto.playback.PausePlaybackResponse> getPausePlaybackMethod;
    if ((getPausePlaybackMethod = PlaybackServiceGrpc.getPausePlaybackMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getPausePlaybackMethod = PlaybackServiceGrpc.getPausePlaybackMethod) == null) {
          PlaybackServiceGrpc.getPausePlaybackMethod = getPausePlaybackMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.PausePlaybackRequest, com.movieplatform.proto.playback.PausePlaybackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PausePlayback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.PausePlaybackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.PausePlaybackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("PausePlayback"))
              .build();
        }
      }
    }
    return getPausePlaybackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ResumePlaybackRequest,
      com.movieplatform.proto.playback.ResumePlaybackResponse> getResumePlaybackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumePlayback",
      requestType = com.movieplatform.proto.playback.ResumePlaybackRequest.class,
      responseType = com.movieplatform.proto.playback.ResumePlaybackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ResumePlaybackRequest,
      com.movieplatform.proto.playback.ResumePlaybackResponse> getResumePlaybackMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ResumePlaybackRequest, com.movieplatform.proto.playback.ResumePlaybackResponse> getResumePlaybackMethod;
    if ((getResumePlaybackMethod = PlaybackServiceGrpc.getResumePlaybackMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getResumePlaybackMethod = PlaybackServiceGrpc.getResumePlaybackMethod) == null) {
          PlaybackServiceGrpc.getResumePlaybackMethod = getResumePlaybackMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.ResumePlaybackRequest, com.movieplatform.proto.playback.ResumePlaybackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResumePlayback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.ResumePlaybackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.ResumePlaybackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("ResumePlayback"))
              .build();
        }
      }
    }
    return getResumePlaybackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.StopPlaybackRequest,
      com.movieplatform.proto.playback.StopPlaybackResponse> getStopPlaybackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopPlayback",
      requestType = com.movieplatform.proto.playback.StopPlaybackRequest.class,
      responseType = com.movieplatform.proto.playback.StopPlaybackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.StopPlaybackRequest,
      com.movieplatform.proto.playback.StopPlaybackResponse> getStopPlaybackMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.StopPlaybackRequest, com.movieplatform.proto.playback.StopPlaybackResponse> getStopPlaybackMethod;
    if ((getStopPlaybackMethod = PlaybackServiceGrpc.getStopPlaybackMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getStopPlaybackMethod = PlaybackServiceGrpc.getStopPlaybackMethod) == null) {
          PlaybackServiceGrpc.getStopPlaybackMethod = getStopPlaybackMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.StopPlaybackRequest, com.movieplatform.proto.playback.StopPlaybackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopPlayback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.StopPlaybackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.StopPlaybackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("StopPlayback"))
              .build();
        }
      }
    }
    return getStopPlaybackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.SeekPlaybackRequest,
      com.movieplatform.proto.playback.SeekPlaybackResponse> getSeekPlaybackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SeekPlayback",
      requestType = com.movieplatform.proto.playback.SeekPlaybackRequest.class,
      responseType = com.movieplatform.proto.playback.SeekPlaybackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.SeekPlaybackRequest,
      com.movieplatform.proto.playback.SeekPlaybackResponse> getSeekPlaybackMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.SeekPlaybackRequest, com.movieplatform.proto.playback.SeekPlaybackResponse> getSeekPlaybackMethod;
    if ((getSeekPlaybackMethod = PlaybackServiceGrpc.getSeekPlaybackMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getSeekPlaybackMethod = PlaybackServiceGrpc.getSeekPlaybackMethod) == null) {
          PlaybackServiceGrpc.getSeekPlaybackMethod = getSeekPlaybackMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.SeekPlaybackRequest, com.movieplatform.proto.playback.SeekPlaybackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SeekPlayback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.SeekPlaybackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.SeekPlaybackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("SeekPlayback"))
              .build();
        }
      }
    }
    return getSeekPlaybackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.UpdatePlaybackProgressRequest,
      com.movieplatform.proto.playback.UpdatePlaybackProgressResponse> getUpdatePlaybackProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePlaybackProgress",
      requestType = com.movieplatform.proto.playback.UpdatePlaybackProgressRequest.class,
      responseType = com.movieplatform.proto.playback.UpdatePlaybackProgressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.UpdatePlaybackProgressRequest,
      com.movieplatform.proto.playback.UpdatePlaybackProgressResponse> getUpdatePlaybackProgressMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.UpdatePlaybackProgressRequest, com.movieplatform.proto.playback.UpdatePlaybackProgressResponse> getUpdatePlaybackProgressMethod;
    if ((getUpdatePlaybackProgressMethod = PlaybackServiceGrpc.getUpdatePlaybackProgressMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getUpdatePlaybackProgressMethod = PlaybackServiceGrpc.getUpdatePlaybackProgressMethod) == null) {
          PlaybackServiceGrpc.getUpdatePlaybackProgressMethod = getUpdatePlaybackProgressMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.UpdatePlaybackProgressRequest, com.movieplatform.proto.playback.UpdatePlaybackProgressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePlaybackProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.UpdatePlaybackProgressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.UpdatePlaybackProgressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("UpdatePlaybackProgress"))
              .build();
        }
      }
    }
    return getUpdatePlaybackProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackProgressRequest,
      com.movieplatform.proto.playback.GetPlaybackProgressResponse> getGetPlaybackProgressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlaybackProgress",
      requestType = com.movieplatform.proto.playback.GetPlaybackProgressRequest.class,
      responseType = com.movieplatform.proto.playback.GetPlaybackProgressResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackProgressRequest,
      com.movieplatform.proto.playback.GetPlaybackProgressResponse> getGetPlaybackProgressMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackProgressRequest, com.movieplatform.proto.playback.GetPlaybackProgressResponse> getGetPlaybackProgressMethod;
    if ((getGetPlaybackProgressMethod = PlaybackServiceGrpc.getGetPlaybackProgressMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetPlaybackProgressMethod = PlaybackServiceGrpc.getGetPlaybackProgressMethod) == null) {
          PlaybackServiceGrpc.getGetPlaybackProgressMethod = getGetPlaybackProgressMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetPlaybackProgressRequest, com.movieplatform.proto.playback.GetPlaybackProgressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlaybackProgress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetPlaybackProgressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetPlaybackProgressResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetPlaybackProgress"))
              .build();
        }
      }
    }
    return getGetPlaybackProgressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackHistoryRequest,
      com.movieplatform.proto.playback.GetPlaybackHistoryResponse> getGetPlaybackHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlaybackHistory",
      requestType = com.movieplatform.proto.playback.GetPlaybackHistoryRequest.class,
      responseType = com.movieplatform.proto.playback.GetPlaybackHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackHistoryRequest,
      com.movieplatform.proto.playback.GetPlaybackHistoryResponse> getGetPlaybackHistoryMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackHistoryRequest, com.movieplatform.proto.playback.GetPlaybackHistoryResponse> getGetPlaybackHistoryMethod;
    if ((getGetPlaybackHistoryMethod = PlaybackServiceGrpc.getGetPlaybackHistoryMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetPlaybackHistoryMethod = PlaybackServiceGrpc.getGetPlaybackHistoryMethod) == null) {
          PlaybackServiceGrpc.getGetPlaybackHistoryMethod = getGetPlaybackHistoryMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetPlaybackHistoryRequest, com.movieplatform.proto.playback.GetPlaybackHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlaybackHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetPlaybackHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetPlaybackHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetPlaybackHistory"))
              .build();
        }
      }
    }
    return getGetPlaybackHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetAvailableQualitiesRequest,
      com.movieplatform.proto.playback.GetAvailableQualitiesResponse> getGetAvailableQualitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableQualities",
      requestType = com.movieplatform.proto.playback.GetAvailableQualitiesRequest.class,
      responseType = com.movieplatform.proto.playback.GetAvailableQualitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetAvailableQualitiesRequest,
      com.movieplatform.proto.playback.GetAvailableQualitiesResponse> getGetAvailableQualitiesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetAvailableQualitiesRequest, com.movieplatform.proto.playback.GetAvailableQualitiesResponse> getGetAvailableQualitiesMethod;
    if ((getGetAvailableQualitiesMethod = PlaybackServiceGrpc.getGetAvailableQualitiesMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetAvailableQualitiesMethod = PlaybackServiceGrpc.getGetAvailableQualitiesMethod) == null) {
          PlaybackServiceGrpc.getGetAvailableQualitiesMethod = getGetAvailableQualitiesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetAvailableQualitiesRequest, com.movieplatform.proto.playback.GetAvailableQualitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableQualities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetAvailableQualitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetAvailableQualitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetAvailableQualities"))
              .build();
        }
      }
    }
    return getGetAvailableQualitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ChangePlaybackQualityRequest,
      com.movieplatform.proto.playback.ChangePlaybackQualityResponse> getChangePlaybackQualityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangePlaybackQuality",
      requestType = com.movieplatform.proto.playback.ChangePlaybackQualityRequest.class,
      responseType = com.movieplatform.proto.playback.ChangePlaybackQualityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ChangePlaybackQualityRequest,
      com.movieplatform.proto.playback.ChangePlaybackQualityResponse> getChangePlaybackQualityMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ChangePlaybackQualityRequest, com.movieplatform.proto.playback.ChangePlaybackQualityResponse> getChangePlaybackQualityMethod;
    if ((getChangePlaybackQualityMethod = PlaybackServiceGrpc.getChangePlaybackQualityMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getChangePlaybackQualityMethod = PlaybackServiceGrpc.getChangePlaybackQualityMethod) == null) {
          PlaybackServiceGrpc.getChangePlaybackQualityMethod = getChangePlaybackQualityMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.ChangePlaybackQualityRequest, com.movieplatform.proto.playback.ChangePlaybackQualityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangePlaybackQuality"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.ChangePlaybackQualityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.ChangePlaybackQualityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("ChangePlaybackQuality"))
              .build();
        }
      }
    }
    return getChangePlaybackQualityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest,
      com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse> getGetAdaptiveBitrateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAdaptiveBitrateInfo",
      requestType = com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest.class,
      responseType = com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest,
      com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse> getGetAdaptiveBitrateInfoMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest, com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse> getGetAdaptiveBitrateInfoMethod;
    if ((getGetAdaptiveBitrateInfoMethod = PlaybackServiceGrpc.getGetAdaptiveBitrateInfoMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetAdaptiveBitrateInfoMethod = PlaybackServiceGrpc.getGetAdaptiveBitrateInfoMethod) == null) {
          PlaybackServiceGrpc.getGetAdaptiveBitrateInfoMethod = getGetAdaptiveBitrateInfoMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest, com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAdaptiveBitrateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetAdaptiveBitrateInfo"))
              .build();
        }
      }
    }
    return getGetAdaptiveBitrateInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetStreamingURLRequest,
      com.movieplatform.proto.playback.GetStreamingURLResponse> getGetStreamingURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStreamingURL",
      requestType = com.movieplatform.proto.playback.GetStreamingURLRequest.class,
      responseType = com.movieplatform.proto.playback.GetStreamingURLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetStreamingURLRequest,
      com.movieplatform.proto.playback.GetStreamingURLResponse> getGetStreamingURLMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetStreamingURLRequest, com.movieplatform.proto.playback.GetStreamingURLResponse> getGetStreamingURLMethod;
    if ((getGetStreamingURLMethod = PlaybackServiceGrpc.getGetStreamingURLMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetStreamingURLMethod = PlaybackServiceGrpc.getGetStreamingURLMethod) == null) {
          PlaybackServiceGrpc.getGetStreamingURLMethod = getGetStreamingURLMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetStreamingURLRequest, com.movieplatform.proto.playback.GetStreamingURLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStreamingURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetStreamingURLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetStreamingURLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetStreamingURL"))
              .build();
        }
      }
    }
    return getGetStreamingURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ValidateStreamingAccessRequest,
      com.movieplatform.proto.playback.ValidateStreamingAccessResponse> getValidateStreamingAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateStreamingAccess",
      requestType = com.movieplatform.proto.playback.ValidateStreamingAccessRequest.class,
      responseType = com.movieplatform.proto.playback.ValidateStreamingAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ValidateStreamingAccessRequest,
      com.movieplatform.proto.playback.ValidateStreamingAccessResponse> getValidateStreamingAccessMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ValidateStreamingAccessRequest, com.movieplatform.proto.playback.ValidateStreamingAccessResponse> getValidateStreamingAccessMethod;
    if ((getValidateStreamingAccessMethod = PlaybackServiceGrpc.getValidateStreamingAccessMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getValidateStreamingAccessMethod = PlaybackServiceGrpc.getValidateStreamingAccessMethod) == null) {
          PlaybackServiceGrpc.getValidateStreamingAccessMethod = getValidateStreamingAccessMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.ValidateStreamingAccessRequest, com.movieplatform.proto.playback.ValidateStreamingAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateStreamingAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.ValidateStreamingAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.ValidateStreamingAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("ValidateStreamingAccess"))
              .build();
        }
      }
    }
    return getValidateStreamingAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetStreamingMetricsRequest,
      com.movieplatform.proto.playback.GetStreamingMetricsResponse> getGetStreamingMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStreamingMetrics",
      requestType = com.movieplatform.proto.playback.GetStreamingMetricsRequest.class,
      responseType = com.movieplatform.proto.playback.GetStreamingMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetStreamingMetricsRequest,
      com.movieplatform.proto.playback.GetStreamingMetricsResponse> getGetStreamingMetricsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetStreamingMetricsRequest, com.movieplatform.proto.playback.GetStreamingMetricsResponse> getGetStreamingMetricsMethod;
    if ((getGetStreamingMetricsMethod = PlaybackServiceGrpc.getGetStreamingMetricsMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetStreamingMetricsMethod = PlaybackServiceGrpc.getGetStreamingMetricsMethod) == null) {
          PlaybackServiceGrpc.getGetStreamingMetricsMethod = getGetStreamingMetricsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetStreamingMetricsRequest, com.movieplatform.proto.playback.GetStreamingMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStreamingMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetStreamingMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetStreamingMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetStreamingMetrics"))
              .build();
        }
      }
    }
    return getGetStreamingMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.TrackPlaybackEventRequest,
      com.movieplatform.proto.playback.TrackPlaybackEventResponse> getTrackPlaybackEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrackPlaybackEvent",
      requestType = com.movieplatform.proto.playback.TrackPlaybackEventRequest.class,
      responseType = com.movieplatform.proto.playback.TrackPlaybackEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.TrackPlaybackEventRequest,
      com.movieplatform.proto.playback.TrackPlaybackEventResponse> getTrackPlaybackEventMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.TrackPlaybackEventRequest, com.movieplatform.proto.playback.TrackPlaybackEventResponse> getTrackPlaybackEventMethod;
    if ((getTrackPlaybackEventMethod = PlaybackServiceGrpc.getTrackPlaybackEventMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getTrackPlaybackEventMethod = PlaybackServiceGrpc.getTrackPlaybackEventMethod) == null) {
          PlaybackServiceGrpc.getTrackPlaybackEventMethod = getTrackPlaybackEventMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.TrackPlaybackEventRequest, com.movieplatform.proto.playback.TrackPlaybackEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrackPlaybackEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.TrackPlaybackEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.TrackPlaybackEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("TrackPlaybackEvent"))
              .build();
        }
      }
    }
    return getTrackPlaybackEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest,
      com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse> getGetPlaybackAnalyticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlaybackAnalytics",
      requestType = com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest.class,
      responseType = com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest,
      com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse> getGetPlaybackAnalyticsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest, com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse> getGetPlaybackAnalyticsMethod;
    if ((getGetPlaybackAnalyticsMethod = PlaybackServiceGrpc.getGetPlaybackAnalyticsMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetPlaybackAnalyticsMethod = PlaybackServiceGrpc.getGetPlaybackAnalyticsMethod) == null) {
          PlaybackServiceGrpc.getGetPlaybackAnalyticsMethod = getGetPlaybackAnalyticsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest, com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlaybackAnalytics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetPlaybackAnalytics"))
              .build();
        }
      }
    }
    return getGetPlaybackAnalyticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetStreamingPerformanceRequest,
      com.movieplatform.proto.playback.GetStreamingPerformanceResponse> getGetStreamingPerformanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStreamingPerformance",
      requestType = com.movieplatform.proto.playback.GetStreamingPerformanceRequest.class,
      responseType = com.movieplatform.proto.playback.GetStreamingPerformanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetStreamingPerformanceRequest,
      com.movieplatform.proto.playback.GetStreamingPerformanceResponse> getGetStreamingPerformanceMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetStreamingPerformanceRequest, com.movieplatform.proto.playback.GetStreamingPerformanceResponse> getGetStreamingPerformanceMethod;
    if ((getGetStreamingPerformanceMethod = PlaybackServiceGrpc.getGetStreamingPerformanceMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetStreamingPerformanceMethod = PlaybackServiceGrpc.getGetStreamingPerformanceMethod) == null) {
          PlaybackServiceGrpc.getGetStreamingPerformanceMethod = getGetStreamingPerformanceMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetStreamingPerformanceRequest, com.movieplatform.proto.playback.GetStreamingPerformanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStreamingPerformance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetStreamingPerformanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetStreamingPerformanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetStreamingPerformance"))
              .build();
        }
      }
    }
    return getGetStreamingPerformanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetDRMLicenseRequest,
      com.movieplatform.proto.playback.GetDRMLicenseResponse> getGetDRMLicenseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDRMLicense",
      requestType = com.movieplatform.proto.playback.GetDRMLicenseRequest.class,
      responseType = com.movieplatform.proto.playback.GetDRMLicenseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetDRMLicenseRequest,
      com.movieplatform.proto.playback.GetDRMLicenseResponse> getGetDRMLicenseMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetDRMLicenseRequest, com.movieplatform.proto.playback.GetDRMLicenseResponse> getGetDRMLicenseMethod;
    if ((getGetDRMLicenseMethod = PlaybackServiceGrpc.getGetDRMLicenseMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetDRMLicenseMethod = PlaybackServiceGrpc.getGetDRMLicenseMethod) == null) {
          PlaybackServiceGrpc.getGetDRMLicenseMethod = getGetDRMLicenseMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetDRMLicenseRequest, com.movieplatform.proto.playback.GetDRMLicenseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDRMLicense"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetDRMLicenseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetDRMLicenseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetDRMLicense"))
              .build();
        }
      }
    }
    return getGetDRMLicenseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ValidateDRMTokenRequest,
      com.movieplatform.proto.playback.ValidateDRMTokenResponse> getValidateDRMTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateDRMToken",
      requestType = com.movieplatform.proto.playback.ValidateDRMTokenRequest.class,
      responseType = com.movieplatform.proto.playback.ValidateDRMTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ValidateDRMTokenRequest,
      com.movieplatform.proto.playback.ValidateDRMTokenResponse> getValidateDRMTokenMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.ValidateDRMTokenRequest, com.movieplatform.proto.playback.ValidateDRMTokenResponse> getValidateDRMTokenMethod;
    if ((getValidateDRMTokenMethod = PlaybackServiceGrpc.getValidateDRMTokenMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getValidateDRMTokenMethod = PlaybackServiceGrpc.getValidateDRMTokenMethod) == null) {
          PlaybackServiceGrpc.getValidateDRMTokenMethod = getValidateDRMTokenMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.ValidateDRMTokenRequest, com.movieplatform.proto.playback.ValidateDRMTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateDRMToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.ValidateDRMTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.ValidateDRMTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("ValidateDRMToken"))
              .build();
        }
      }
    }
    return getValidateDRMTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetContentProtectionRequest,
      com.movieplatform.proto.playback.GetContentProtectionResponse> getGetContentProtectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContentProtection",
      requestType = com.movieplatform.proto.playback.GetContentProtectionRequest.class,
      responseType = com.movieplatform.proto.playback.GetContentProtectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetContentProtectionRequest,
      com.movieplatform.proto.playback.GetContentProtectionResponse> getGetContentProtectionMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.playback.GetContentProtectionRequest, com.movieplatform.proto.playback.GetContentProtectionResponse> getGetContentProtectionMethod;
    if ((getGetContentProtectionMethod = PlaybackServiceGrpc.getGetContentProtectionMethod) == null) {
      synchronized (PlaybackServiceGrpc.class) {
        if ((getGetContentProtectionMethod = PlaybackServiceGrpc.getGetContentProtectionMethod) == null) {
          PlaybackServiceGrpc.getGetContentProtectionMethod = getGetContentProtectionMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.playback.GetContentProtectionRequest, com.movieplatform.proto.playback.GetContentProtectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContentProtection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetContentProtectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.playback.GetContentProtectionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PlaybackServiceMethodDescriptorSupplier("GetContentProtection"))
              .build();
        }
      }
    }
    return getGetContentProtectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlaybackServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlaybackServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlaybackServiceStub>() {
        @java.lang.Override
        public PlaybackServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlaybackServiceStub(channel, callOptions);
        }
      };
    return PlaybackServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlaybackServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlaybackServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlaybackServiceBlockingStub>() {
        @java.lang.Override
        public PlaybackServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlaybackServiceBlockingStub(channel, callOptions);
        }
      };
    return PlaybackServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlaybackServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PlaybackServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PlaybackServiceFutureStub>() {
        @java.lang.Override
        public PlaybackServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PlaybackServiceFutureStub(channel, callOptions);
        }
      };
    return PlaybackServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Streaming and playback management service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Session management
     * </pre>
     */
    default void createPlaybackSession(com.movieplatform.proto.playback.CreatePlaybackSessionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.CreatePlaybackSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePlaybackSessionMethod(), responseObserver);
    }

    /**
     */
    default void getPlaybackSession(com.movieplatform.proto.playback.GetPlaybackSessionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlaybackSessionMethod(), responseObserver);
    }

    /**
     */
    default void updatePlaybackSession(com.movieplatform.proto.playback.UpdatePlaybackSessionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.UpdatePlaybackSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePlaybackSessionMethod(), responseObserver);
    }

    /**
     */
    default void endPlaybackSession(com.movieplatform.proto.playback.EndPlaybackSessionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.EndPlaybackSessionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndPlaybackSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Playback control
     * </pre>
     */
    default void startPlayback(com.movieplatform.proto.playback.StartPlaybackRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.StartPlaybackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartPlaybackMethod(), responseObserver);
    }

    /**
     */
    default void pausePlayback(com.movieplatform.proto.playback.PausePlaybackRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.PausePlaybackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPausePlaybackMethod(), responseObserver);
    }

    /**
     */
    default void resumePlayback(com.movieplatform.proto.playback.ResumePlaybackRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ResumePlaybackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumePlaybackMethod(), responseObserver);
    }

    /**
     */
    default void stopPlayback(com.movieplatform.proto.playback.StopPlaybackRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.StopPlaybackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopPlaybackMethod(), responseObserver);
    }

    /**
     */
    default void seekPlayback(com.movieplatform.proto.playback.SeekPlaybackRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.SeekPlaybackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSeekPlaybackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Progress tracking
     * </pre>
     */
    default void updatePlaybackProgress(com.movieplatform.proto.playback.UpdatePlaybackProgressRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.UpdatePlaybackProgressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePlaybackProgressMethod(), responseObserver);
    }

    /**
     */
    default void getPlaybackProgress(com.movieplatform.proto.playback.GetPlaybackProgressRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackProgressResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlaybackProgressMethod(), responseObserver);
    }

    /**
     */
    default void getPlaybackHistory(com.movieplatform.proto.playback.GetPlaybackHistoryRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlaybackHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Quality adaptation
     * </pre>
     */
    default void getAvailableQualities(com.movieplatform.proto.playback.GetAvailableQualitiesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetAvailableQualitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableQualitiesMethod(), responseObserver);
    }

    /**
     */
    default void changePlaybackQuality(com.movieplatform.proto.playback.ChangePlaybackQualityRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ChangePlaybackQualityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangePlaybackQualityMethod(), responseObserver);
    }

    /**
     */
    default void getAdaptiveBitrateInfo(com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAdaptiveBitrateInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Streaming management
     * </pre>
     */
    default void getStreamingURL(com.movieplatform.proto.playback.GetStreamingURLRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetStreamingURLResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStreamingURLMethod(), responseObserver);
    }

    /**
     */
    default void validateStreamingAccess(com.movieplatform.proto.playback.ValidateStreamingAccessRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ValidateStreamingAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateStreamingAccessMethod(), responseObserver);
    }

    /**
     */
    default void getStreamingMetrics(com.movieplatform.proto.playback.GetStreamingMetricsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetStreamingMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStreamingMetricsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Analytics and monitoring
     * </pre>
     */
    default void trackPlaybackEvent(com.movieplatform.proto.playback.TrackPlaybackEventRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.TrackPlaybackEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrackPlaybackEventMethod(), responseObserver);
    }

    /**
     */
    default void getPlaybackAnalytics(com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlaybackAnalyticsMethod(), responseObserver);
    }

    /**
     */
    default void getStreamingPerformance(com.movieplatform.proto.playback.GetStreamingPerformanceRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetStreamingPerformanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStreamingPerformanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * DRM and security
     * </pre>
     */
    default void getDRMLicense(com.movieplatform.proto.playback.GetDRMLicenseRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetDRMLicenseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDRMLicenseMethod(), responseObserver);
    }

    /**
     */
    default void validateDRMToken(com.movieplatform.proto.playback.ValidateDRMTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ValidateDRMTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateDRMTokenMethod(), responseObserver);
    }

    /**
     */
    default void getContentProtection(com.movieplatform.proto.playback.GetContentProtectionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetContentProtectionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContentProtectionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PlaybackService.
   * <pre>
   * Streaming and playback management service
   * </pre>
   */
  public static abstract class PlaybackServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PlaybackServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PlaybackService.
   * <pre>
   * Streaming and playback management service
   * </pre>
   */
  public static final class PlaybackServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PlaybackServiceStub> {
    private PlaybackServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaybackServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlaybackServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Session management
     * </pre>
     */
    public void createPlaybackSession(com.movieplatform.proto.playback.CreatePlaybackSessionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.CreatePlaybackSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePlaybackSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlaybackSession(com.movieplatform.proto.playback.GetPlaybackSessionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlaybackSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePlaybackSession(com.movieplatform.proto.playback.UpdatePlaybackSessionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.UpdatePlaybackSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePlaybackSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void endPlaybackSession(com.movieplatform.proto.playback.EndPlaybackSessionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.EndPlaybackSessionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndPlaybackSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Playback control
     * </pre>
     */
    public void startPlayback(com.movieplatform.proto.playback.StartPlaybackRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.StartPlaybackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartPlaybackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pausePlayback(com.movieplatform.proto.playback.PausePlaybackRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.PausePlaybackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPausePlaybackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resumePlayback(com.movieplatform.proto.playback.ResumePlaybackRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ResumePlaybackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumePlaybackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopPlayback(com.movieplatform.proto.playback.StopPlaybackRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.StopPlaybackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopPlaybackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void seekPlayback(com.movieplatform.proto.playback.SeekPlaybackRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.SeekPlaybackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSeekPlaybackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Progress tracking
     * </pre>
     */
    public void updatePlaybackProgress(com.movieplatform.proto.playback.UpdatePlaybackProgressRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.UpdatePlaybackProgressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePlaybackProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlaybackProgress(com.movieplatform.proto.playback.GetPlaybackProgressRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackProgressResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlaybackProgressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlaybackHistory(com.movieplatform.proto.playback.GetPlaybackHistoryRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlaybackHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Quality adaptation
     * </pre>
     */
    public void getAvailableQualities(com.movieplatform.proto.playback.GetAvailableQualitiesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetAvailableQualitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailableQualitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePlaybackQuality(com.movieplatform.proto.playback.ChangePlaybackQualityRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ChangePlaybackQualityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangePlaybackQualityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAdaptiveBitrateInfo(com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAdaptiveBitrateInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Streaming management
     * </pre>
     */
    public void getStreamingURL(com.movieplatform.proto.playback.GetStreamingURLRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetStreamingURLResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStreamingURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateStreamingAccess(com.movieplatform.proto.playback.ValidateStreamingAccessRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ValidateStreamingAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateStreamingAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStreamingMetrics(com.movieplatform.proto.playback.GetStreamingMetricsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetStreamingMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStreamingMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Analytics and monitoring
     * </pre>
     */
    public void trackPlaybackEvent(com.movieplatform.proto.playback.TrackPlaybackEventRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.TrackPlaybackEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrackPlaybackEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlaybackAnalytics(com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlaybackAnalyticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStreamingPerformance(com.movieplatform.proto.playback.GetStreamingPerformanceRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetStreamingPerformanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStreamingPerformanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DRM and security
     * </pre>
     */
    public void getDRMLicense(com.movieplatform.proto.playback.GetDRMLicenseRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetDRMLicenseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDRMLicenseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateDRMToken(com.movieplatform.proto.playback.ValidateDRMTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ValidateDRMTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateDRMTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContentProtection(com.movieplatform.proto.playback.GetContentProtectionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetContentProtectionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContentProtectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PlaybackService.
   * <pre>
   * Streaming and playback management service
   * </pre>
   */
  public static final class PlaybackServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PlaybackServiceBlockingStub> {
    private PlaybackServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaybackServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlaybackServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Session management
     * </pre>
     */
    public com.movieplatform.proto.playback.CreatePlaybackSessionResponse createPlaybackSession(com.movieplatform.proto.playback.CreatePlaybackSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePlaybackSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.GetPlaybackSessionResponse getPlaybackSession(com.movieplatform.proto.playback.GetPlaybackSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlaybackSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.UpdatePlaybackSessionResponse updatePlaybackSession(com.movieplatform.proto.playback.UpdatePlaybackSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePlaybackSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.EndPlaybackSessionResponse endPlaybackSession(com.movieplatform.proto.playback.EndPlaybackSessionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndPlaybackSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Playback control
     * </pre>
     */
    public com.movieplatform.proto.playback.StartPlaybackResponse startPlayback(com.movieplatform.proto.playback.StartPlaybackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartPlaybackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.PausePlaybackResponse pausePlayback(com.movieplatform.proto.playback.PausePlaybackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPausePlaybackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.ResumePlaybackResponse resumePlayback(com.movieplatform.proto.playback.ResumePlaybackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumePlaybackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.StopPlaybackResponse stopPlayback(com.movieplatform.proto.playback.StopPlaybackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopPlaybackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.SeekPlaybackResponse seekPlayback(com.movieplatform.proto.playback.SeekPlaybackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSeekPlaybackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Progress tracking
     * </pre>
     */
    public com.movieplatform.proto.playback.UpdatePlaybackProgressResponse updatePlaybackProgress(com.movieplatform.proto.playback.UpdatePlaybackProgressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePlaybackProgressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.GetPlaybackProgressResponse getPlaybackProgress(com.movieplatform.proto.playback.GetPlaybackProgressRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlaybackProgressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.GetPlaybackHistoryResponse getPlaybackHistory(com.movieplatform.proto.playback.GetPlaybackHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlaybackHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Quality adaptation
     * </pre>
     */
    public com.movieplatform.proto.playback.GetAvailableQualitiesResponse getAvailableQualities(com.movieplatform.proto.playback.GetAvailableQualitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableQualitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.ChangePlaybackQualityResponse changePlaybackQuality(com.movieplatform.proto.playback.ChangePlaybackQualityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangePlaybackQualityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse getAdaptiveBitrateInfo(com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAdaptiveBitrateInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Streaming management
     * </pre>
     */
    public com.movieplatform.proto.playback.GetStreamingURLResponse getStreamingURL(com.movieplatform.proto.playback.GetStreamingURLRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStreamingURLMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.ValidateStreamingAccessResponse validateStreamingAccess(com.movieplatform.proto.playback.ValidateStreamingAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateStreamingAccessMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.GetStreamingMetricsResponse getStreamingMetrics(com.movieplatform.proto.playback.GetStreamingMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStreamingMetricsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Analytics and monitoring
     * </pre>
     */
    public com.movieplatform.proto.playback.TrackPlaybackEventResponse trackPlaybackEvent(com.movieplatform.proto.playback.TrackPlaybackEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrackPlaybackEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse getPlaybackAnalytics(com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlaybackAnalyticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.GetStreamingPerformanceResponse getStreamingPerformance(com.movieplatform.proto.playback.GetStreamingPerformanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStreamingPerformanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DRM and security
     * </pre>
     */
    public com.movieplatform.proto.playback.GetDRMLicenseResponse getDRMLicense(com.movieplatform.proto.playback.GetDRMLicenseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDRMLicenseMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.ValidateDRMTokenResponse validateDRMToken(com.movieplatform.proto.playback.ValidateDRMTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateDRMTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.playback.GetContentProtectionResponse getContentProtection(com.movieplatform.proto.playback.GetContentProtectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContentProtectionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PlaybackService.
   * <pre>
   * Streaming and playback management service
   * </pre>
   */
  public static final class PlaybackServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PlaybackServiceFutureStub> {
    private PlaybackServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlaybackServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PlaybackServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Session management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.CreatePlaybackSessionResponse> createPlaybackSession(
        com.movieplatform.proto.playback.CreatePlaybackSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePlaybackSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetPlaybackSessionResponse> getPlaybackSession(
        com.movieplatform.proto.playback.GetPlaybackSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlaybackSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.UpdatePlaybackSessionResponse> updatePlaybackSession(
        com.movieplatform.proto.playback.UpdatePlaybackSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePlaybackSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.EndPlaybackSessionResponse> endPlaybackSession(
        com.movieplatform.proto.playback.EndPlaybackSessionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndPlaybackSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Playback control
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.StartPlaybackResponse> startPlayback(
        com.movieplatform.proto.playback.StartPlaybackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartPlaybackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.PausePlaybackResponse> pausePlayback(
        com.movieplatform.proto.playback.PausePlaybackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPausePlaybackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.ResumePlaybackResponse> resumePlayback(
        com.movieplatform.proto.playback.ResumePlaybackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumePlaybackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.StopPlaybackResponse> stopPlayback(
        com.movieplatform.proto.playback.StopPlaybackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopPlaybackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.SeekPlaybackResponse> seekPlayback(
        com.movieplatform.proto.playback.SeekPlaybackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSeekPlaybackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Progress tracking
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.UpdatePlaybackProgressResponse> updatePlaybackProgress(
        com.movieplatform.proto.playback.UpdatePlaybackProgressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePlaybackProgressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetPlaybackProgressResponse> getPlaybackProgress(
        com.movieplatform.proto.playback.GetPlaybackProgressRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlaybackProgressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetPlaybackHistoryResponse> getPlaybackHistory(
        com.movieplatform.proto.playback.GetPlaybackHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlaybackHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Quality adaptation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetAvailableQualitiesResponse> getAvailableQualities(
        com.movieplatform.proto.playback.GetAvailableQualitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailableQualitiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.ChangePlaybackQualityResponse> changePlaybackQuality(
        com.movieplatform.proto.playback.ChangePlaybackQualityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangePlaybackQualityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse> getAdaptiveBitrateInfo(
        com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAdaptiveBitrateInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Streaming management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetStreamingURLResponse> getStreamingURL(
        com.movieplatform.proto.playback.GetStreamingURLRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStreamingURLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.ValidateStreamingAccessResponse> validateStreamingAccess(
        com.movieplatform.proto.playback.ValidateStreamingAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateStreamingAccessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetStreamingMetricsResponse> getStreamingMetrics(
        com.movieplatform.proto.playback.GetStreamingMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStreamingMetricsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Analytics and monitoring
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.TrackPlaybackEventResponse> trackPlaybackEvent(
        com.movieplatform.proto.playback.TrackPlaybackEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrackPlaybackEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse> getPlaybackAnalytics(
        com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlaybackAnalyticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetStreamingPerformanceResponse> getStreamingPerformance(
        com.movieplatform.proto.playback.GetStreamingPerformanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStreamingPerformanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DRM and security
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetDRMLicenseResponse> getDRMLicense(
        com.movieplatform.proto.playback.GetDRMLicenseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDRMLicenseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.ValidateDRMTokenResponse> validateDRMToken(
        com.movieplatform.proto.playback.ValidateDRMTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateDRMTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.playback.GetContentProtectionResponse> getContentProtection(
        com.movieplatform.proto.playback.GetContentProtectionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContentProtectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PLAYBACK_SESSION = 0;
  private static final int METHODID_GET_PLAYBACK_SESSION = 1;
  private static final int METHODID_UPDATE_PLAYBACK_SESSION = 2;
  private static final int METHODID_END_PLAYBACK_SESSION = 3;
  private static final int METHODID_START_PLAYBACK = 4;
  private static final int METHODID_PAUSE_PLAYBACK = 5;
  private static final int METHODID_RESUME_PLAYBACK = 6;
  private static final int METHODID_STOP_PLAYBACK = 7;
  private static final int METHODID_SEEK_PLAYBACK = 8;
  private static final int METHODID_UPDATE_PLAYBACK_PROGRESS = 9;
  private static final int METHODID_GET_PLAYBACK_PROGRESS = 10;
  private static final int METHODID_GET_PLAYBACK_HISTORY = 11;
  private static final int METHODID_GET_AVAILABLE_QUALITIES = 12;
  private static final int METHODID_CHANGE_PLAYBACK_QUALITY = 13;
  private static final int METHODID_GET_ADAPTIVE_BITRATE_INFO = 14;
  private static final int METHODID_GET_STREAMING_URL = 15;
  private static final int METHODID_VALIDATE_STREAMING_ACCESS = 16;
  private static final int METHODID_GET_STREAMING_METRICS = 17;
  private static final int METHODID_TRACK_PLAYBACK_EVENT = 18;
  private static final int METHODID_GET_PLAYBACK_ANALYTICS = 19;
  private static final int METHODID_GET_STREAMING_PERFORMANCE = 20;
  private static final int METHODID_GET_DRMLICENSE = 21;
  private static final int METHODID_VALIDATE_DRMTOKEN = 22;
  private static final int METHODID_GET_CONTENT_PROTECTION = 23;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PLAYBACK_SESSION:
          serviceImpl.createPlaybackSession((com.movieplatform.proto.playback.CreatePlaybackSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.CreatePlaybackSessionResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYBACK_SESSION:
          serviceImpl.getPlaybackSession((com.movieplatform.proto.playback.GetPlaybackSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackSessionResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PLAYBACK_SESSION:
          serviceImpl.updatePlaybackSession((com.movieplatform.proto.playback.UpdatePlaybackSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.UpdatePlaybackSessionResponse>) responseObserver);
          break;
        case METHODID_END_PLAYBACK_SESSION:
          serviceImpl.endPlaybackSession((com.movieplatform.proto.playback.EndPlaybackSessionRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.EndPlaybackSessionResponse>) responseObserver);
          break;
        case METHODID_START_PLAYBACK:
          serviceImpl.startPlayback((com.movieplatform.proto.playback.StartPlaybackRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.StartPlaybackResponse>) responseObserver);
          break;
        case METHODID_PAUSE_PLAYBACK:
          serviceImpl.pausePlayback((com.movieplatform.proto.playback.PausePlaybackRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.PausePlaybackResponse>) responseObserver);
          break;
        case METHODID_RESUME_PLAYBACK:
          serviceImpl.resumePlayback((com.movieplatform.proto.playback.ResumePlaybackRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ResumePlaybackResponse>) responseObserver);
          break;
        case METHODID_STOP_PLAYBACK:
          serviceImpl.stopPlayback((com.movieplatform.proto.playback.StopPlaybackRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.StopPlaybackResponse>) responseObserver);
          break;
        case METHODID_SEEK_PLAYBACK:
          serviceImpl.seekPlayback((com.movieplatform.proto.playback.SeekPlaybackRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.SeekPlaybackResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PLAYBACK_PROGRESS:
          serviceImpl.updatePlaybackProgress((com.movieplatform.proto.playback.UpdatePlaybackProgressRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.UpdatePlaybackProgressResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYBACK_PROGRESS:
          serviceImpl.getPlaybackProgress((com.movieplatform.proto.playback.GetPlaybackProgressRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackProgressResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYBACK_HISTORY:
          serviceImpl.getPlaybackHistory((com.movieplatform.proto.playback.GetPlaybackHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackHistoryResponse>) responseObserver);
          break;
        case METHODID_GET_AVAILABLE_QUALITIES:
          serviceImpl.getAvailableQualities((com.movieplatform.proto.playback.GetAvailableQualitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetAvailableQualitiesResponse>) responseObserver);
          break;
        case METHODID_CHANGE_PLAYBACK_QUALITY:
          serviceImpl.changePlaybackQuality((com.movieplatform.proto.playback.ChangePlaybackQualityRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ChangePlaybackQualityResponse>) responseObserver);
          break;
        case METHODID_GET_ADAPTIVE_BITRATE_INFO:
          serviceImpl.getAdaptiveBitrateInfo((com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse>) responseObserver);
          break;
        case METHODID_GET_STREAMING_URL:
          serviceImpl.getStreamingURL((com.movieplatform.proto.playback.GetStreamingURLRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetStreamingURLResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_STREAMING_ACCESS:
          serviceImpl.validateStreamingAccess((com.movieplatform.proto.playback.ValidateStreamingAccessRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ValidateStreamingAccessResponse>) responseObserver);
          break;
        case METHODID_GET_STREAMING_METRICS:
          serviceImpl.getStreamingMetrics((com.movieplatform.proto.playback.GetStreamingMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetStreamingMetricsResponse>) responseObserver);
          break;
        case METHODID_TRACK_PLAYBACK_EVENT:
          serviceImpl.trackPlaybackEvent((com.movieplatform.proto.playback.TrackPlaybackEventRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.TrackPlaybackEventResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYBACK_ANALYTICS:
          serviceImpl.getPlaybackAnalytics((com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse>) responseObserver);
          break;
        case METHODID_GET_STREAMING_PERFORMANCE:
          serviceImpl.getStreamingPerformance((com.movieplatform.proto.playback.GetStreamingPerformanceRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetStreamingPerformanceResponse>) responseObserver);
          break;
        case METHODID_GET_DRMLICENSE:
          serviceImpl.getDRMLicense((com.movieplatform.proto.playback.GetDRMLicenseRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetDRMLicenseResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_DRMTOKEN:
          serviceImpl.validateDRMToken((com.movieplatform.proto.playback.ValidateDRMTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.ValidateDRMTokenResponse>) responseObserver);
          break;
        case METHODID_GET_CONTENT_PROTECTION:
          serviceImpl.getContentProtection((com.movieplatform.proto.playback.GetContentProtectionRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.playback.GetContentProtectionResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreatePlaybackSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.CreatePlaybackSessionRequest,
              com.movieplatform.proto.playback.CreatePlaybackSessionResponse>(
                service, METHODID_CREATE_PLAYBACK_SESSION)))
        .addMethod(
          getGetPlaybackSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetPlaybackSessionRequest,
              com.movieplatform.proto.playback.GetPlaybackSessionResponse>(
                service, METHODID_GET_PLAYBACK_SESSION)))
        .addMethod(
          getUpdatePlaybackSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.UpdatePlaybackSessionRequest,
              com.movieplatform.proto.playback.UpdatePlaybackSessionResponse>(
                service, METHODID_UPDATE_PLAYBACK_SESSION)))
        .addMethod(
          getEndPlaybackSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.EndPlaybackSessionRequest,
              com.movieplatform.proto.playback.EndPlaybackSessionResponse>(
                service, METHODID_END_PLAYBACK_SESSION)))
        .addMethod(
          getStartPlaybackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.StartPlaybackRequest,
              com.movieplatform.proto.playback.StartPlaybackResponse>(
                service, METHODID_START_PLAYBACK)))
        .addMethod(
          getPausePlaybackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.PausePlaybackRequest,
              com.movieplatform.proto.playback.PausePlaybackResponse>(
                service, METHODID_PAUSE_PLAYBACK)))
        .addMethod(
          getResumePlaybackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.ResumePlaybackRequest,
              com.movieplatform.proto.playback.ResumePlaybackResponse>(
                service, METHODID_RESUME_PLAYBACK)))
        .addMethod(
          getStopPlaybackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.StopPlaybackRequest,
              com.movieplatform.proto.playback.StopPlaybackResponse>(
                service, METHODID_STOP_PLAYBACK)))
        .addMethod(
          getSeekPlaybackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.SeekPlaybackRequest,
              com.movieplatform.proto.playback.SeekPlaybackResponse>(
                service, METHODID_SEEK_PLAYBACK)))
        .addMethod(
          getUpdatePlaybackProgressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.UpdatePlaybackProgressRequest,
              com.movieplatform.proto.playback.UpdatePlaybackProgressResponse>(
                service, METHODID_UPDATE_PLAYBACK_PROGRESS)))
        .addMethod(
          getGetPlaybackProgressMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetPlaybackProgressRequest,
              com.movieplatform.proto.playback.GetPlaybackProgressResponse>(
                service, METHODID_GET_PLAYBACK_PROGRESS)))
        .addMethod(
          getGetPlaybackHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetPlaybackHistoryRequest,
              com.movieplatform.proto.playback.GetPlaybackHistoryResponse>(
                service, METHODID_GET_PLAYBACK_HISTORY)))
        .addMethod(
          getGetAvailableQualitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetAvailableQualitiesRequest,
              com.movieplatform.proto.playback.GetAvailableQualitiesResponse>(
                service, METHODID_GET_AVAILABLE_QUALITIES)))
        .addMethod(
          getChangePlaybackQualityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.ChangePlaybackQualityRequest,
              com.movieplatform.proto.playback.ChangePlaybackQualityResponse>(
                service, METHODID_CHANGE_PLAYBACK_QUALITY)))
        .addMethod(
          getGetAdaptiveBitrateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetAdaptiveBitrateInfoRequest,
              com.movieplatform.proto.playback.GetAdaptiveBitrateInfoResponse>(
                service, METHODID_GET_ADAPTIVE_BITRATE_INFO)))
        .addMethod(
          getGetStreamingURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetStreamingURLRequest,
              com.movieplatform.proto.playback.GetStreamingURLResponse>(
                service, METHODID_GET_STREAMING_URL)))
        .addMethod(
          getValidateStreamingAccessMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.ValidateStreamingAccessRequest,
              com.movieplatform.proto.playback.ValidateStreamingAccessResponse>(
                service, METHODID_VALIDATE_STREAMING_ACCESS)))
        .addMethod(
          getGetStreamingMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetStreamingMetricsRequest,
              com.movieplatform.proto.playback.GetStreamingMetricsResponse>(
                service, METHODID_GET_STREAMING_METRICS)))
        .addMethod(
          getTrackPlaybackEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.TrackPlaybackEventRequest,
              com.movieplatform.proto.playback.TrackPlaybackEventResponse>(
                service, METHODID_TRACK_PLAYBACK_EVENT)))
        .addMethod(
          getGetPlaybackAnalyticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetPlaybackAnalyticsRequest,
              com.movieplatform.proto.playback.GetPlaybackAnalyticsResponse>(
                service, METHODID_GET_PLAYBACK_ANALYTICS)))
        .addMethod(
          getGetStreamingPerformanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetStreamingPerformanceRequest,
              com.movieplatform.proto.playback.GetStreamingPerformanceResponse>(
                service, METHODID_GET_STREAMING_PERFORMANCE)))
        .addMethod(
          getGetDRMLicenseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetDRMLicenseRequest,
              com.movieplatform.proto.playback.GetDRMLicenseResponse>(
                service, METHODID_GET_DRMLICENSE)))
        .addMethod(
          getValidateDRMTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.ValidateDRMTokenRequest,
              com.movieplatform.proto.playback.ValidateDRMTokenResponse>(
                service, METHODID_VALIDATE_DRMTOKEN)))
        .addMethod(
          getGetContentProtectionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.playback.GetContentProtectionRequest,
              com.movieplatform.proto.playback.GetContentProtectionResponse>(
                service, METHODID_GET_CONTENT_PROTECTION)))
        .build();
  }

  private static abstract class PlaybackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlaybackServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.movieplatform.proto.playback.PlaybackServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PlaybackService");
    }
  }

  private static final class PlaybackServiceFileDescriptorSupplier
      extends PlaybackServiceBaseDescriptorSupplier {
    PlaybackServiceFileDescriptorSupplier() {}
  }

  private static final class PlaybackServiceMethodDescriptorSupplier
      extends PlaybackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PlaybackServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PlaybackServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlaybackServiceFileDescriptorSupplier())
              .addMethod(getCreatePlaybackSessionMethod())
              .addMethod(getGetPlaybackSessionMethod())
              .addMethod(getUpdatePlaybackSessionMethod())
              .addMethod(getEndPlaybackSessionMethod())
              .addMethod(getStartPlaybackMethod())
              .addMethod(getPausePlaybackMethod())
              .addMethod(getResumePlaybackMethod())
              .addMethod(getStopPlaybackMethod())
              .addMethod(getSeekPlaybackMethod())
              .addMethod(getUpdatePlaybackProgressMethod())
              .addMethod(getGetPlaybackProgressMethod())
              .addMethod(getGetPlaybackHistoryMethod())
              .addMethod(getGetAvailableQualitiesMethod())
              .addMethod(getChangePlaybackQualityMethod())
              .addMethod(getGetAdaptiveBitrateInfoMethod())
              .addMethod(getGetStreamingURLMethod())
              .addMethod(getValidateStreamingAccessMethod())
              .addMethod(getGetStreamingMetricsMethod())
              .addMethod(getTrackPlaybackEventMethod())
              .addMethod(getGetPlaybackAnalyticsMethod())
              .addMethod(getGetStreamingPerformanceMethod())
              .addMethod(getGetDRMLicenseMethod())
              .addMethod(getValidateDRMTokenMethod())
              .addMethod(getGetContentProtectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
