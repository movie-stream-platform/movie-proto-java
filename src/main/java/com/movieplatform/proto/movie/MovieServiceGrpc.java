package com.movieplatform.proto.movie;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Movie content management service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: movie/movie_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MovieServiceGrpc {

  private MovieServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.movie.MovieService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.CreateMovieRequest,
      com.movieplatform.proto.movie.CreateMovieResponse> getCreateMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMovie",
      requestType = com.movieplatform.proto.movie.CreateMovieRequest.class,
      responseType = com.movieplatform.proto.movie.CreateMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.CreateMovieRequest,
      com.movieplatform.proto.movie.CreateMovieResponse> getCreateMovieMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.CreateMovieRequest, com.movieplatform.proto.movie.CreateMovieResponse> getCreateMovieMethod;
    if ((getCreateMovieMethod = MovieServiceGrpc.getCreateMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getCreateMovieMethod = MovieServiceGrpc.getCreateMovieMethod) == null) {
          MovieServiceGrpc.getCreateMovieMethod = getCreateMovieMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.CreateMovieRequest, com.movieplatform.proto.movie.CreateMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.CreateMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.CreateMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("CreateMovie"))
              .build();
        }
      }
    }
    return getCreateMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetMovieRequest,
      com.movieplatform.proto.movie.GetMovieResponse> getGetMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMovie",
      requestType = com.movieplatform.proto.movie.GetMovieRequest.class,
      responseType = com.movieplatform.proto.movie.GetMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetMovieRequest,
      com.movieplatform.proto.movie.GetMovieResponse> getGetMovieMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetMovieRequest, com.movieplatform.proto.movie.GetMovieResponse> getGetMovieMethod;
    if ((getGetMovieMethod = MovieServiceGrpc.getGetMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetMovieMethod = MovieServiceGrpc.getGetMovieMethod) == null) {
          MovieServiceGrpc.getGetMovieMethod = getGetMovieMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.GetMovieRequest, com.movieplatform.proto.movie.GetMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.GetMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.GetMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("GetMovie"))
              .build();
        }
      }
    }
    return getGetMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.UpdateMovieRequest,
      com.movieplatform.proto.movie.UpdateMovieResponse> getUpdateMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMovie",
      requestType = com.movieplatform.proto.movie.UpdateMovieRequest.class,
      responseType = com.movieplatform.proto.movie.UpdateMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.UpdateMovieRequest,
      com.movieplatform.proto.movie.UpdateMovieResponse> getUpdateMovieMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.UpdateMovieRequest, com.movieplatform.proto.movie.UpdateMovieResponse> getUpdateMovieMethod;
    if ((getUpdateMovieMethod = MovieServiceGrpc.getUpdateMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getUpdateMovieMethod = MovieServiceGrpc.getUpdateMovieMethod) == null) {
          MovieServiceGrpc.getUpdateMovieMethod = getUpdateMovieMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.UpdateMovieRequest, com.movieplatform.proto.movie.UpdateMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.UpdateMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.UpdateMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("UpdateMovie"))
              .build();
        }
      }
    }
    return getUpdateMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.DeleteMovieRequest,
      com.movieplatform.proto.movie.DeleteMovieResponse> getDeleteMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMovie",
      requestType = com.movieplatform.proto.movie.DeleteMovieRequest.class,
      responseType = com.movieplatform.proto.movie.DeleteMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.DeleteMovieRequest,
      com.movieplatform.proto.movie.DeleteMovieResponse> getDeleteMovieMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.DeleteMovieRequest, com.movieplatform.proto.movie.DeleteMovieResponse> getDeleteMovieMethod;
    if ((getDeleteMovieMethod = MovieServiceGrpc.getDeleteMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getDeleteMovieMethod = MovieServiceGrpc.getDeleteMovieMethod) == null) {
          MovieServiceGrpc.getDeleteMovieMethod = getDeleteMovieMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.DeleteMovieRequest, com.movieplatform.proto.movie.DeleteMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.DeleteMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.DeleteMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("DeleteMovie"))
              .build();
        }
      }
    }
    return getDeleteMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetMoviesByIDsRequest,
      com.movieplatform.proto.movie.GetMoviesByIDsResponse> getGetMoviesByIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMoviesByIDs",
      requestType = com.movieplatform.proto.movie.GetMoviesByIDsRequest.class,
      responseType = com.movieplatform.proto.movie.GetMoviesByIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetMoviesByIDsRequest,
      com.movieplatform.proto.movie.GetMoviesByIDsResponse> getGetMoviesByIDsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetMoviesByIDsRequest, com.movieplatform.proto.movie.GetMoviesByIDsResponse> getGetMoviesByIDsMethod;
    if ((getGetMoviesByIDsMethod = MovieServiceGrpc.getGetMoviesByIDsMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetMoviesByIDsMethod = MovieServiceGrpc.getGetMoviesByIDsMethod) == null) {
          MovieServiceGrpc.getGetMoviesByIDsMethod = getGetMoviesByIDsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.GetMoviesByIDsRequest, com.movieplatform.proto.movie.GetMoviesByIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMoviesByIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.GetMoviesByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.GetMoviesByIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("GetMoviesByIDs"))
              .build();
        }
      }
    }
    return getGetMoviesByIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.BulkUpdateMoviesRequest,
      com.movieplatform.proto.movie.BulkUpdateMoviesResponse> getBulkUpdateMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkUpdateMovies",
      requestType = com.movieplatform.proto.movie.BulkUpdateMoviesRequest.class,
      responseType = com.movieplatform.proto.movie.BulkUpdateMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.BulkUpdateMoviesRequest,
      com.movieplatform.proto.movie.BulkUpdateMoviesResponse> getBulkUpdateMoviesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.BulkUpdateMoviesRequest, com.movieplatform.proto.movie.BulkUpdateMoviesResponse> getBulkUpdateMoviesMethod;
    if ((getBulkUpdateMoviesMethod = MovieServiceGrpc.getBulkUpdateMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getBulkUpdateMoviesMethod = MovieServiceGrpc.getBulkUpdateMoviesMethod) == null) {
          MovieServiceGrpc.getBulkUpdateMoviesMethod = getBulkUpdateMoviesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.BulkUpdateMoviesRequest, com.movieplatform.proto.movie.BulkUpdateMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkUpdateMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.BulkUpdateMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.BulkUpdateMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("BulkUpdateMovies"))
              .build();
        }
      }
    }
    return getBulkUpdateMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.BulkDeleteMoviesRequest,
      com.movieplatform.proto.movie.BulkDeleteMoviesResponse> getBulkDeleteMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkDeleteMovies",
      requestType = com.movieplatform.proto.movie.BulkDeleteMoviesRequest.class,
      responseType = com.movieplatform.proto.movie.BulkDeleteMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.BulkDeleteMoviesRequest,
      com.movieplatform.proto.movie.BulkDeleteMoviesResponse> getBulkDeleteMoviesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.BulkDeleteMoviesRequest, com.movieplatform.proto.movie.BulkDeleteMoviesResponse> getBulkDeleteMoviesMethod;
    if ((getBulkDeleteMoviesMethod = MovieServiceGrpc.getBulkDeleteMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getBulkDeleteMoviesMethod = MovieServiceGrpc.getBulkDeleteMoviesMethod) == null) {
          MovieServiceGrpc.getBulkDeleteMoviesMethod = getBulkDeleteMoviesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.BulkDeleteMoviesRequest, com.movieplatform.proto.movie.BulkDeleteMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkDeleteMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.BulkDeleteMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.BulkDeleteMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("BulkDeleteMovies"))
              .build();
        }
      }
    }
    return getBulkDeleteMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.ValidateMovieRequest,
      com.movieplatform.proto.movie.ValidateMovieResponse> getValidateMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateMovie",
      requestType = com.movieplatform.proto.movie.ValidateMovieRequest.class,
      responseType = com.movieplatform.proto.movie.ValidateMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.ValidateMovieRequest,
      com.movieplatform.proto.movie.ValidateMovieResponse> getValidateMovieMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.ValidateMovieRequest, com.movieplatform.proto.movie.ValidateMovieResponse> getValidateMovieMethod;
    if ((getValidateMovieMethod = MovieServiceGrpc.getValidateMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getValidateMovieMethod = MovieServiceGrpc.getValidateMovieMethod) == null) {
          MovieServiceGrpc.getValidateMovieMethod = getValidateMovieMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.ValidateMovieRequest, com.movieplatform.proto.movie.ValidateMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.ValidateMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.ValidateMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("ValidateMovie"))
              .build();
        }
      }
    }
    return getValidateMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.PublishMovieRequest,
      com.movieplatform.proto.movie.PublishMovieResponse> getPublishMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishMovie",
      requestType = com.movieplatform.proto.movie.PublishMovieRequest.class,
      responseType = com.movieplatform.proto.movie.PublishMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.PublishMovieRequest,
      com.movieplatform.proto.movie.PublishMovieResponse> getPublishMovieMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.PublishMovieRequest, com.movieplatform.proto.movie.PublishMovieResponse> getPublishMovieMethod;
    if ((getPublishMovieMethod = MovieServiceGrpc.getPublishMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getPublishMovieMethod = MovieServiceGrpc.getPublishMovieMethod) == null) {
          MovieServiceGrpc.getPublishMovieMethod = getPublishMovieMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.PublishMovieRequest, com.movieplatform.proto.movie.PublishMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.PublishMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.PublishMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("PublishMovie"))
              .build();
        }
      }
    }
    return getPublishMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.UnpublishMovieRequest,
      com.movieplatform.proto.movie.UnpublishMovieResponse> getUnpublishMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnpublishMovie",
      requestType = com.movieplatform.proto.movie.UnpublishMovieRequest.class,
      responseType = com.movieplatform.proto.movie.UnpublishMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.UnpublishMovieRequest,
      com.movieplatform.proto.movie.UnpublishMovieResponse> getUnpublishMovieMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.UnpublishMovieRequest, com.movieplatform.proto.movie.UnpublishMovieResponse> getUnpublishMovieMethod;
    if ((getUnpublishMovieMethod = MovieServiceGrpc.getUnpublishMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getUnpublishMovieMethod = MovieServiceGrpc.getUnpublishMovieMethod) == null) {
          MovieServiceGrpc.getUnpublishMovieMethod = getUnpublishMovieMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.UnpublishMovieRequest, com.movieplatform.proto.movie.UnpublishMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnpublishMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.UnpublishMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.UnpublishMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("UnpublishMovie"))
              .build();
        }
      }
    }
    return getUnpublishMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.SearchMoviesRequest,
      com.movieplatform.proto.movie.SearchMoviesResponse> getSearchMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchMovies",
      requestType = com.movieplatform.proto.movie.SearchMoviesRequest.class,
      responseType = com.movieplatform.proto.movie.SearchMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.SearchMoviesRequest,
      com.movieplatform.proto.movie.SearchMoviesResponse> getSearchMoviesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.SearchMoviesRequest, com.movieplatform.proto.movie.SearchMoviesResponse> getSearchMoviesMethod;
    if ((getSearchMoviesMethod = MovieServiceGrpc.getSearchMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getSearchMoviesMethod = MovieServiceGrpc.getSearchMoviesMethod) == null) {
          MovieServiceGrpc.getSearchMoviesMethod = getSearchMoviesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.SearchMoviesRequest, com.movieplatform.proto.movie.SearchMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.SearchMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.SearchMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("SearchMovies"))
              .build();
        }
      }
    }
    return getSearchMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetPopularMoviesRequest,
      com.movieplatform.proto.movie.GetPopularMoviesResponse> getGetPopularMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPopularMovies",
      requestType = com.movieplatform.proto.movie.GetPopularMoviesRequest.class,
      responseType = com.movieplatform.proto.movie.GetPopularMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetPopularMoviesRequest,
      com.movieplatform.proto.movie.GetPopularMoviesResponse> getGetPopularMoviesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetPopularMoviesRequest, com.movieplatform.proto.movie.GetPopularMoviesResponse> getGetPopularMoviesMethod;
    if ((getGetPopularMoviesMethod = MovieServiceGrpc.getGetPopularMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetPopularMoviesMethod = MovieServiceGrpc.getGetPopularMoviesMethod) == null) {
          MovieServiceGrpc.getGetPopularMoviesMethod = getGetPopularMoviesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.GetPopularMoviesRequest, com.movieplatform.proto.movie.GetPopularMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPopularMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.GetPopularMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.GetPopularMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("GetPopularMovies"))
              .build();
        }
      }
    }
    return getGetPopularMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetTrendingMoviesRequest,
      com.movieplatform.proto.movie.GetTrendingMoviesResponse> getGetTrendingMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrendingMovies",
      requestType = com.movieplatform.proto.movie.GetTrendingMoviesRequest.class,
      responseType = com.movieplatform.proto.movie.GetTrendingMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetTrendingMoviesRequest,
      com.movieplatform.proto.movie.GetTrendingMoviesResponse> getGetTrendingMoviesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetTrendingMoviesRequest, com.movieplatform.proto.movie.GetTrendingMoviesResponse> getGetTrendingMoviesMethod;
    if ((getGetTrendingMoviesMethod = MovieServiceGrpc.getGetTrendingMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetTrendingMoviesMethod = MovieServiceGrpc.getGetTrendingMoviesMethod) == null) {
          MovieServiceGrpc.getGetTrendingMoviesMethod = getGetTrendingMoviesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.GetTrendingMoviesRequest, com.movieplatform.proto.movie.GetTrendingMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTrendingMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.GetTrendingMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.GetTrendingMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("GetTrendingMovies"))
              .build();
        }
      }
    }
    return getGetTrendingMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetSimilarMoviesRequest,
      com.movieplatform.proto.movie.GetSimilarMoviesResponse> getGetSimilarMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSimilarMovies",
      requestType = com.movieplatform.proto.movie.GetSimilarMoviesRequest.class,
      responseType = com.movieplatform.proto.movie.GetSimilarMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetSimilarMoviesRequest,
      com.movieplatform.proto.movie.GetSimilarMoviesResponse> getGetSimilarMoviesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.movie.GetSimilarMoviesRequest, com.movieplatform.proto.movie.GetSimilarMoviesResponse> getGetSimilarMoviesMethod;
    if ((getGetSimilarMoviesMethod = MovieServiceGrpc.getGetSimilarMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetSimilarMoviesMethod = MovieServiceGrpc.getGetSimilarMoviesMethod) == null) {
          MovieServiceGrpc.getGetSimilarMoviesMethod = getGetSimilarMoviesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.movie.GetSimilarMoviesRequest, com.movieplatform.proto.movie.GetSimilarMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSimilarMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.GetSimilarMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.movie.GetSimilarMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("GetSimilarMovies"))
              .build();
        }
      }
    }
    return getGetSimilarMoviesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub>() {
        @java.lang.Override
        public MovieServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceStub(channel, callOptions);
        }
      };
    return MovieServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub>() {
        @java.lang.Override
        public MovieServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceBlockingStub(channel, callOptions);
        }
      };
    return MovieServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub>() {
        @java.lang.Override
        public MovieServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceFutureStub(channel, callOptions);
        }
      };
    return MovieServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Movie content management service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Movie CRUD operations
     * </pre>
     */
    default void createMovie(com.movieplatform.proto.movie.CreateMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.CreateMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMovieMethod(), responseObserver);
    }

    /**
     */
    default void getMovie(com.movieplatform.proto.movie.GetMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMovieMethod(), responseObserver);
    }

    /**
     */
    default void updateMovie(com.movieplatform.proto.movie.UpdateMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.UpdateMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMovieMethod(), responseObserver);
    }

    /**
     */
    default void deleteMovie(com.movieplatform.proto.movie.DeleteMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.DeleteMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMovieMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bulk operations
     * </pre>
     */
    default void getMoviesByIDs(com.movieplatform.proto.movie.GetMoviesByIDsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetMoviesByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMoviesByIDsMethod(), responseObserver);
    }

    /**
     */
    default void bulkUpdateMovies(com.movieplatform.proto.movie.BulkUpdateMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.BulkUpdateMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBulkUpdateMoviesMethod(), responseObserver);
    }

    /**
     */
    default void bulkDeleteMovies(com.movieplatform.proto.movie.BulkDeleteMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.BulkDeleteMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBulkDeleteMoviesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Content Management
     * </pre>
     */
    default void validateMovie(com.movieplatform.proto.movie.ValidateMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.ValidateMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateMovieMethod(), responseObserver);
    }

    /**
     */
    default void publishMovie(com.movieplatform.proto.movie.PublishMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.PublishMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishMovieMethod(), responseObserver);
    }

    /**
     */
    default void unpublishMovie(com.movieplatform.proto.movie.UnpublishMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.UnpublishMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnpublishMovieMethod(), responseObserver);
    }

    /**
     * <pre>
     * Search and Discovery
     * </pre>
     */
    default void searchMovies(com.movieplatform.proto.movie.SearchMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.SearchMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMoviesMethod(), responseObserver);
    }

    /**
     */
    default void getPopularMovies(com.movieplatform.proto.movie.GetPopularMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetPopularMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPopularMoviesMethod(), responseObserver);
    }

    /**
     */
    default void getTrendingMovies(com.movieplatform.proto.movie.GetTrendingMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetTrendingMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTrendingMoviesMethod(), responseObserver);
    }

    /**
     */
    default void getSimilarMovies(com.movieplatform.proto.movie.GetSimilarMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetSimilarMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSimilarMoviesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MovieService.
   * <pre>
   * Movie content management service
   * </pre>
   */
  public static abstract class MovieServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MovieServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MovieService.
   * <pre>
   * Movie content management service
   * </pre>
   */
  public static final class MovieServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MovieServiceStub> {
    private MovieServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Movie CRUD operations
     * </pre>
     */
    public void createMovie(com.movieplatform.proto.movie.CreateMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.CreateMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMovie(com.movieplatform.proto.movie.GetMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMovie(com.movieplatform.proto.movie.UpdateMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.UpdateMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMovie(com.movieplatform.proto.movie.DeleteMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.DeleteMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bulk operations
     * </pre>
     */
    public void getMoviesByIDs(com.movieplatform.proto.movie.GetMoviesByIDsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetMoviesByIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMoviesByIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bulkUpdateMovies(com.movieplatform.proto.movie.BulkUpdateMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.BulkUpdateMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBulkUpdateMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bulkDeleteMovies(com.movieplatform.proto.movie.BulkDeleteMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.BulkDeleteMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBulkDeleteMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Content Management
     * </pre>
     */
    public void validateMovie(com.movieplatform.proto.movie.ValidateMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.ValidateMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void publishMovie(com.movieplatform.proto.movie.PublishMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.PublishMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unpublishMovie(com.movieplatform.proto.movie.UnpublishMovieRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.UnpublishMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnpublishMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Search and Discovery
     * </pre>
     */
    public void searchMovies(com.movieplatform.proto.movie.SearchMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.SearchMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPopularMovies(com.movieplatform.proto.movie.GetPopularMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetPopularMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPopularMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTrendingMovies(com.movieplatform.proto.movie.GetTrendingMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetTrendingMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTrendingMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSimilarMovies(com.movieplatform.proto.movie.GetSimilarMoviesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetSimilarMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSimilarMoviesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MovieService.
   * <pre>
   * Movie content management service
   * </pre>
   */
  public static final class MovieServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MovieServiceBlockingStub> {
    private MovieServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Movie CRUD operations
     * </pre>
     */
    public com.movieplatform.proto.movie.CreateMovieResponse createMovie(com.movieplatform.proto.movie.CreateMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.movie.GetMovieResponse getMovie(com.movieplatform.proto.movie.GetMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.movie.UpdateMovieResponse updateMovie(com.movieplatform.proto.movie.UpdateMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.movie.DeleteMovieResponse deleteMovie(com.movieplatform.proto.movie.DeleteMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMovieMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bulk operations
     * </pre>
     */
    public com.movieplatform.proto.movie.GetMoviesByIDsResponse getMoviesByIDs(com.movieplatform.proto.movie.GetMoviesByIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMoviesByIDsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.movie.BulkUpdateMoviesResponse bulkUpdateMovies(com.movieplatform.proto.movie.BulkUpdateMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBulkUpdateMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.movie.BulkDeleteMoviesResponse bulkDeleteMovies(com.movieplatform.proto.movie.BulkDeleteMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBulkDeleteMoviesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Content Management
     * </pre>
     */
    public com.movieplatform.proto.movie.ValidateMovieResponse validateMovie(com.movieplatform.proto.movie.ValidateMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.movie.PublishMovieResponse publishMovie(com.movieplatform.proto.movie.PublishMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.movie.UnpublishMovieResponse unpublishMovie(com.movieplatform.proto.movie.UnpublishMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnpublishMovieMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Search and Discovery
     * </pre>
     */
    public com.movieplatform.proto.movie.SearchMoviesResponse searchMovies(com.movieplatform.proto.movie.SearchMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.movie.GetPopularMoviesResponse getPopularMovies(com.movieplatform.proto.movie.GetPopularMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPopularMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.movie.GetTrendingMoviesResponse getTrendingMovies(com.movieplatform.proto.movie.GetTrendingMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrendingMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.movie.GetSimilarMoviesResponse getSimilarMovies(com.movieplatform.proto.movie.GetSimilarMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSimilarMoviesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MovieService.
   * <pre>
   * Movie content management service
   * </pre>
   */
  public static final class MovieServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MovieServiceFutureStub> {
    private MovieServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Movie CRUD operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.CreateMovieResponse> createMovie(
        com.movieplatform.proto.movie.CreateMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.GetMovieResponse> getMovie(
        com.movieplatform.proto.movie.GetMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.UpdateMovieResponse> updateMovie(
        com.movieplatform.proto.movie.UpdateMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.DeleteMovieResponse> deleteMovie(
        com.movieplatform.proto.movie.DeleteMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMovieMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bulk operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.GetMoviesByIDsResponse> getMoviesByIDs(
        com.movieplatform.proto.movie.GetMoviesByIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMoviesByIDsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.BulkUpdateMoviesResponse> bulkUpdateMovies(
        com.movieplatform.proto.movie.BulkUpdateMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBulkUpdateMoviesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.BulkDeleteMoviesResponse> bulkDeleteMovies(
        com.movieplatform.proto.movie.BulkDeleteMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBulkDeleteMoviesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Content Management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.ValidateMovieResponse> validateMovie(
        com.movieplatform.proto.movie.ValidateMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.PublishMovieResponse> publishMovie(
        com.movieplatform.proto.movie.PublishMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.UnpublishMovieResponse> unpublishMovie(
        com.movieplatform.proto.movie.UnpublishMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnpublishMovieMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Search and Discovery
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.SearchMoviesResponse> searchMovies(
        com.movieplatform.proto.movie.SearchMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMoviesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.GetPopularMoviesResponse> getPopularMovies(
        com.movieplatform.proto.movie.GetPopularMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPopularMoviesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.GetTrendingMoviesResponse> getTrendingMovies(
        com.movieplatform.proto.movie.GetTrendingMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTrendingMoviesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.movie.GetSimilarMoviesResponse> getSimilarMovies(
        com.movieplatform.proto.movie.GetSimilarMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSimilarMoviesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MOVIE = 0;
  private static final int METHODID_GET_MOVIE = 1;
  private static final int METHODID_UPDATE_MOVIE = 2;
  private static final int METHODID_DELETE_MOVIE = 3;
  private static final int METHODID_GET_MOVIES_BY_IDS = 4;
  private static final int METHODID_BULK_UPDATE_MOVIES = 5;
  private static final int METHODID_BULK_DELETE_MOVIES = 6;
  private static final int METHODID_VALIDATE_MOVIE = 7;
  private static final int METHODID_PUBLISH_MOVIE = 8;
  private static final int METHODID_UNPUBLISH_MOVIE = 9;
  private static final int METHODID_SEARCH_MOVIES = 10;
  private static final int METHODID_GET_POPULAR_MOVIES = 11;
  private static final int METHODID_GET_TRENDING_MOVIES = 12;
  private static final int METHODID_GET_SIMILAR_MOVIES = 13;

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
        case METHODID_CREATE_MOVIE:
          serviceImpl.createMovie((com.movieplatform.proto.movie.CreateMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.CreateMovieResponse>) responseObserver);
          break;
        case METHODID_GET_MOVIE:
          serviceImpl.getMovie((com.movieplatform.proto.movie.GetMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetMovieResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MOVIE:
          serviceImpl.updateMovie((com.movieplatform.proto.movie.UpdateMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.UpdateMovieResponse>) responseObserver);
          break;
        case METHODID_DELETE_MOVIE:
          serviceImpl.deleteMovie((com.movieplatform.proto.movie.DeleteMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.DeleteMovieResponse>) responseObserver);
          break;
        case METHODID_GET_MOVIES_BY_IDS:
          serviceImpl.getMoviesByIDs((com.movieplatform.proto.movie.GetMoviesByIDsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetMoviesByIDsResponse>) responseObserver);
          break;
        case METHODID_BULK_UPDATE_MOVIES:
          serviceImpl.bulkUpdateMovies((com.movieplatform.proto.movie.BulkUpdateMoviesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.BulkUpdateMoviesResponse>) responseObserver);
          break;
        case METHODID_BULK_DELETE_MOVIES:
          serviceImpl.bulkDeleteMovies((com.movieplatform.proto.movie.BulkDeleteMoviesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.BulkDeleteMoviesResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_MOVIE:
          serviceImpl.validateMovie((com.movieplatform.proto.movie.ValidateMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.ValidateMovieResponse>) responseObserver);
          break;
        case METHODID_PUBLISH_MOVIE:
          serviceImpl.publishMovie((com.movieplatform.proto.movie.PublishMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.PublishMovieResponse>) responseObserver);
          break;
        case METHODID_UNPUBLISH_MOVIE:
          serviceImpl.unpublishMovie((com.movieplatform.proto.movie.UnpublishMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.UnpublishMovieResponse>) responseObserver);
          break;
        case METHODID_SEARCH_MOVIES:
          serviceImpl.searchMovies((com.movieplatform.proto.movie.SearchMoviesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.SearchMoviesResponse>) responseObserver);
          break;
        case METHODID_GET_POPULAR_MOVIES:
          serviceImpl.getPopularMovies((com.movieplatform.proto.movie.GetPopularMoviesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetPopularMoviesResponse>) responseObserver);
          break;
        case METHODID_GET_TRENDING_MOVIES:
          serviceImpl.getTrendingMovies((com.movieplatform.proto.movie.GetTrendingMoviesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetTrendingMoviesResponse>) responseObserver);
          break;
        case METHODID_GET_SIMILAR_MOVIES:
          serviceImpl.getSimilarMovies((com.movieplatform.proto.movie.GetSimilarMoviesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.movie.GetSimilarMoviesResponse>) responseObserver);
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
          getCreateMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.CreateMovieRequest,
              com.movieplatform.proto.movie.CreateMovieResponse>(
                service, METHODID_CREATE_MOVIE)))
        .addMethod(
          getGetMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.GetMovieRequest,
              com.movieplatform.proto.movie.GetMovieResponse>(
                service, METHODID_GET_MOVIE)))
        .addMethod(
          getUpdateMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.UpdateMovieRequest,
              com.movieplatform.proto.movie.UpdateMovieResponse>(
                service, METHODID_UPDATE_MOVIE)))
        .addMethod(
          getDeleteMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.DeleteMovieRequest,
              com.movieplatform.proto.movie.DeleteMovieResponse>(
                service, METHODID_DELETE_MOVIE)))
        .addMethod(
          getGetMoviesByIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.GetMoviesByIDsRequest,
              com.movieplatform.proto.movie.GetMoviesByIDsResponse>(
                service, METHODID_GET_MOVIES_BY_IDS)))
        .addMethod(
          getBulkUpdateMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.BulkUpdateMoviesRequest,
              com.movieplatform.proto.movie.BulkUpdateMoviesResponse>(
                service, METHODID_BULK_UPDATE_MOVIES)))
        .addMethod(
          getBulkDeleteMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.BulkDeleteMoviesRequest,
              com.movieplatform.proto.movie.BulkDeleteMoviesResponse>(
                service, METHODID_BULK_DELETE_MOVIES)))
        .addMethod(
          getValidateMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.ValidateMovieRequest,
              com.movieplatform.proto.movie.ValidateMovieResponse>(
                service, METHODID_VALIDATE_MOVIE)))
        .addMethod(
          getPublishMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.PublishMovieRequest,
              com.movieplatform.proto.movie.PublishMovieResponse>(
                service, METHODID_PUBLISH_MOVIE)))
        .addMethod(
          getUnpublishMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.UnpublishMovieRequest,
              com.movieplatform.proto.movie.UnpublishMovieResponse>(
                service, METHODID_UNPUBLISH_MOVIE)))
        .addMethod(
          getSearchMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.SearchMoviesRequest,
              com.movieplatform.proto.movie.SearchMoviesResponse>(
                service, METHODID_SEARCH_MOVIES)))
        .addMethod(
          getGetPopularMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.GetPopularMoviesRequest,
              com.movieplatform.proto.movie.GetPopularMoviesResponse>(
                service, METHODID_GET_POPULAR_MOVIES)))
        .addMethod(
          getGetTrendingMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.GetTrendingMoviesRequest,
              com.movieplatform.proto.movie.GetTrendingMoviesResponse>(
                service, METHODID_GET_TRENDING_MOVIES)))
        .addMethod(
          getGetSimilarMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.movie.GetSimilarMoviesRequest,
              com.movieplatform.proto.movie.GetSimilarMoviesResponse>(
                service, METHODID_GET_SIMILAR_MOVIES)))
        .build();
  }

  private static abstract class MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.movieplatform.proto.movie.MovieServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MovieService");
    }
  }

  private static final class MovieServiceFileDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier {
    MovieServiceFileDescriptorSupplier() {}
  }

  private static final class MovieServiceMethodDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MovieServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MovieServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieServiceFileDescriptorSupplier())
              .addMethod(getCreateMovieMethod())
              .addMethod(getGetMovieMethod())
              .addMethod(getUpdateMovieMethod())
              .addMethod(getDeleteMovieMethod())
              .addMethod(getGetMoviesByIDsMethod())
              .addMethod(getBulkUpdateMoviesMethod())
              .addMethod(getBulkDeleteMoviesMethod())
              .addMethod(getValidateMovieMethod())
              .addMethod(getPublishMovieMethod())
              .addMethod(getUnpublishMovieMethod())
              .addMethod(getSearchMoviesMethod())
              .addMethod(getGetPopularMoviesMethod())
              .addMethod(getGetTrendingMoviesMethod())
              .addMethod(getGetSimilarMoviesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
