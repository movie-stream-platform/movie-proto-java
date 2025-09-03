package com.movieplatform.proto.recommendation;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ML-based recommendation engine service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: recommendation/recommendation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RecommendationServiceGrpc {

  private RecommendationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.recommendation.RecommendationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest,
      com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse> getGetContentBasedRecommendationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContentBasedRecommendations",
      requestType = com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest,
      com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse> getGetContentBasedRecommendationsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest, com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse> getGetContentBasedRecommendationsMethod;
    if ((getGetContentBasedRecommendationsMethod = RecommendationServiceGrpc.getGetContentBasedRecommendationsMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetContentBasedRecommendationsMethod = RecommendationServiceGrpc.getGetContentBasedRecommendationsMethod) == null) {
          RecommendationServiceGrpc.getGetContentBasedRecommendationsMethod = getGetContentBasedRecommendationsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest, com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContentBasedRecommendations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetContentBasedRecommendations"))
              .build();
        }
      }
    }
    return getGetContentBasedRecommendationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetSimilarContentRequest,
      com.movieplatform.proto.recommendation.GetSimilarContentResponse> getGetSimilarContentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSimilarContent",
      requestType = com.movieplatform.proto.recommendation.GetSimilarContentRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetSimilarContentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetSimilarContentRequest,
      com.movieplatform.proto.recommendation.GetSimilarContentResponse> getGetSimilarContentMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetSimilarContentRequest, com.movieplatform.proto.recommendation.GetSimilarContentResponse> getGetSimilarContentMethod;
    if ((getGetSimilarContentMethod = RecommendationServiceGrpc.getGetSimilarContentMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetSimilarContentMethod = RecommendationServiceGrpc.getGetSimilarContentMethod) == null) {
          RecommendationServiceGrpc.getGetSimilarContentMethod = getGetSimilarContentMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetSimilarContentRequest, com.movieplatform.proto.recommendation.GetSimilarContentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSimilarContent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetSimilarContentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetSimilarContentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetSimilarContent"))
              .build();
        }
      }
    }
    return getGetSimilarContentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetContentFeaturesRequest,
      com.movieplatform.proto.recommendation.GetContentFeaturesResponse> getGetContentFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetContentFeatures",
      requestType = com.movieplatform.proto.recommendation.GetContentFeaturesRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetContentFeaturesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetContentFeaturesRequest,
      com.movieplatform.proto.recommendation.GetContentFeaturesResponse> getGetContentFeaturesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetContentFeaturesRequest, com.movieplatform.proto.recommendation.GetContentFeaturesResponse> getGetContentFeaturesMethod;
    if ((getGetContentFeaturesMethod = RecommendationServiceGrpc.getGetContentFeaturesMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetContentFeaturesMethod = RecommendationServiceGrpc.getGetContentFeaturesMethod) == null) {
          RecommendationServiceGrpc.getGetContentFeaturesMethod = getGetContentFeaturesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetContentFeaturesRequest, com.movieplatform.proto.recommendation.GetContentFeaturesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetContentFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetContentFeaturesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetContentFeaturesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetContentFeatures"))
              .build();
        }
      }
    }
    return getGetContentFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest,
      com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse> getGetCollaborativeRecommendationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCollaborativeRecommendations",
      requestType = com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest,
      com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse> getGetCollaborativeRecommendationsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest, com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse> getGetCollaborativeRecommendationsMethod;
    if ((getGetCollaborativeRecommendationsMethod = RecommendationServiceGrpc.getGetCollaborativeRecommendationsMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetCollaborativeRecommendationsMethod = RecommendationServiceGrpc.getGetCollaborativeRecommendationsMethod) == null) {
          RecommendationServiceGrpc.getGetCollaborativeRecommendationsMethod = getGetCollaborativeRecommendationsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest, com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCollaborativeRecommendations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetCollaborativeRecommendations"))
              .build();
        }
      }
    }
    return getGetCollaborativeRecommendationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetUserSimilarityRequest,
      com.movieplatform.proto.recommendation.GetUserSimilarityResponse> getGetUserSimilarityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserSimilarity",
      requestType = com.movieplatform.proto.recommendation.GetUserSimilarityRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetUserSimilarityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetUserSimilarityRequest,
      com.movieplatform.proto.recommendation.GetUserSimilarityResponse> getGetUserSimilarityMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetUserSimilarityRequest, com.movieplatform.proto.recommendation.GetUserSimilarityResponse> getGetUserSimilarityMethod;
    if ((getGetUserSimilarityMethod = RecommendationServiceGrpc.getGetUserSimilarityMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetUserSimilarityMethod = RecommendationServiceGrpc.getGetUserSimilarityMethod) == null) {
          RecommendationServiceGrpc.getGetUserSimilarityMethod = getGetUserSimilarityMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetUserSimilarityRequest, com.movieplatform.proto.recommendation.GetUserSimilarityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserSimilarity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetUserSimilarityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetUserSimilarityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetUserSimilarity"))
              .build();
        }
      }
    }
    return getGetUserSimilarityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetItemSimilarityRequest,
      com.movieplatform.proto.recommendation.GetItemSimilarityResponse> getGetItemSimilarityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItemSimilarity",
      requestType = com.movieplatform.proto.recommendation.GetItemSimilarityRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetItemSimilarityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetItemSimilarityRequest,
      com.movieplatform.proto.recommendation.GetItemSimilarityResponse> getGetItemSimilarityMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetItemSimilarityRequest, com.movieplatform.proto.recommendation.GetItemSimilarityResponse> getGetItemSimilarityMethod;
    if ((getGetItemSimilarityMethod = RecommendationServiceGrpc.getGetItemSimilarityMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetItemSimilarityMethod = RecommendationServiceGrpc.getGetItemSimilarityMethod) == null) {
          RecommendationServiceGrpc.getGetItemSimilarityMethod = getGetItemSimilarityMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetItemSimilarityRequest, com.movieplatform.proto.recommendation.GetItemSimilarityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetItemSimilarity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetItemSimilarityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetItemSimilarityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetItemSimilarity"))
              .build();
        }
      }
    }
    return getGetItemSimilarityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest,
      com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse> getGetHybridRecommendationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetHybridRecommendations",
      requestType = com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest,
      com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse> getGetHybridRecommendationsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest, com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse> getGetHybridRecommendationsMethod;
    if ((getGetHybridRecommendationsMethod = RecommendationServiceGrpc.getGetHybridRecommendationsMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetHybridRecommendationsMethod = RecommendationServiceGrpc.getGetHybridRecommendationsMethod) == null) {
          RecommendationServiceGrpc.getGetHybridRecommendationsMethod = getGetHybridRecommendationsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest, com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetHybridRecommendations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetHybridRecommendations"))
              .build();
        }
      }
    }
    return getGetHybridRecommendationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest,
      com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse> getGetPersonalizedRecommendationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPersonalizedRecommendations",
      requestType = com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest,
      com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse> getGetPersonalizedRecommendationsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest, com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse> getGetPersonalizedRecommendationsMethod;
    if ((getGetPersonalizedRecommendationsMethod = RecommendationServiceGrpc.getGetPersonalizedRecommendationsMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetPersonalizedRecommendationsMethod = RecommendationServiceGrpc.getGetPersonalizedRecommendationsMethod) == null) {
          RecommendationServiceGrpc.getGetPersonalizedRecommendationsMethod = getGetPersonalizedRecommendationsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest, com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPersonalizedRecommendations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetPersonalizedRecommendations"))
              .build();
        }
      }
    }
    return getGetPersonalizedRecommendationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest,
      com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse> getAnalyzeUserBehaviorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalyzeUserBehavior",
      requestType = com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest.class,
      responseType = com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest,
      com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse> getAnalyzeUserBehaviorMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest, com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse> getAnalyzeUserBehaviorMethod;
    if ((getAnalyzeUserBehaviorMethod = RecommendationServiceGrpc.getAnalyzeUserBehaviorMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getAnalyzeUserBehaviorMethod = RecommendationServiceGrpc.getAnalyzeUserBehaviorMethod) == null) {
          RecommendationServiceGrpc.getAnalyzeUserBehaviorMethod = getAnalyzeUserBehaviorMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest, com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AnalyzeUserBehavior"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("AnalyzeUserBehavior"))
              .build();
        }
      }
    }
    return getAnalyzeUserBehaviorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.TrackUserInteractionRequest,
      com.movieplatform.proto.recommendation.TrackUserInteractionResponse> getTrackUserInteractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrackUserInteraction",
      requestType = com.movieplatform.proto.recommendation.TrackUserInteractionRequest.class,
      responseType = com.movieplatform.proto.recommendation.TrackUserInteractionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.TrackUserInteractionRequest,
      com.movieplatform.proto.recommendation.TrackUserInteractionResponse> getTrackUserInteractionMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.TrackUserInteractionRequest, com.movieplatform.proto.recommendation.TrackUserInteractionResponse> getTrackUserInteractionMethod;
    if ((getTrackUserInteractionMethod = RecommendationServiceGrpc.getTrackUserInteractionMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getTrackUserInteractionMethod = RecommendationServiceGrpc.getTrackUserInteractionMethod) == null) {
          RecommendationServiceGrpc.getTrackUserInteractionMethod = getTrackUserInteractionMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.TrackUserInteractionRequest, com.movieplatform.proto.recommendation.TrackUserInteractionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrackUserInteraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.TrackUserInteractionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.TrackUserInteractionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("TrackUserInteraction"))
              .build();
        }
      }
    }
    return getTrackUserInteractionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetUserPreferencesRequest,
      com.movieplatform.proto.recommendation.GetUserPreferencesResponse> getGetUserPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPreferences",
      requestType = com.movieplatform.proto.recommendation.GetUserPreferencesRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetUserPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetUserPreferencesRequest,
      com.movieplatform.proto.recommendation.GetUserPreferencesResponse> getGetUserPreferencesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetUserPreferencesRequest, com.movieplatform.proto.recommendation.GetUserPreferencesResponse> getGetUserPreferencesMethod;
    if ((getGetUserPreferencesMethod = RecommendationServiceGrpc.getGetUserPreferencesMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetUserPreferencesMethod = RecommendationServiceGrpc.getGetUserPreferencesMethod) == null) {
          RecommendationServiceGrpc.getGetUserPreferencesMethod = getGetUserPreferencesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetUserPreferencesRequest, com.movieplatform.proto.recommendation.GetUserPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetUserPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetUserPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetUserPreferences"))
              .build();
        }
      }
    }
    return getGetUserPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.TrainRecommendationModelRequest,
      com.movieplatform.proto.recommendation.TrainRecommendationModelResponse> getTrainRecommendationModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrainRecommendationModel",
      requestType = com.movieplatform.proto.recommendation.TrainRecommendationModelRequest.class,
      responseType = com.movieplatform.proto.recommendation.TrainRecommendationModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.TrainRecommendationModelRequest,
      com.movieplatform.proto.recommendation.TrainRecommendationModelResponse> getTrainRecommendationModelMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.TrainRecommendationModelRequest, com.movieplatform.proto.recommendation.TrainRecommendationModelResponse> getTrainRecommendationModelMethod;
    if ((getTrainRecommendationModelMethod = RecommendationServiceGrpc.getTrainRecommendationModelMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getTrainRecommendationModelMethod = RecommendationServiceGrpc.getTrainRecommendationModelMethod) == null) {
          RecommendationServiceGrpc.getTrainRecommendationModelMethod = getTrainRecommendationModelMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.TrainRecommendationModelRequest, com.movieplatform.proto.recommendation.TrainRecommendationModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrainRecommendationModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.TrainRecommendationModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.TrainRecommendationModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("TrainRecommendationModel"))
              .build();
        }
      }
    }
    return getTrainRecommendationModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest,
      com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse> getUpdateRecommendationModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRecommendationModel",
      requestType = com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest.class,
      responseType = com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest,
      com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse> getUpdateRecommendationModelMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest, com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse> getUpdateRecommendationModelMethod;
    if ((getUpdateRecommendationModelMethod = RecommendationServiceGrpc.getUpdateRecommendationModelMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getUpdateRecommendationModelMethod = RecommendationServiceGrpc.getUpdateRecommendationModelMethod) == null) {
          RecommendationServiceGrpc.getUpdateRecommendationModelMethod = getUpdateRecommendationModelMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest, com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRecommendationModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("UpdateRecommendationModel"))
              .build();
        }
      }
    }
    return getUpdateRecommendationModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetModelPerformanceRequest,
      com.movieplatform.proto.recommendation.GetModelPerformanceResponse> getGetModelPerformanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetModelPerformance",
      requestType = com.movieplatform.proto.recommendation.GetModelPerformanceRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetModelPerformanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetModelPerformanceRequest,
      com.movieplatform.proto.recommendation.GetModelPerformanceResponse> getGetModelPerformanceMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetModelPerformanceRequest, com.movieplatform.proto.recommendation.GetModelPerformanceResponse> getGetModelPerformanceMethod;
    if ((getGetModelPerformanceMethod = RecommendationServiceGrpc.getGetModelPerformanceMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetModelPerformanceMethod = RecommendationServiceGrpc.getGetModelPerformanceMethod) == null) {
          RecommendationServiceGrpc.getGetModelPerformanceMethod = getGetModelPerformanceMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetModelPerformanceRequest, com.movieplatform.proto.recommendation.GetModelPerformanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetModelPerformance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetModelPerformanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetModelPerformanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetModelPerformance"))
              .build();
        }
      }
    }
    return getGetModelPerformanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest,
      com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse> getGetRecommendationAnalyticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecommendationAnalytics",
      requestType = com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest,
      com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse> getGetRecommendationAnalyticsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest, com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse> getGetRecommendationAnalyticsMethod;
    if ((getGetRecommendationAnalyticsMethod = RecommendationServiceGrpc.getGetRecommendationAnalyticsMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetRecommendationAnalyticsMethod = RecommendationServiceGrpc.getGetRecommendationAnalyticsMethod) == null) {
          RecommendationServiceGrpc.getGetRecommendationAnalyticsMethod = getGetRecommendationAnalyticsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest, com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecommendationAnalytics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetRecommendationAnalytics"))
              .build();
        }
      }
    }
    return getGetRecommendationAnalyticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest,
      com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse> getGetRecommendationInsightsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRecommendationInsights",
      requestType = com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest.class,
      responseType = com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest,
      com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse> getGetRecommendationInsightsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest, com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse> getGetRecommendationInsightsMethod;
    if ((getGetRecommendationInsightsMethod = RecommendationServiceGrpc.getGetRecommendationInsightsMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getGetRecommendationInsightsMethod = RecommendationServiceGrpc.getGetRecommendationInsightsMethod) == null) {
          RecommendationServiceGrpc.getGetRecommendationInsightsMethod = getGetRecommendationInsightsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest, com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRecommendationInsights"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("GetRecommendationInsights"))
              .build();
        }
      }
    }
    return getGetRecommendationInsightsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.ExportRecommendationDataRequest,
      com.movieplatform.proto.recommendation.ExportRecommendationDataResponse> getExportRecommendationDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExportRecommendationData",
      requestType = com.movieplatform.proto.recommendation.ExportRecommendationDataRequest.class,
      responseType = com.movieplatform.proto.recommendation.ExportRecommendationDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.ExportRecommendationDataRequest,
      com.movieplatform.proto.recommendation.ExportRecommendationDataResponse> getExportRecommendationDataMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.recommendation.ExportRecommendationDataRequest, com.movieplatform.proto.recommendation.ExportRecommendationDataResponse> getExportRecommendationDataMethod;
    if ((getExportRecommendationDataMethod = RecommendationServiceGrpc.getExportRecommendationDataMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getExportRecommendationDataMethod = RecommendationServiceGrpc.getExportRecommendationDataMethod) == null) {
          RecommendationServiceGrpc.getExportRecommendationDataMethod = getExportRecommendationDataMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.recommendation.ExportRecommendationDataRequest, com.movieplatform.proto.recommendation.ExportRecommendationDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExportRecommendationData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.ExportRecommendationDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.recommendation.ExportRecommendationDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("ExportRecommendationData"))
              .build();
        }
      }
    }
    return getExportRecommendationDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommendationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceStub>() {
        @java.lang.Override
        public RecommendationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationServiceStub(channel, callOptions);
        }
      };
    return RecommendationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommendationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceBlockingStub>() {
        @java.lang.Override
        public RecommendationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationServiceBlockingStub(channel, callOptions);
        }
      };
    return RecommendationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommendationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationServiceFutureStub>() {
        @java.lang.Override
        public RecommendationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationServiceFutureStub(channel, callOptions);
        }
      };
    return RecommendationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ML-based recommendation engine service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Content-based recommendations
     * </pre>
     */
    default void getContentBasedRecommendations(com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContentBasedRecommendationsMethod(), responseObserver);
    }

    /**
     */
    default void getSimilarContent(com.movieplatform.proto.recommendation.GetSimilarContentRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetSimilarContentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSimilarContentMethod(), responseObserver);
    }

    /**
     */
    default void getContentFeatures(com.movieplatform.proto.recommendation.GetContentFeaturesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetContentFeaturesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetContentFeaturesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Collaborative filtering
     * </pre>
     */
    default void getCollaborativeRecommendations(com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCollaborativeRecommendationsMethod(), responseObserver);
    }

    /**
     */
    default void getUserSimilarity(com.movieplatform.proto.recommendation.GetUserSimilarityRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetUserSimilarityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserSimilarityMethod(), responseObserver);
    }

    /**
     */
    default void getItemSimilarity(com.movieplatform.proto.recommendation.GetItemSimilarityRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetItemSimilarityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetItemSimilarityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Hybrid recommendations
     * </pre>
     */
    default void getHybridRecommendations(com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHybridRecommendationsMethod(), responseObserver);
    }

    /**
     */
    default void getPersonalizedRecommendations(com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPersonalizedRecommendationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Behavior analysis
     * </pre>
     */
    default void analyzeUserBehavior(com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAnalyzeUserBehaviorMethod(), responseObserver);
    }

    /**
     */
    default void trackUserInteraction(com.movieplatform.proto.recommendation.TrackUserInteractionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.TrackUserInteractionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrackUserInteractionMethod(), responseObserver);
    }

    /**
     */
    default void getUserPreferences(com.movieplatform.proto.recommendation.GetUserPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetUserPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserPreferencesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Model management
     * </pre>
     */
    default void trainRecommendationModel(com.movieplatform.proto.recommendation.TrainRecommendationModelRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.TrainRecommendationModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrainRecommendationModelMethod(), responseObserver);
    }

    /**
     */
    default void updateRecommendationModel(com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRecommendationModelMethod(), responseObserver);
    }

    /**
     */
    default void getModelPerformance(com.movieplatform.proto.recommendation.GetModelPerformanceRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetModelPerformanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModelPerformanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Analytics and insights
     * </pre>
     */
    default void getRecommendationAnalytics(com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRecommendationAnalyticsMethod(), responseObserver);
    }

    /**
     */
    default void getRecommendationInsights(com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRecommendationInsightsMethod(), responseObserver);
    }

    /**
     */
    default void exportRecommendationData(com.movieplatform.proto.recommendation.ExportRecommendationDataRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.ExportRecommendationDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExportRecommendationDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RecommendationService.
   * <pre>
   * ML-based recommendation engine service
   * </pre>
   */
  public static abstract class RecommendationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RecommendationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RecommendationService.
   * <pre>
   * ML-based recommendation engine service
   * </pre>
   */
  public static final class RecommendationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RecommendationServiceStub> {
    private RecommendationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Content-based recommendations
     * </pre>
     */
    public void getContentBasedRecommendations(com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContentBasedRecommendationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSimilarContent(com.movieplatform.proto.recommendation.GetSimilarContentRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetSimilarContentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSimilarContentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContentFeatures(com.movieplatform.proto.recommendation.GetContentFeaturesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetContentFeaturesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetContentFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Collaborative filtering
     * </pre>
     */
    public void getCollaborativeRecommendations(com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCollaborativeRecommendationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserSimilarity(com.movieplatform.proto.recommendation.GetUserSimilarityRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetUserSimilarityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserSimilarityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemSimilarity(com.movieplatform.proto.recommendation.GetItemSimilarityRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetItemSimilarityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetItemSimilarityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Hybrid recommendations
     * </pre>
     */
    public void getHybridRecommendations(com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHybridRecommendationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPersonalizedRecommendations(com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPersonalizedRecommendationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Behavior analysis
     * </pre>
     */
    public void analyzeUserBehavior(com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAnalyzeUserBehaviorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trackUserInteraction(com.movieplatform.proto.recommendation.TrackUserInteractionRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.TrackUserInteractionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrackUserInteractionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserPreferences(com.movieplatform.proto.recommendation.GetUserPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetUserPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Model management
     * </pre>
     */
    public void trainRecommendationModel(com.movieplatform.proto.recommendation.TrainRecommendationModelRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.TrainRecommendationModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrainRecommendationModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRecommendationModel(com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRecommendationModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getModelPerformance(com.movieplatform.proto.recommendation.GetModelPerformanceRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetModelPerformanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModelPerformanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Analytics and insights
     * </pre>
     */
    public void getRecommendationAnalytics(com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRecommendationAnalyticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRecommendationInsights(com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRecommendationInsightsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void exportRecommendationData(com.movieplatform.proto.recommendation.ExportRecommendationDataRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.ExportRecommendationDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExportRecommendationDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RecommendationService.
   * <pre>
   * ML-based recommendation engine service
   * </pre>
   */
  public static final class RecommendationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RecommendationServiceBlockingStub> {
    private RecommendationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Content-based recommendations
     * </pre>
     */
    public com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse getContentBasedRecommendations(com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContentBasedRecommendationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.GetSimilarContentResponse getSimilarContent(com.movieplatform.proto.recommendation.GetSimilarContentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSimilarContentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.GetContentFeaturesResponse getContentFeatures(com.movieplatform.proto.recommendation.GetContentFeaturesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetContentFeaturesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Collaborative filtering
     * </pre>
     */
    public com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse getCollaborativeRecommendations(com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCollaborativeRecommendationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.GetUserSimilarityResponse getUserSimilarity(com.movieplatform.proto.recommendation.GetUserSimilarityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserSimilarityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.GetItemSimilarityResponse getItemSimilarity(com.movieplatform.proto.recommendation.GetItemSimilarityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetItemSimilarityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Hybrid recommendations
     * </pre>
     */
    public com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse getHybridRecommendations(com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHybridRecommendationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse getPersonalizedRecommendations(com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPersonalizedRecommendationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Behavior analysis
     * </pre>
     */
    public com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse analyzeUserBehavior(com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAnalyzeUserBehaviorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.TrackUserInteractionResponse trackUserInteraction(com.movieplatform.proto.recommendation.TrackUserInteractionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrackUserInteractionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.GetUserPreferencesResponse getUserPreferences(com.movieplatform.proto.recommendation.GetUserPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserPreferencesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Model management
     * </pre>
     */
    public com.movieplatform.proto.recommendation.TrainRecommendationModelResponse trainRecommendationModel(com.movieplatform.proto.recommendation.TrainRecommendationModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrainRecommendationModelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse updateRecommendationModel(com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRecommendationModelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.GetModelPerformanceResponse getModelPerformance(com.movieplatform.proto.recommendation.GetModelPerformanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModelPerformanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Analytics and insights
     * </pre>
     */
    public com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse getRecommendationAnalytics(com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRecommendationAnalyticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse getRecommendationInsights(com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRecommendationInsightsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.recommendation.ExportRecommendationDataResponse exportRecommendationData(com.movieplatform.proto.recommendation.ExportRecommendationDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExportRecommendationDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RecommendationService.
   * <pre>
   * ML-based recommendation engine service
   * </pre>
   */
  public static final class RecommendationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RecommendationServiceFutureStub> {
    private RecommendationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Content-based recommendations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse> getContentBasedRecommendations(
        com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContentBasedRecommendationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetSimilarContentResponse> getSimilarContent(
        com.movieplatform.proto.recommendation.GetSimilarContentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSimilarContentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetContentFeaturesResponse> getContentFeatures(
        com.movieplatform.proto.recommendation.GetContentFeaturesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetContentFeaturesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Collaborative filtering
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse> getCollaborativeRecommendations(
        com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCollaborativeRecommendationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetUserSimilarityResponse> getUserSimilarity(
        com.movieplatform.proto.recommendation.GetUserSimilarityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserSimilarityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetItemSimilarityResponse> getItemSimilarity(
        com.movieplatform.proto.recommendation.GetItemSimilarityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetItemSimilarityMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Hybrid recommendations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse> getHybridRecommendations(
        com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHybridRecommendationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse> getPersonalizedRecommendations(
        com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPersonalizedRecommendationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Behavior analysis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse> analyzeUserBehavior(
        com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAnalyzeUserBehaviorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.TrackUserInteractionResponse> trackUserInteraction(
        com.movieplatform.proto.recommendation.TrackUserInteractionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrackUserInteractionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetUserPreferencesResponse> getUserPreferences(
        com.movieplatform.proto.recommendation.GetUserPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserPreferencesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Model management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.TrainRecommendationModelResponse> trainRecommendationModel(
        com.movieplatform.proto.recommendation.TrainRecommendationModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrainRecommendationModelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse> updateRecommendationModel(
        com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRecommendationModelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetModelPerformanceResponse> getModelPerformance(
        com.movieplatform.proto.recommendation.GetModelPerformanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModelPerformanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Analytics and insights
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse> getRecommendationAnalytics(
        com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRecommendationAnalyticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse> getRecommendationInsights(
        com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRecommendationInsightsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.recommendation.ExportRecommendationDataResponse> exportRecommendationData(
        com.movieplatform.proto.recommendation.ExportRecommendationDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExportRecommendationDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CONTENT_BASED_RECOMMENDATIONS = 0;
  private static final int METHODID_GET_SIMILAR_CONTENT = 1;
  private static final int METHODID_GET_CONTENT_FEATURES = 2;
  private static final int METHODID_GET_COLLABORATIVE_RECOMMENDATIONS = 3;
  private static final int METHODID_GET_USER_SIMILARITY = 4;
  private static final int METHODID_GET_ITEM_SIMILARITY = 5;
  private static final int METHODID_GET_HYBRID_RECOMMENDATIONS = 6;
  private static final int METHODID_GET_PERSONALIZED_RECOMMENDATIONS = 7;
  private static final int METHODID_ANALYZE_USER_BEHAVIOR = 8;
  private static final int METHODID_TRACK_USER_INTERACTION = 9;
  private static final int METHODID_GET_USER_PREFERENCES = 10;
  private static final int METHODID_TRAIN_RECOMMENDATION_MODEL = 11;
  private static final int METHODID_UPDATE_RECOMMENDATION_MODEL = 12;
  private static final int METHODID_GET_MODEL_PERFORMANCE = 13;
  private static final int METHODID_GET_RECOMMENDATION_ANALYTICS = 14;
  private static final int METHODID_GET_RECOMMENDATION_INSIGHTS = 15;
  private static final int METHODID_EXPORT_RECOMMENDATION_DATA = 16;

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
        case METHODID_GET_CONTENT_BASED_RECOMMENDATIONS:
          serviceImpl.getContentBasedRecommendations((com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse>) responseObserver);
          break;
        case METHODID_GET_SIMILAR_CONTENT:
          serviceImpl.getSimilarContent((com.movieplatform.proto.recommendation.GetSimilarContentRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetSimilarContentResponse>) responseObserver);
          break;
        case METHODID_GET_CONTENT_FEATURES:
          serviceImpl.getContentFeatures((com.movieplatform.proto.recommendation.GetContentFeaturesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetContentFeaturesResponse>) responseObserver);
          break;
        case METHODID_GET_COLLABORATIVE_RECOMMENDATIONS:
          serviceImpl.getCollaborativeRecommendations((com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse>) responseObserver);
          break;
        case METHODID_GET_USER_SIMILARITY:
          serviceImpl.getUserSimilarity((com.movieplatform.proto.recommendation.GetUserSimilarityRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetUserSimilarityResponse>) responseObserver);
          break;
        case METHODID_GET_ITEM_SIMILARITY:
          serviceImpl.getItemSimilarity((com.movieplatform.proto.recommendation.GetItemSimilarityRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetItemSimilarityResponse>) responseObserver);
          break;
        case METHODID_GET_HYBRID_RECOMMENDATIONS:
          serviceImpl.getHybridRecommendations((com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse>) responseObserver);
          break;
        case METHODID_GET_PERSONALIZED_RECOMMENDATIONS:
          serviceImpl.getPersonalizedRecommendations((com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse>) responseObserver);
          break;
        case METHODID_ANALYZE_USER_BEHAVIOR:
          serviceImpl.analyzeUserBehavior((com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse>) responseObserver);
          break;
        case METHODID_TRACK_USER_INTERACTION:
          serviceImpl.trackUserInteraction((com.movieplatform.proto.recommendation.TrackUserInteractionRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.TrackUserInteractionResponse>) responseObserver);
          break;
        case METHODID_GET_USER_PREFERENCES:
          serviceImpl.getUserPreferences((com.movieplatform.proto.recommendation.GetUserPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetUserPreferencesResponse>) responseObserver);
          break;
        case METHODID_TRAIN_RECOMMENDATION_MODEL:
          serviceImpl.trainRecommendationModel((com.movieplatform.proto.recommendation.TrainRecommendationModelRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.TrainRecommendationModelResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RECOMMENDATION_MODEL:
          serviceImpl.updateRecommendationModel((com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse>) responseObserver);
          break;
        case METHODID_GET_MODEL_PERFORMANCE:
          serviceImpl.getModelPerformance((com.movieplatform.proto.recommendation.GetModelPerformanceRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetModelPerformanceResponse>) responseObserver);
          break;
        case METHODID_GET_RECOMMENDATION_ANALYTICS:
          serviceImpl.getRecommendationAnalytics((com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse>) responseObserver);
          break;
        case METHODID_GET_RECOMMENDATION_INSIGHTS:
          serviceImpl.getRecommendationInsights((com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse>) responseObserver);
          break;
        case METHODID_EXPORT_RECOMMENDATION_DATA:
          serviceImpl.exportRecommendationData((com.movieplatform.proto.recommendation.ExportRecommendationDataRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.recommendation.ExportRecommendationDataResponse>) responseObserver);
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
          getGetContentBasedRecommendationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetContentBasedRecommendationsRequest,
              com.movieplatform.proto.recommendation.GetContentBasedRecommendationsResponse>(
                service, METHODID_GET_CONTENT_BASED_RECOMMENDATIONS)))
        .addMethod(
          getGetSimilarContentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetSimilarContentRequest,
              com.movieplatform.proto.recommendation.GetSimilarContentResponse>(
                service, METHODID_GET_SIMILAR_CONTENT)))
        .addMethod(
          getGetContentFeaturesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetContentFeaturesRequest,
              com.movieplatform.proto.recommendation.GetContentFeaturesResponse>(
                service, METHODID_GET_CONTENT_FEATURES)))
        .addMethod(
          getGetCollaborativeRecommendationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsRequest,
              com.movieplatform.proto.recommendation.GetCollaborativeRecommendationsResponse>(
                service, METHODID_GET_COLLABORATIVE_RECOMMENDATIONS)))
        .addMethod(
          getGetUserSimilarityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetUserSimilarityRequest,
              com.movieplatform.proto.recommendation.GetUserSimilarityResponse>(
                service, METHODID_GET_USER_SIMILARITY)))
        .addMethod(
          getGetItemSimilarityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetItemSimilarityRequest,
              com.movieplatform.proto.recommendation.GetItemSimilarityResponse>(
                service, METHODID_GET_ITEM_SIMILARITY)))
        .addMethod(
          getGetHybridRecommendationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetHybridRecommendationsRequest,
              com.movieplatform.proto.recommendation.GetHybridRecommendationsResponse>(
                service, METHODID_GET_HYBRID_RECOMMENDATIONS)))
        .addMethod(
          getGetPersonalizedRecommendationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsRequest,
              com.movieplatform.proto.recommendation.GetPersonalizedRecommendationsResponse>(
                service, METHODID_GET_PERSONALIZED_RECOMMENDATIONS)))
        .addMethod(
          getAnalyzeUserBehaviorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.AnalyzeUserBehaviorRequest,
              com.movieplatform.proto.recommendation.AnalyzeUserBehaviorResponse>(
                service, METHODID_ANALYZE_USER_BEHAVIOR)))
        .addMethod(
          getTrackUserInteractionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.TrackUserInteractionRequest,
              com.movieplatform.proto.recommendation.TrackUserInteractionResponse>(
                service, METHODID_TRACK_USER_INTERACTION)))
        .addMethod(
          getGetUserPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetUserPreferencesRequest,
              com.movieplatform.proto.recommendation.GetUserPreferencesResponse>(
                service, METHODID_GET_USER_PREFERENCES)))
        .addMethod(
          getTrainRecommendationModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.TrainRecommendationModelRequest,
              com.movieplatform.proto.recommendation.TrainRecommendationModelResponse>(
                service, METHODID_TRAIN_RECOMMENDATION_MODEL)))
        .addMethod(
          getUpdateRecommendationModelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.UpdateRecommendationModelRequest,
              com.movieplatform.proto.recommendation.UpdateRecommendationModelResponse>(
                service, METHODID_UPDATE_RECOMMENDATION_MODEL)))
        .addMethod(
          getGetModelPerformanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetModelPerformanceRequest,
              com.movieplatform.proto.recommendation.GetModelPerformanceResponse>(
                service, METHODID_GET_MODEL_PERFORMANCE)))
        .addMethod(
          getGetRecommendationAnalyticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetRecommendationAnalyticsRequest,
              com.movieplatform.proto.recommendation.GetRecommendationAnalyticsResponse>(
                service, METHODID_GET_RECOMMENDATION_ANALYTICS)))
        .addMethod(
          getGetRecommendationInsightsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.GetRecommendationInsightsRequest,
              com.movieplatform.proto.recommendation.GetRecommendationInsightsResponse>(
                service, METHODID_GET_RECOMMENDATION_INSIGHTS)))
        .addMethod(
          getExportRecommendationDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.recommendation.ExportRecommendationDataRequest,
              com.movieplatform.proto.recommendation.ExportRecommendationDataResponse>(
                service, METHODID_EXPORT_RECOMMENDATION_DATA)))
        .build();
  }

  private static abstract class RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommendationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.movieplatform.proto.recommendation.RecommendationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecommendationService");
    }
  }

  private static final class RecommendationServiceFileDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier {
    RecommendationServiceFileDescriptorSupplier() {}
  }

  private static final class RecommendationServiceMethodDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RecommendationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RecommendationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommendationServiceFileDescriptorSupplier())
              .addMethod(getGetContentBasedRecommendationsMethod())
              .addMethod(getGetSimilarContentMethod())
              .addMethod(getGetContentFeaturesMethod())
              .addMethod(getGetCollaborativeRecommendationsMethod())
              .addMethod(getGetUserSimilarityMethod())
              .addMethod(getGetItemSimilarityMethod())
              .addMethod(getGetHybridRecommendationsMethod())
              .addMethod(getGetPersonalizedRecommendationsMethod())
              .addMethod(getAnalyzeUserBehaviorMethod())
              .addMethod(getTrackUserInteractionMethod())
              .addMethod(getGetUserPreferencesMethod())
              .addMethod(getTrainRecommendationModelMethod())
              .addMethod(getUpdateRecommendationModelMethod())
              .addMethod(getGetModelPerformanceMethod())
              .addMethod(getGetRecommendationAnalyticsMethod())
              .addMethod(getGetRecommendationInsightsMethod())
              .addMethod(getExportRecommendationDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
