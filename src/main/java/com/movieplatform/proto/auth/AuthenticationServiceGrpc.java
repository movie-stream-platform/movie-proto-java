package com.movieplatform.proto.auth;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Authentication service for user login, registration, and management
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: auth/auth_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthenticationServiceGrpc {

  private AuthenticationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.auth.AuthenticationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.RegisterRequest,
      com.movieplatform.proto.auth.RegisterResponse> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = com.movieplatform.proto.auth.RegisterRequest.class,
      responseType = com.movieplatform.proto.auth.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.RegisterRequest,
      com.movieplatform.proto.auth.RegisterResponse> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.RegisterRequest, com.movieplatform.proto.auth.RegisterResponse> getRegisterMethod;
    if ((getRegisterMethod = AuthenticationServiceGrpc.getRegisterMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getRegisterMethod = AuthenticationServiceGrpc.getRegisterMethod) == null) {
          AuthenticationServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.RegisterRequest, com.movieplatform.proto.auth.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.LoginRequest,
      com.movieplatform.proto.auth.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = com.movieplatform.proto.auth.LoginRequest.class,
      responseType = com.movieplatform.proto.auth.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.LoginRequest,
      com.movieplatform.proto.auth.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.LoginRequest, com.movieplatform.proto.auth.LoginResponse> getLoginMethod;
    if ((getLoginMethod = AuthenticationServiceGrpc.getLoginMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getLoginMethod = AuthenticationServiceGrpc.getLoginMethod) == null) {
          AuthenticationServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.LoginRequest, com.movieplatform.proto.auth.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("Login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.LogoutRequest,
      com.movieplatform.proto.auth.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logout",
      requestType = com.movieplatform.proto.auth.LogoutRequest.class,
      responseType = com.movieplatform.proto.auth.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.LogoutRequest,
      com.movieplatform.proto.auth.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.LogoutRequest, com.movieplatform.proto.auth.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = AuthenticationServiceGrpc.getLogoutMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getLogoutMethod = AuthenticationServiceGrpc.getLogoutMethod) == null) {
          AuthenticationServiceGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.LogoutRequest, com.movieplatform.proto.auth.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.LogoutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("Logout"))
              .build();
        }
      }
    }
    return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ChangePasswordRequest,
      com.movieplatform.proto.auth.ChangePasswordResponse> getChangePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangePassword",
      requestType = com.movieplatform.proto.auth.ChangePasswordRequest.class,
      responseType = com.movieplatform.proto.auth.ChangePasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ChangePasswordRequest,
      com.movieplatform.proto.auth.ChangePasswordResponse> getChangePasswordMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ChangePasswordRequest, com.movieplatform.proto.auth.ChangePasswordResponse> getChangePasswordMethod;
    if ((getChangePasswordMethod = AuthenticationServiceGrpc.getChangePasswordMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getChangePasswordMethod = AuthenticationServiceGrpc.getChangePasswordMethod) == null) {
          AuthenticationServiceGrpc.getChangePasswordMethod = getChangePasswordMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.ChangePasswordRequest, com.movieplatform.proto.auth.ChangePasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.ChangePasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.ChangePasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("ChangePassword"))
              .build();
        }
      }
    }
    return getChangePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ResetPasswordRequest,
      com.movieplatform.proto.auth.ResetPasswordResponse> getResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetPassword",
      requestType = com.movieplatform.proto.auth.ResetPasswordRequest.class,
      responseType = com.movieplatform.proto.auth.ResetPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ResetPasswordRequest,
      com.movieplatform.proto.auth.ResetPasswordResponse> getResetPasswordMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ResetPasswordRequest, com.movieplatform.proto.auth.ResetPasswordResponse> getResetPasswordMethod;
    if ((getResetPasswordMethod = AuthenticationServiceGrpc.getResetPasswordMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getResetPasswordMethod = AuthenticationServiceGrpc.getResetPasswordMethod) == null) {
          AuthenticationServiceGrpc.getResetPasswordMethod = getResetPasswordMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.ResetPasswordRequest, com.movieplatform.proto.auth.ResetPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.ResetPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.ResetPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("ResetPassword"))
              .build();
        }
      }
    }
    return getResetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ForgotPasswordRequest,
      com.movieplatform.proto.auth.ForgotPasswordResponse> getForgotPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ForgotPassword",
      requestType = com.movieplatform.proto.auth.ForgotPasswordRequest.class,
      responseType = com.movieplatform.proto.auth.ForgotPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ForgotPasswordRequest,
      com.movieplatform.proto.auth.ForgotPasswordResponse> getForgotPasswordMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ForgotPasswordRequest, com.movieplatform.proto.auth.ForgotPasswordResponse> getForgotPasswordMethod;
    if ((getForgotPasswordMethod = AuthenticationServiceGrpc.getForgotPasswordMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getForgotPasswordMethod = AuthenticationServiceGrpc.getForgotPasswordMethod) == null) {
          AuthenticationServiceGrpc.getForgotPasswordMethod = getForgotPasswordMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.ForgotPasswordRequest, com.movieplatform.proto.auth.ForgotPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ForgotPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.ForgotPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.ForgotPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("ForgotPassword"))
              .build();
        }
      }
    }
    return getForgotPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.EnableMFARequest,
      com.movieplatform.proto.auth.EnableMFAResponse> getEnableMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableMFA",
      requestType = com.movieplatform.proto.auth.EnableMFARequest.class,
      responseType = com.movieplatform.proto.auth.EnableMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.EnableMFARequest,
      com.movieplatform.proto.auth.EnableMFAResponse> getEnableMFAMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.EnableMFARequest, com.movieplatform.proto.auth.EnableMFAResponse> getEnableMFAMethod;
    if ((getEnableMFAMethod = AuthenticationServiceGrpc.getEnableMFAMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getEnableMFAMethod = AuthenticationServiceGrpc.getEnableMFAMethod) == null) {
          AuthenticationServiceGrpc.getEnableMFAMethod = getEnableMFAMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.EnableMFARequest, com.movieplatform.proto.auth.EnableMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.EnableMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.EnableMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("EnableMFA"))
              .build();
        }
      }
    }
    return getEnableMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.VerifyMFARequest,
      com.movieplatform.proto.auth.VerifyMFAResponse> getVerifyMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyMFA",
      requestType = com.movieplatform.proto.auth.VerifyMFARequest.class,
      responseType = com.movieplatform.proto.auth.VerifyMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.VerifyMFARequest,
      com.movieplatform.proto.auth.VerifyMFAResponse> getVerifyMFAMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.VerifyMFARequest, com.movieplatform.proto.auth.VerifyMFAResponse> getVerifyMFAMethod;
    if ((getVerifyMFAMethod = AuthenticationServiceGrpc.getVerifyMFAMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getVerifyMFAMethod = AuthenticationServiceGrpc.getVerifyMFAMethod) == null) {
          AuthenticationServiceGrpc.getVerifyMFAMethod = getVerifyMFAMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.VerifyMFARequest, com.movieplatform.proto.auth.VerifyMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.VerifyMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.VerifyMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("VerifyMFA"))
              .build();
        }
      }
    }
    return getVerifyMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.DisableMFARequest,
      com.movieplatform.proto.auth.DisableMFAResponse> getDisableMFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableMFA",
      requestType = com.movieplatform.proto.auth.DisableMFARequest.class,
      responseType = com.movieplatform.proto.auth.DisableMFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.DisableMFARequest,
      com.movieplatform.proto.auth.DisableMFAResponse> getDisableMFAMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.DisableMFARequest, com.movieplatform.proto.auth.DisableMFAResponse> getDisableMFAMethod;
    if ((getDisableMFAMethod = AuthenticationServiceGrpc.getDisableMFAMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getDisableMFAMethod = AuthenticationServiceGrpc.getDisableMFAMethod) == null) {
          AuthenticationServiceGrpc.getDisableMFAMethod = getDisableMFAMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.DisableMFARequest, com.movieplatform.proto.auth.DisableMFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableMFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.DisableMFARequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.DisableMFAResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("DisableMFA"))
              .build();
        }
      }
    }
    return getDisableMFAMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.VerifyEmailRequest,
      com.movieplatform.proto.auth.VerifyEmailResponse> getVerifyEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyEmail",
      requestType = com.movieplatform.proto.auth.VerifyEmailRequest.class,
      responseType = com.movieplatform.proto.auth.VerifyEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.VerifyEmailRequest,
      com.movieplatform.proto.auth.VerifyEmailResponse> getVerifyEmailMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.VerifyEmailRequest, com.movieplatform.proto.auth.VerifyEmailResponse> getVerifyEmailMethod;
    if ((getVerifyEmailMethod = AuthenticationServiceGrpc.getVerifyEmailMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getVerifyEmailMethod = AuthenticationServiceGrpc.getVerifyEmailMethod) == null) {
          AuthenticationServiceGrpc.getVerifyEmailMethod = getVerifyEmailMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.VerifyEmailRequest, com.movieplatform.proto.auth.VerifyEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VerifyEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.VerifyEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.VerifyEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("VerifyEmail"))
              .build();
        }
      }
    }
    return getVerifyEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ResendVerificationRequest,
      com.movieplatform.proto.auth.ResendVerificationResponse> getResendVerificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendVerification",
      requestType = com.movieplatform.proto.auth.ResendVerificationRequest.class,
      responseType = com.movieplatform.proto.auth.ResendVerificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ResendVerificationRequest,
      com.movieplatform.proto.auth.ResendVerificationResponse> getResendVerificationMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ResendVerificationRequest, com.movieplatform.proto.auth.ResendVerificationResponse> getResendVerificationMethod;
    if ((getResendVerificationMethod = AuthenticationServiceGrpc.getResendVerificationMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getResendVerificationMethod = AuthenticationServiceGrpc.getResendVerificationMethod) == null) {
          AuthenticationServiceGrpc.getResendVerificationMethod = getResendVerificationMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.ResendVerificationRequest, com.movieplatform.proto.auth.ResendVerificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendVerification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.ResendVerificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.ResendVerificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("ResendVerification"))
              .build();
        }
      }
    }
    return getResendVerificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.RefreshTokenRequest,
      com.movieplatform.proto.auth.RefreshTokenResponse> getRefreshTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RefreshToken",
      requestType = com.movieplatform.proto.auth.RefreshTokenRequest.class,
      responseType = com.movieplatform.proto.auth.RefreshTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.RefreshTokenRequest,
      com.movieplatform.proto.auth.RefreshTokenResponse> getRefreshTokenMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.RefreshTokenRequest, com.movieplatform.proto.auth.RefreshTokenResponse> getRefreshTokenMethod;
    if ((getRefreshTokenMethod = AuthenticationServiceGrpc.getRefreshTokenMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getRefreshTokenMethod = AuthenticationServiceGrpc.getRefreshTokenMethod) == null) {
          AuthenticationServiceGrpc.getRefreshTokenMethod = getRefreshTokenMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.RefreshTokenRequest, com.movieplatform.proto.auth.RefreshTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RefreshToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.RefreshTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.RefreshTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("RefreshToken"))
              .build();
        }
      }
    }
    return getRefreshTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ValidateTokenRequest,
      com.movieplatform.proto.auth.ValidateTokenResponse> getValidateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateToken",
      requestType = com.movieplatform.proto.auth.ValidateTokenRequest.class,
      responseType = com.movieplatform.proto.auth.ValidateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ValidateTokenRequest,
      com.movieplatform.proto.auth.ValidateTokenResponse> getValidateTokenMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.ValidateTokenRequest, com.movieplatform.proto.auth.ValidateTokenResponse> getValidateTokenMethod;
    if ((getValidateTokenMethod = AuthenticationServiceGrpc.getValidateTokenMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getValidateTokenMethod = AuthenticationServiceGrpc.getValidateTokenMethod) == null) {
          AuthenticationServiceGrpc.getValidateTokenMethod = getValidateTokenMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.ValidateTokenRequest, com.movieplatform.proto.auth.ValidateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.ValidateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.ValidateTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("ValidateToken"))
              .build();
        }
      }
    }
    return getValidateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.auth.RevokeTokenRequest,
      com.movieplatform.proto.auth.RevokeTokenResponse> getRevokeTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevokeToken",
      requestType = com.movieplatform.proto.auth.RevokeTokenRequest.class,
      responseType = com.movieplatform.proto.auth.RevokeTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.auth.RevokeTokenRequest,
      com.movieplatform.proto.auth.RevokeTokenResponse> getRevokeTokenMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.auth.RevokeTokenRequest, com.movieplatform.proto.auth.RevokeTokenResponse> getRevokeTokenMethod;
    if ((getRevokeTokenMethod = AuthenticationServiceGrpc.getRevokeTokenMethod) == null) {
      synchronized (AuthenticationServiceGrpc.class) {
        if ((getRevokeTokenMethod = AuthenticationServiceGrpc.getRevokeTokenMethod) == null) {
          AuthenticationServiceGrpc.getRevokeTokenMethod = getRevokeTokenMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.auth.RevokeTokenRequest, com.movieplatform.proto.auth.RevokeTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RevokeToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.RevokeTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.auth.RevokeTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthenticationServiceMethodDescriptorSupplier("RevokeToken"))
              .build();
        }
      }
    }
    return getRevokeTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthenticationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceStub>() {
        @java.lang.Override
        public AuthenticationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationServiceStub(channel, callOptions);
        }
      };
    return AuthenticationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthenticationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceBlockingStub>() {
        @java.lang.Override
        public AuthenticationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthenticationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthenticationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthenticationServiceFutureStub>() {
        @java.lang.Override
        public AuthenticationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthenticationServiceFutureStub(channel, callOptions);
        }
      };
    return AuthenticationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Authentication service for user login, registration, and management
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * User Authentication
     * </pre>
     */
    default void register(com.movieplatform.proto.auth.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    default void login(com.movieplatform.proto.auth.LoginRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    default void logout(com.movieplatform.proto.auth.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.LogoutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Password Management
     * </pre>
     */
    default void changePassword(com.movieplatform.proto.auth.ChangePasswordRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ChangePasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangePasswordMethod(), responseObserver);
    }

    /**
     */
    default void resetPassword(com.movieplatform.proto.auth.ResetPasswordRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ResetPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    /**
     */
    default void forgotPassword(com.movieplatform.proto.auth.ForgotPasswordRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ForgotPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getForgotPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Multi-Factor Authentication
     * </pre>
     */
    default void enableMFA(com.movieplatform.proto.auth.EnableMFARequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.EnableMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableMFAMethod(), responseObserver);
    }

    /**
     */
    default void verifyMFA(com.movieplatform.proto.auth.VerifyMFARequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.VerifyMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyMFAMethod(), responseObserver);
    }

    /**
     */
    default void disableMFA(com.movieplatform.proto.auth.DisableMFARequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.DisableMFAResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableMFAMethod(), responseObserver);
    }

    /**
     * <pre>
     * Account Recovery
     * </pre>
     */
    default void verifyEmail(com.movieplatform.proto.auth.VerifyEmailRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.VerifyEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyEmailMethod(), responseObserver);
    }

    /**
     */
    default void resendVerification(com.movieplatform.proto.auth.ResendVerificationRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ResendVerificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendVerificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Token Management
     * </pre>
     */
    default void refreshToken(com.movieplatform.proto.auth.RefreshTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.RefreshTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefreshTokenMethod(), responseObserver);
    }

    /**
     */
    default void validateToken(com.movieplatform.proto.auth.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ValidateTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateTokenMethod(), responseObserver);
    }

    /**
     */
    default void revokeToken(com.movieplatform.proto.auth.RevokeTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.RevokeTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthenticationService.
   * <pre>
   * Authentication service for user login, registration, and management
   * </pre>
   */
  public static abstract class AuthenticationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthenticationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthenticationService.
   * <pre>
   * Authentication service for user login, registration, and management
   * </pre>
   */
  public static final class AuthenticationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthenticationServiceStub> {
    private AuthenticationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * User Authentication
     * </pre>
     */
    public void register(com.movieplatform.proto.auth.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.movieplatform.proto.auth.LoginRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.movieplatform.proto.auth.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.LogoutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Password Management
     * </pre>
     */
    public void changePassword(com.movieplatform.proto.auth.ChangePasswordRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ChangePasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPassword(com.movieplatform.proto.auth.ResetPasswordRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ResetPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void forgotPassword(com.movieplatform.proto.auth.ForgotPasswordRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ForgotPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getForgotPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Multi-Factor Authentication
     * </pre>
     */
    public void enableMFA(com.movieplatform.proto.auth.EnableMFARequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.EnableMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyMFA(com.movieplatform.proto.auth.VerifyMFARequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.VerifyMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableMFA(com.movieplatform.proto.auth.DisableMFARequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.DisableMFAResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableMFAMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Account Recovery
     * </pre>
     */
    public void verifyEmail(com.movieplatform.proto.auth.VerifyEmailRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.VerifyEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resendVerification(com.movieplatform.proto.auth.ResendVerificationRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ResendVerificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendVerificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Token Management
     * </pre>
     */
    public void refreshToken(com.movieplatform.proto.auth.RefreshTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.RefreshTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefreshTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateToken(com.movieplatform.proto.auth.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ValidateTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeToken(com.movieplatform.proto.auth.RevokeTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.RevokeTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthenticationService.
   * <pre>
   * Authentication service for user login, registration, and management
   * </pre>
   */
  public static final class AuthenticationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthenticationServiceBlockingStub> {
    private AuthenticationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * User Authentication
     * </pre>
     */
    public com.movieplatform.proto.auth.RegisterResponse register(com.movieplatform.proto.auth.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.auth.LoginResponse login(com.movieplatform.proto.auth.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.auth.LogoutResponse logout(com.movieplatform.proto.auth.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Password Management
     * </pre>
     */
    public com.movieplatform.proto.auth.ChangePasswordResponse changePassword(com.movieplatform.proto.auth.ChangePasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.auth.ResetPasswordResponse resetPassword(com.movieplatform.proto.auth.ResetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.auth.ForgotPasswordResponse forgotPassword(com.movieplatform.proto.auth.ForgotPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getForgotPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Multi-Factor Authentication
     * </pre>
     */
    public com.movieplatform.proto.auth.EnableMFAResponse enableMFA(com.movieplatform.proto.auth.EnableMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableMFAMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.auth.VerifyMFAResponse verifyMFA(com.movieplatform.proto.auth.VerifyMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyMFAMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.auth.DisableMFAResponse disableMFA(com.movieplatform.proto.auth.DisableMFARequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableMFAMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Account Recovery
     * </pre>
     */
    public com.movieplatform.proto.auth.VerifyEmailResponse verifyEmail(com.movieplatform.proto.auth.VerifyEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.auth.ResendVerificationResponse resendVerification(com.movieplatform.proto.auth.ResendVerificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendVerificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Token Management
     * </pre>
     */
    public com.movieplatform.proto.auth.RefreshTokenResponse refreshToken(com.movieplatform.proto.auth.RefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefreshTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.auth.ValidateTokenResponse validateToken(com.movieplatform.proto.auth.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.auth.RevokeTokenResponse revokeToken(com.movieplatform.proto.auth.RevokeTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthenticationService.
   * <pre>
   * Authentication service for user login, registration, and management
   * </pre>
   */
  public static final class AuthenticationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthenticationServiceFutureStub> {
    private AuthenticationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthenticationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * User Authentication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.RegisterResponse> register(
        com.movieplatform.proto.auth.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.LoginResponse> login(
        com.movieplatform.proto.auth.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.LogoutResponse> logout(
        com.movieplatform.proto.auth.LogoutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Password Management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.ChangePasswordResponse> changePassword(
        com.movieplatform.proto.auth.ChangePasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.ResetPasswordResponse> resetPassword(
        com.movieplatform.proto.auth.ResetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.ForgotPasswordResponse> forgotPassword(
        com.movieplatform.proto.auth.ForgotPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getForgotPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Multi-Factor Authentication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.EnableMFAResponse> enableMFA(
        com.movieplatform.proto.auth.EnableMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableMFAMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.VerifyMFAResponse> verifyMFA(
        com.movieplatform.proto.auth.VerifyMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyMFAMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.DisableMFAResponse> disableMFA(
        com.movieplatform.proto.auth.DisableMFARequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableMFAMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Account Recovery
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.VerifyEmailResponse> verifyEmail(
        com.movieplatform.proto.auth.VerifyEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.ResendVerificationResponse> resendVerification(
        com.movieplatform.proto.auth.ResendVerificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendVerificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Token Management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.RefreshTokenResponse> refreshToken(
        com.movieplatform.proto.auth.RefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefreshTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.ValidateTokenResponse> validateToken(
        com.movieplatform.proto.auth.ValidateTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.auth.RevokeTokenResponse> revokeToken(
        com.movieplatform.proto.auth.RevokeTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_LOGOUT = 2;
  private static final int METHODID_CHANGE_PASSWORD = 3;
  private static final int METHODID_RESET_PASSWORD = 4;
  private static final int METHODID_FORGOT_PASSWORD = 5;
  private static final int METHODID_ENABLE_MFA = 6;
  private static final int METHODID_VERIFY_MFA = 7;
  private static final int METHODID_DISABLE_MFA = 8;
  private static final int METHODID_VERIFY_EMAIL = 9;
  private static final int METHODID_RESEND_VERIFICATION = 10;
  private static final int METHODID_REFRESH_TOKEN = 11;
  private static final int METHODID_VALIDATE_TOKEN = 12;
  private static final int METHODID_REVOKE_TOKEN = 13;

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
        case METHODID_REGISTER:
          serviceImpl.register((com.movieplatform.proto.auth.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.RegisterResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.movieplatform.proto.auth.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.movieplatform.proto.auth.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.LogoutResponse>) responseObserver);
          break;
        case METHODID_CHANGE_PASSWORD:
          serviceImpl.changePassword((com.movieplatform.proto.auth.ChangePasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ChangePasswordResponse>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((com.movieplatform.proto.auth.ResetPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ResetPasswordResponse>) responseObserver);
          break;
        case METHODID_FORGOT_PASSWORD:
          serviceImpl.forgotPassword((com.movieplatform.proto.auth.ForgotPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ForgotPasswordResponse>) responseObserver);
          break;
        case METHODID_ENABLE_MFA:
          serviceImpl.enableMFA((com.movieplatform.proto.auth.EnableMFARequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.EnableMFAResponse>) responseObserver);
          break;
        case METHODID_VERIFY_MFA:
          serviceImpl.verifyMFA((com.movieplatform.proto.auth.VerifyMFARequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.VerifyMFAResponse>) responseObserver);
          break;
        case METHODID_DISABLE_MFA:
          serviceImpl.disableMFA((com.movieplatform.proto.auth.DisableMFARequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.DisableMFAResponse>) responseObserver);
          break;
        case METHODID_VERIFY_EMAIL:
          serviceImpl.verifyEmail((com.movieplatform.proto.auth.VerifyEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.VerifyEmailResponse>) responseObserver);
          break;
        case METHODID_RESEND_VERIFICATION:
          serviceImpl.resendVerification((com.movieplatform.proto.auth.ResendVerificationRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ResendVerificationResponse>) responseObserver);
          break;
        case METHODID_REFRESH_TOKEN:
          serviceImpl.refreshToken((com.movieplatform.proto.auth.RefreshTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.RefreshTokenResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_TOKEN:
          serviceImpl.validateToken((com.movieplatform.proto.auth.ValidateTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.ValidateTokenResponse>) responseObserver);
          break;
        case METHODID_REVOKE_TOKEN:
          serviceImpl.revokeToken((com.movieplatform.proto.auth.RevokeTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.auth.RevokeTokenResponse>) responseObserver);
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
          getRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.RegisterRequest,
              com.movieplatform.proto.auth.RegisterResponse>(
                service, METHODID_REGISTER)))
        .addMethod(
          getLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.LoginRequest,
              com.movieplatform.proto.auth.LoginResponse>(
                service, METHODID_LOGIN)))
        .addMethod(
          getLogoutMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.LogoutRequest,
              com.movieplatform.proto.auth.LogoutResponse>(
                service, METHODID_LOGOUT)))
        .addMethod(
          getChangePasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.ChangePasswordRequest,
              com.movieplatform.proto.auth.ChangePasswordResponse>(
                service, METHODID_CHANGE_PASSWORD)))
        .addMethod(
          getResetPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.ResetPasswordRequest,
              com.movieplatform.proto.auth.ResetPasswordResponse>(
                service, METHODID_RESET_PASSWORD)))
        .addMethod(
          getForgotPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.ForgotPasswordRequest,
              com.movieplatform.proto.auth.ForgotPasswordResponse>(
                service, METHODID_FORGOT_PASSWORD)))
        .addMethod(
          getEnableMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.EnableMFARequest,
              com.movieplatform.proto.auth.EnableMFAResponse>(
                service, METHODID_ENABLE_MFA)))
        .addMethod(
          getVerifyMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.VerifyMFARequest,
              com.movieplatform.proto.auth.VerifyMFAResponse>(
                service, METHODID_VERIFY_MFA)))
        .addMethod(
          getDisableMFAMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.DisableMFARequest,
              com.movieplatform.proto.auth.DisableMFAResponse>(
                service, METHODID_DISABLE_MFA)))
        .addMethod(
          getVerifyEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.VerifyEmailRequest,
              com.movieplatform.proto.auth.VerifyEmailResponse>(
                service, METHODID_VERIFY_EMAIL)))
        .addMethod(
          getResendVerificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.ResendVerificationRequest,
              com.movieplatform.proto.auth.ResendVerificationResponse>(
                service, METHODID_RESEND_VERIFICATION)))
        .addMethod(
          getRefreshTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.RefreshTokenRequest,
              com.movieplatform.proto.auth.RefreshTokenResponse>(
                service, METHODID_REFRESH_TOKEN)))
        .addMethod(
          getValidateTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.ValidateTokenRequest,
              com.movieplatform.proto.auth.ValidateTokenResponse>(
                service, METHODID_VALIDATE_TOKEN)))
        .addMethod(
          getRevokeTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.auth.RevokeTokenRequest,
              com.movieplatform.proto.auth.RevokeTokenResponse>(
                service, METHODID_REVOKE_TOKEN)))
        .build();
  }

  private static abstract class AuthenticationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthenticationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.movieplatform.proto.auth.AuthServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthenticationService");
    }
  }

  private static final class AuthenticationServiceFileDescriptorSupplier
      extends AuthenticationServiceBaseDescriptorSupplier {
    AuthenticationServiceFileDescriptorSupplier() {}
  }

  private static final class AuthenticationServiceMethodDescriptorSupplier
      extends AuthenticationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthenticationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuthenticationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthenticationServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getChangePasswordMethod())
              .addMethod(getResetPasswordMethod())
              .addMethod(getForgotPasswordMethod())
              .addMethod(getEnableMFAMethod())
              .addMethod(getVerifyMFAMethod())
              .addMethod(getDisableMFAMethod())
              .addMethod(getVerifyEmailMethod())
              .addMethod(getResendVerificationMethod())
              .addMethod(getRefreshTokenMethod())
              .addMethod(getValidateTokenMethod())
              .addMethod(getRevokeTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
