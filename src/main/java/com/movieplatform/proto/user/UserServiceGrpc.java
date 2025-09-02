package com.movieplatform.proto.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * User management service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: user/user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.CreateUserRequest,
      com.movieplatform.proto.user.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.movieplatform.proto.user.CreateUserRequest.class,
      responseType = com.movieplatform.proto.user.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.CreateUserRequest,
      com.movieplatform.proto.user.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.CreateUserRequest, com.movieplatform.proto.user.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.CreateUserRequest, com.movieplatform.proto.user.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.GetUserRequest,
      com.movieplatform.proto.user.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.movieplatform.proto.user.GetUserRequest.class,
      responseType = com.movieplatform.proto.user.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.GetUserRequest,
      com.movieplatform.proto.user.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.GetUserRequest, com.movieplatform.proto.user.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.GetUserRequest, com.movieplatform.proto.user.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.UpdateUserRequest,
      com.movieplatform.proto.user.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.movieplatform.proto.user.UpdateUserRequest.class,
      responseType = com.movieplatform.proto.user.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.UpdateUserRequest,
      com.movieplatform.proto.user.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.UpdateUserRequest, com.movieplatform.proto.user.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.UpdateUserRequest, com.movieplatform.proto.user.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.DeleteUserRequest,
      com.movieplatform.proto.user.DeleteUserResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.movieplatform.proto.user.DeleteUserRequest.class,
      responseType = com.movieplatform.proto.user.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.DeleteUserRequest,
      com.movieplatform.proto.user.DeleteUserResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.DeleteUserRequest, com.movieplatform.proto.user.DeleteUserResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.DeleteUserRequest, com.movieplatform.proto.user.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.DeleteUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.SearchUsersRequest,
      com.movieplatform.proto.user.SearchUsersResponse> getSearchUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUsers",
      requestType = com.movieplatform.proto.user.SearchUsersRequest.class,
      responseType = com.movieplatform.proto.user.SearchUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.SearchUsersRequest,
      com.movieplatform.proto.user.SearchUsersResponse> getSearchUsersMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.SearchUsersRequest, com.movieplatform.proto.user.SearchUsersResponse> getSearchUsersMethod;
    if ((getSearchUsersMethod = UserServiceGrpc.getSearchUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSearchUsersMethod = UserServiceGrpc.getSearchUsersMethod) == null) {
          UserServiceGrpc.getSearchUsersMethod = getSearchUsersMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.SearchUsersRequest, com.movieplatform.proto.user.SearchUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.SearchUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.SearchUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SearchUsers"))
              .build();
        }
      }
    }
    return getSearchUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.GetUsersByIDsRequest,
      com.movieplatform.proto.user.GetUsersByIDsResponse> getGetUsersByIDsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsersByIDs",
      requestType = com.movieplatform.proto.user.GetUsersByIDsRequest.class,
      responseType = com.movieplatform.proto.user.GetUsersByIDsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.GetUsersByIDsRequest,
      com.movieplatform.proto.user.GetUsersByIDsResponse> getGetUsersByIDsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.GetUsersByIDsRequest, com.movieplatform.proto.user.GetUsersByIDsResponse> getGetUsersByIDsMethod;
    if ((getGetUsersByIDsMethod = UserServiceGrpc.getGetUsersByIDsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUsersByIDsMethod = UserServiceGrpc.getGetUsersByIDsMethod) == null) {
          UserServiceGrpc.getGetUsersByIDsMethod = getGetUsersByIDsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.GetUsersByIDsRequest, com.movieplatform.proto.user.GetUsersByIDsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUsersByIDs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.GetUsersByIDsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.GetUsersByIDsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUsersByIDs"))
              .build();
        }
      }
    }
    return getGetUsersByIDsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.BulkUpdateUsersRequest,
      com.movieplatform.proto.user.BulkUpdateUsersResponse> getBulkUpdateUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkUpdateUsers",
      requestType = com.movieplatform.proto.user.BulkUpdateUsersRequest.class,
      responseType = com.movieplatform.proto.user.BulkUpdateUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.BulkUpdateUsersRequest,
      com.movieplatform.proto.user.BulkUpdateUsersResponse> getBulkUpdateUsersMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.BulkUpdateUsersRequest, com.movieplatform.proto.user.BulkUpdateUsersResponse> getBulkUpdateUsersMethod;
    if ((getBulkUpdateUsersMethod = UserServiceGrpc.getBulkUpdateUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getBulkUpdateUsersMethod = UserServiceGrpc.getBulkUpdateUsersMethod) == null) {
          UserServiceGrpc.getBulkUpdateUsersMethod = getBulkUpdateUsersMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.BulkUpdateUsersRequest, com.movieplatform.proto.user.BulkUpdateUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkUpdateUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.BulkUpdateUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.BulkUpdateUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("BulkUpdateUsers"))
              .build();
        }
      }
    }
    return getBulkUpdateUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.BulkDeleteUsersRequest,
      com.movieplatform.proto.user.BulkDeleteUsersResponse> getBulkDeleteUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BulkDeleteUsers",
      requestType = com.movieplatform.proto.user.BulkDeleteUsersRequest.class,
      responseType = com.movieplatform.proto.user.BulkDeleteUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.BulkDeleteUsersRequest,
      com.movieplatform.proto.user.BulkDeleteUsersResponse> getBulkDeleteUsersMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.BulkDeleteUsersRequest, com.movieplatform.proto.user.BulkDeleteUsersResponse> getBulkDeleteUsersMethod;
    if ((getBulkDeleteUsersMethod = UserServiceGrpc.getBulkDeleteUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getBulkDeleteUsersMethod = UserServiceGrpc.getBulkDeleteUsersMethod) == null) {
          UserServiceGrpc.getBulkDeleteUsersMethod = getBulkDeleteUsersMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.BulkDeleteUsersRequest, com.movieplatform.proto.user.BulkDeleteUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BulkDeleteUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.BulkDeleteUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.BulkDeleteUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("BulkDeleteUsers"))
              .build();
        }
      }
    }
    return getBulkDeleteUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.ActivateUserRequest,
      com.movieplatform.proto.user.ActivateUserResponse> getActivateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateUser",
      requestType = com.movieplatform.proto.user.ActivateUserRequest.class,
      responseType = com.movieplatform.proto.user.ActivateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.ActivateUserRequest,
      com.movieplatform.proto.user.ActivateUserResponse> getActivateUserMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.ActivateUserRequest, com.movieplatform.proto.user.ActivateUserResponse> getActivateUserMethod;
    if ((getActivateUserMethod = UserServiceGrpc.getActivateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getActivateUserMethod = UserServiceGrpc.getActivateUserMethod) == null) {
          UserServiceGrpc.getActivateUserMethod = getActivateUserMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.ActivateUserRequest, com.movieplatform.proto.user.ActivateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ActivateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.ActivateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.ActivateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ActivateUser"))
              .build();
        }
      }
    }
    return getActivateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.DeactivateUserRequest,
      com.movieplatform.proto.user.DeactivateUserResponse> getDeactivateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeactivateUser",
      requestType = com.movieplatform.proto.user.DeactivateUserRequest.class,
      responseType = com.movieplatform.proto.user.DeactivateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.DeactivateUserRequest,
      com.movieplatform.proto.user.DeactivateUserResponse> getDeactivateUserMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.DeactivateUserRequest, com.movieplatform.proto.user.DeactivateUserResponse> getDeactivateUserMethod;
    if ((getDeactivateUserMethod = UserServiceGrpc.getDeactivateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeactivateUserMethod = UserServiceGrpc.getDeactivateUserMethod) == null) {
          UserServiceGrpc.getDeactivateUserMethod = getDeactivateUserMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.DeactivateUserRequest, com.movieplatform.proto.user.DeactivateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeactivateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.DeactivateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.DeactivateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeactivateUser"))
              .build();
        }
      }
    }
    return getDeactivateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.user.SuspendUserRequest,
      com.movieplatform.proto.user.SuspendUserResponse> getSuspendUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuspendUser",
      requestType = com.movieplatform.proto.user.SuspendUserRequest.class,
      responseType = com.movieplatform.proto.user.SuspendUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.user.SuspendUserRequest,
      com.movieplatform.proto.user.SuspendUserResponse> getSuspendUserMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.user.SuspendUserRequest, com.movieplatform.proto.user.SuspendUserResponse> getSuspendUserMethod;
    if ((getSuspendUserMethod = UserServiceGrpc.getSuspendUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSuspendUserMethod = UserServiceGrpc.getSuspendUserMethod) == null) {
          UserServiceGrpc.getSuspendUserMethod = getSuspendUserMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.user.SuspendUserRequest, com.movieplatform.proto.user.SuspendUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuspendUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.SuspendUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.user.SuspendUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SuspendUser"))
              .build();
        }
      }
    }
    return getSuspendUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * User management service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * User CRUD operations
     * </pre>
     */
    default void createUser(com.movieplatform.proto.user.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.CreateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    default void getUser(com.movieplatform.proto.user.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    default void updateUser(com.movieplatform.proto.user.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    default void deleteUser(com.movieplatform.proto.user.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * User search and discovery
     * </pre>
     */
    default void searchUsers(com.movieplatform.proto.user.SearchUsersRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.SearchUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchUsersMethod(), responseObserver);
    }

    /**
     */
    default void getUsersByIDs(com.movieplatform.proto.user.GetUsersByIDsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.GetUsersByIDsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUsersByIDsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bulk operations
     * </pre>
     */
    default void bulkUpdateUsers(com.movieplatform.proto.user.BulkUpdateUsersRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.BulkUpdateUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBulkUpdateUsersMethod(), responseObserver);
    }

    /**
     */
    default void bulkDeleteUsers(com.movieplatform.proto.user.BulkDeleteUsersRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.BulkDeleteUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBulkDeleteUsersMethod(), responseObserver);
    }

    /**
     * <pre>
     * User status management
     * </pre>
     */
    default void activateUser(com.movieplatform.proto.user.ActivateUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.ActivateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getActivateUserMethod(), responseObserver);
    }

    /**
     */
    default void deactivateUser(com.movieplatform.proto.user.DeactivateUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.DeactivateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeactivateUserMethod(), responseObserver);
    }

    /**
     */
    default void suspendUser(com.movieplatform.proto.user.SuspendUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.SuspendUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   * <pre>
   * User management service
   * </pre>
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   * <pre>
   * User management service
   * </pre>
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * User CRUD operations
     * </pre>
     */
    public void createUser(com.movieplatform.proto.user.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.CreateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(com.movieplatform.proto.user.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.movieplatform.proto.user.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.movieplatform.proto.user.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * User search and discovery
     * </pre>
     */
    public void searchUsers(com.movieplatform.proto.user.SearchUsersRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.SearchUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersByIDs(com.movieplatform.proto.user.GetUsersByIDsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.GetUsersByIDsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUsersByIDsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bulk operations
     * </pre>
     */
    public void bulkUpdateUsers(com.movieplatform.proto.user.BulkUpdateUsersRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.BulkUpdateUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBulkUpdateUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bulkDeleteUsers(com.movieplatform.proto.user.BulkDeleteUsersRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.BulkDeleteUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBulkDeleteUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * User status management
     * </pre>
     */
    public void activateUser(com.movieplatform.proto.user.ActivateUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.ActivateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getActivateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deactivateUser(com.movieplatform.proto.user.DeactivateUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.DeactivateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeactivateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void suspendUser(com.movieplatform.proto.user.SuspendUserRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.user.SuspendUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   * <pre>
   * User management service
   * </pre>
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * User CRUD operations
     * </pre>
     */
    public com.movieplatform.proto.user.CreateUserResponse createUser(com.movieplatform.proto.user.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.user.GetUserResponse getUser(com.movieplatform.proto.user.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.user.UpdateUserResponse updateUser(com.movieplatform.proto.user.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.user.DeleteUserResponse deleteUser(com.movieplatform.proto.user.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * User search and discovery
     * </pre>
     */
    public com.movieplatform.proto.user.SearchUsersResponse searchUsers(com.movieplatform.proto.user.SearchUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.user.GetUsersByIDsResponse getUsersByIDs(com.movieplatform.proto.user.GetUsersByIDsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUsersByIDsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bulk operations
     * </pre>
     */
    public com.movieplatform.proto.user.BulkUpdateUsersResponse bulkUpdateUsers(com.movieplatform.proto.user.BulkUpdateUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBulkUpdateUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.user.BulkDeleteUsersResponse bulkDeleteUsers(com.movieplatform.proto.user.BulkDeleteUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBulkDeleteUsersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * User status management
     * </pre>
     */
    public com.movieplatform.proto.user.ActivateUserResponse activateUser(com.movieplatform.proto.user.ActivateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getActivateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.user.DeactivateUserResponse deactivateUser(com.movieplatform.proto.user.DeactivateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeactivateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.user.SuspendUserResponse suspendUser(com.movieplatform.proto.user.SuspendUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   * <pre>
   * User management service
   * </pre>
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * User CRUD operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.CreateUserResponse> createUser(
        com.movieplatform.proto.user.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.GetUserResponse> getUser(
        com.movieplatform.proto.user.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.UpdateUserResponse> updateUser(
        com.movieplatform.proto.user.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.DeleteUserResponse> deleteUser(
        com.movieplatform.proto.user.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * User search and discovery
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.SearchUsersResponse> searchUsers(
        com.movieplatform.proto.user.SearchUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.GetUsersByIDsResponse> getUsersByIDs(
        com.movieplatform.proto.user.GetUsersByIDsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUsersByIDsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bulk operations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.BulkUpdateUsersResponse> bulkUpdateUsers(
        com.movieplatform.proto.user.BulkUpdateUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBulkUpdateUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.BulkDeleteUsersResponse> bulkDeleteUsers(
        com.movieplatform.proto.user.BulkDeleteUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBulkDeleteUsersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * User status management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.ActivateUserResponse> activateUser(
        com.movieplatform.proto.user.ActivateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getActivateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.DeactivateUserResponse> deactivateUser(
        com.movieplatform.proto.user.DeactivateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeactivateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.user.SuspendUserResponse> suspendUser(
        com.movieplatform.proto.user.SuspendUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_DELETE_USER = 3;
  private static final int METHODID_SEARCH_USERS = 4;
  private static final int METHODID_GET_USERS_BY_IDS = 5;
  private static final int METHODID_BULK_UPDATE_USERS = 6;
  private static final int METHODID_BULK_DELETE_USERS = 7;
  private static final int METHODID_ACTIVATE_USER = 8;
  private static final int METHODID_DEACTIVATE_USER = 9;
  private static final int METHODID_SUSPEND_USER = 10;

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
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.movieplatform.proto.user.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.CreateUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((com.movieplatform.proto.user.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.GetUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.movieplatform.proto.user.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.movieplatform.proto.user.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.DeleteUserResponse>) responseObserver);
          break;
        case METHODID_SEARCH_USERS:
          serviceImpl.searchUsers((com.movieplatform.proto.user.SearchUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.SearchUsersResponse>) responseObserver);
          break;
        case METHODID_GET_USERS_BY_IDS:
          serviceImpl.getUsersByIDs((com.movieplatform.proto.user.GetUsersByIDsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.GetUsersByIDsResponse>) responseObserver);
          break;
        case METHODID_BULK_UPDATE_USERS:
          serviceImpl.bulkUpdateUsers((com.movieplatform.proto.user.BulkUpdateUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.BulkUpdateUsersResponse>) responseObserver);
          break;
        case METHODID_BULK_DELETE_USERS:
          serviceImpl.bulkDeleteUsers((com.movieplatform.proto.user.BulkDeleteUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.BulkDeleteUsersResponse>) responseObserver);
          break;
        case METHODID_ACTIVATE_USER:
          serviceImpl.activateUser((com.movieplatform.proto.user.ActivateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.ActivateUserResponse>) responseObserver);
          break;
        case METHODID_DEACTIVATE_USER:
          serviceImpl.deactivateUser((com.movieplatform.proto.user.DeactivateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.DeactivateUserResponse>) responseObserver);
          break;
        case METHODID_SUSPEND_USER:
          serviceImpl.suspendUser((com.movieplatform.proto.user.SuspendUserRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.user.SuspendUserResponse>) responseObserver);
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
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.CreateUserRequest,
              com.movieplatform.proto.user.CreateUserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.GetUserRequest,
              com.movieplatform.proto.user.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.UpdateUserRequest,
              com.movieplatform.proto.user.UpdateUserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.DeleteUserRequest,
              com.movieplatform.proto.user.DeleteUserResponse>(
                service, METHODID_DELETE_USER)))
        .addMethod(
          getSearchUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.SearchUsersRequest,
              com.movieplatform.proto.user.SearchUsersResponse>(
                service, METHODID_SEARCH_USERS)))
        .addMethod(
          getGetUsersByIDsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.GetUsersByIDsRequest,
              com.movieplatform.proto.user.GetUsersByIDsResponse>(
                service, METHODID_GET_USERS_BY_IDS)))
        .addMethod(
          getBulkUpdateUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.BulkUpdateUsersRequest,
              com.movieplatform.proto.user.BulkUpdateUsersResponse>(
                service, METHODID_BULK_UPDATE_USERS)))
        .addMethod(
          getBulkDeleteUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.BulkDeleteUsersRequest,
              com.movieplatform.proto.user.BulkDeleteUsersResponse>(
                service, METHODID_BULK_DELETE_USERS)))
        .addMethod(
          getActivateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.ActivateUserRequest,
              com.movieplatform.proto.user.ActivateUserResponse>(
                service, METHODID_ACTIVATE_USER)))
        .addMethod(
          getDeactivateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.DeactivateUserRequest,
              com.movieplatform.proto.user.DeactivateUserResponse>(
                service, METHODID_DEACTIVATE_USER)))
        .addMethod(
          getSuspendUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.user.SuspendUserRequest,
              com.movieplatform.proto.user.SuspendUserResponse>(
                service, METHODID_SUSPEND_USER)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.movieplatform.proto.user.UserServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getSearchUsersMethod())
              .addMethod(getGetUsersByIDsMethod())
              .addMethod(getBulkUpdateUsersMethod())
              .addMethod(getBulkDeleteUsersMethod())
              .addMethod(getActivateUserMethod())
              .addMethod(getDeactivateUserMethod())
              .addMethod(getSuspendUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
