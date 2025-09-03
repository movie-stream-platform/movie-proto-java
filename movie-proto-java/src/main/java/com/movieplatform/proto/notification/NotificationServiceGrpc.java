package com.movieplatform.proto.notification;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Notification and communication service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: notification/notification_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NotificationServiceGrpc {

  private NotificationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "proto.notification.NotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendUserNotificationRequest,
      com.movieplatform.proto.notification.SendUserNotificationResponse> getSendUserNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendUserNotification",
      requestType = com.movieplatform.proto.notification.SendUserNotificationRequest.class,
      responseType = com.movieplatform.proto.notification.SendUserNotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendUserNotificationRequest,
      com.movieplatform.proto.notification.SendUserNotificationResponse> getSendUserNotificationMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendUserNotificationRequest, com.movieplatform.proto.notification.SendUserNotificationResponse> getSendUserNotificationMethod;
    if ((getSendUserNotificationMethod = NotificationServiceGrpc.getSendUserNotificationMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getSendUserNotificationMethod = NotificationServiceGrpc.getSendUserNotificationMethod) == null) {
          NotificationServiceGrpc.getSendUserNotificationMethod = getSendUserNotificationMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.SendUserNotificationRequest, com.movieplatform.proto.notification.SendUserNotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendUserNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendUserNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendUserNotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("SendUserNotification"))
              .build();
        }
      }
    }
    return getSendUserNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetUserNotificationsRequest,
      com.movieplatform.proto.notification.GetUserNotificationsResponse> getGetUserNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserNotifications",
      requestType = com.movieplatform.proto.notification.GetUserNotificationsRequest.class,
      responseType = com.movieplatform.proto.notification.GetUserNotificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetUserNotificationsRequest,
      com.movieplatform.proto.notification.GetUserNotificationsResponse> getGetUserNotificationsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetUserNotificationsRequest, com.movieplatform.proto.notification.GetUserNotificationsResponse> getGetUserNotificationsMethod;
    if ((getGetUserNotificationsMethod = NotificationServiceGrpc.getGetUserNotificationsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getGetUserNotificationsMethod = NotificationServiceGrpc.getGetUserNotificationsMethod) == null) {
          NotificationServiceGrpc.getGetUserNotificationsMethod = getGetUserNotificationsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.GetUserNotificationsRequest, com.movieplatform.proto.notification.GetUserNotificationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetUserNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetUserNotificationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("GetUserNotifications"))
              .build();
        }
      }
    }
    return getGetUserNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.MarkNotificationReadRequest,
      com.movieplatform.proto.notification.MarkNotificationReadResponse> getMarkNotificationReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkNotificationRead",
      requestType = com.movieplatform.proto.notification.MarkNotificationReadRequest.class,
      responseType = com.movieplatform.proto.notification.MarkNotificationReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.MarkNotificationReadRequest,
      com.movieplatform.proto.notification.MarkNotificationReadResponse> getMarkNotificationReadMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.MarkNotificationReadRequest, com.movieplatform.proto.notification.MarkNotificationReadResponse> getMarkNotificationReadMethod;
    if ((getMarkNotificationReadMethod = NotificationServiceGrpc.getMarkNotificationReadMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getMarkNotificationReadMethod = NotificationServiceGrpc.getMarkNotificationReadMethod) == null) {
          NotificationServiceGrpc.getMarkNotificationReadMethod = getMarkNotificationReadMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.MarkNotificationReadRequest, com.movieplatform.proto.notification.MarkNotificationReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkNotificationRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.MarkNotificationReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.MarkNotificationReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("MarkNotificationRead"))
              .build();
        }
      }
    }
    return getMarkNotificationReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.DeleteNotificationRequest,
      com.movieplatform.proto.notification.DeleteNotificationResponse> getDeleteNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNotification",
      requestType = com.movieplatform.proto.notification.DeleteNotificationRequest.class,
      responseType = com.movieplatform.proto.notification.DeleteNotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.DeleteNotificationRequest,
      com.movieplatform.proto.notification.DeleteNotificationResponse> getDeleteNotificationMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.DeleteNotificationRequest, com.movieplatform.proto.notification.DeleteNotificationResponse> getDeleteNotificationMethod;
    if ((getDeleteNotificationMethod = NotificationServiceGrpc.getDeleteNotificationMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getDeleteNotificationMethod = NotificationServiceGrpc.getDeleteNotificationMethod) == null) {
          NotificationServiceGrpc.getDeleteNotificationMethod = getDeleteNotificationMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.DeleteNotificationRequest, com.movieplatform.proto.notification.DeleteNotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.DeleteNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.DeleteNotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("DeleteNotification"))
              .build();
        }
      }
    }
    return getDeleteNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendEmailNotificationRequest,
      com.movieplatform.proto.notification.SendEmailNotificationResponse> getSendEmailNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmailNotification",
      requestType = com.movieplatform.proto.notification.SendEmailNotificationRequest.class,
      responseType = com.movieplatform.proto.notification.SendEmailNotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendEmailNotificationRequest,
      com.movieplatform.proto.notification.SendEmailNotificationResponse> getSendEmailNotificationMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendEmailNotificationRequest, com.movieplatform.proto.notification.SendEmailNotificationResponse> getSendEmailNotificationMethod;
    if ((getSendEmailNotificationMethod = NotificationServiceGrpc.getSendEmailNotificationMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getSendEmailNotificationMethod = NotificationServiceGrpc.getSendEmailNotificationMethod) == null) {
          NotificationServiceGrpc.getSendEmailNotificationMethod = getSendEmailNotificationMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.SendEmailNotificationRequest, com.movieplatform.proto.notification.SendEmailNotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmailNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendEmailNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendEmailNotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("SendEmailNotification"))
              .build();
        }
      }
    }
    return getSendEmailNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendEmailTemplateRequest,
      com.movieplatform.proto.notification.SendEmailTemplateResponse> getSendEmailTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendEmailTemplate",
      requestType = com.movieplatform.proto.notification.SendEmailTemplateRequest.class,
      responseType = com.movieplatform.proto.notification.SendEmailTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendEmailTemplateRequest,
      com.movieplatform.proto.notification.SendEmailTemplateResponse> getSendEmailTemplateMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendEmailTemplateRequest, com.movieplatform.proto.notification.SendEmailTemplateResponse> getSendEmailTemplateMethod;
    if ((getSendEmailTemplateMethod = NotificationServiceGrpc.getSendEmailTemplateMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getSendEmailTemplateMethod = NotificationServiceGrpc.getSendEmailTemplateMethod) == null) {
          NotificationServiceGrpc.getSendEmailTemplateMethod = getSendEmailTemplateMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.SendEmailTemplateRequest, com.movieplatform.proto.notification.SendEmailTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendEmailTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendEmailTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendEmailTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("SendEmailTemplate"))
              .build();
        }
      }
    }
    return getSendEmailTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetEmailStatusRequest,
      com.movieplatform.proto.notification.GetEmailStatusResponse> getGetEmailStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailStatus",
      requestType = com.movieplatform.proto.notification.GetEmailStatusRequest.class,
      responseType = com.movieplatform.proto.notification.GetEmailStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetEmailStatusRequest,
      com.movieplatform.proto.notification.GetEmailStatusResponse> getGetEmailStatusMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetEmailStatusRequest, com.movieplatform.proto.notification.GetEmailStatusResponse> getGetEmailStatusMethod;
    if ((getGetEmailStatusMethod = NotificationServiceGrpc.getGetEmailStatusMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getGetEmailStatusMethod = NotificationServiceGrpc.getGetEmailStatusMethod) == null) {
          NotificationServiceGrpc.getGetEmailStatusMethod = getGetEmailStatusMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.GetEmailStatusRequest, com.movieplatform.proto.notification.GetEmailStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmailStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetEmailStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetEmailStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("GetEmailStatus"))
              .build();
        }
      }
    }
    return getGetEmailStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.ResendEmailRequest,
      com.movieplatform.proto.notification.ResendEmailResponse> getResendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResendEmail",
      requestType = com.movieplatform.proto.notification.ResendEmailRequest.class,
      responseType = com.movieplatform.proto.notification.ResendEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.ResendEmailRequest,
      com.movieplatform.proto.notification.ResendEmailResponse> getResendEmailMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.ResendEmailRequest, com.movieplatform.proto.notification.ResendEmailResponse> getResendEmailMethod;
    if ((getResendEmailMethod = NotificationServiceGrpc.getResendEmailMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getResendEmailMethod = NotificationServiceGrpc.getResendEmailMethod) == null) {
          NotificationServiceGrpc.getResendEmailMethod = getResendEmailMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.ResendEmailRequest, com.movieplatform.proto.notification.ResendEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.ResendEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.ResendEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("ResendEmail"))
              .build();
        }
      }
    }
    return getResendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendPushNotificationRequest,
      com.movieplatform.proto.notification.SendPushNotificationResponse> getSendPushNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendPushNotification",
      requestType = com.movieplatform.proto.notification.SendPushNotificationRequest.class,
      responseType = com.movieplatform.proto.notification.SendPushNotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendPushNotificationRequest,
      com.movieplatform.proto.notification.SendPushNotificationResponse> getSendPushNotificationMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendPushNotificationRequest, com.movieplatform.proto.notification.SendPushNotificationResponse> getSendPushNotificationMethod;
    if ((getSendPushNotificationMethod = NotificationServiceGrpc.getSendPushNotificationMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getSendPushNotificationMethod = NotificationServiceGrpc.getSendPushNotificationMethod) == null) {
          NotificationServiceGrpc.getSendPushNotificationMethod = getSendPushNotificationMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.SendPushNotificationRequest, com.movieplatform.proto.notification.SendPushNotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendPushNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendPushNotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendPushNotificationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("SendPushNotification"))
              .build();
        }
      }
    }
    return getSendPushNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.RegisterPushTokenRequest,
      com.movieplatform.proto.notification.RegisterPushTokenResponse> getRegisterPushTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterPushToken",
      requestType = com.movieplatform.proto.notification.RegisterPushTokenRequest.class,
      responseType = com.movieplatform.proto.notification.RegisterPushTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.RegisterPushTokenRequest,
      com.movieplatform.proto.notification.RegisterPushTokenResponse> getRegisterPushTokenMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.RegisterPushTokenRequest, com.movieplatform.proto.notification.RegisterPushTokenResponse> getRegisterPushTokenMethod;
    if ((getRegisterPushTokenMethod = NotificationServiceGrpc.getRegisterPushTokenMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getRegisterPushTokenMethod = NotificationServiceGrpc.getRegisterPushTokenMethod) == null) {
          NotificationServiceGrpc.getRegisterPushTokenMethod = getRegisterPushTokenMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.RegisterPushTokenRequest, com.movieplatform.proto.notification.RegisterPushTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterPushToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.RegisterPushTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.RegisterPushTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("RegisterPushToken"))
              .build();
        }
      }
    }
    return getRegisterPushTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UnregisterPushTokenRequest,
      com.movieplatform.proto.notification.UnregisterPushTokenResponse> getUnregisterPushTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnregisterPushToken",
      requestType = com.movieplatform.proto.notification.UnregisterPushTokenRequest.class,
      responseType = com.movieplatform.proto.notification.UnregisterPushTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UnregisterPushTokenRequest,
      com.movieplatform.proto.notification.UnregisterPushTokenResponse> getUnregisterPushTokenMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UnregisterPushTokenRequest, com.movieplatform.proto.notification.UnregisterPushTokenResponse> getUnregisterPushTokenMethod;
    if ((getUnregisterPushTokenMethod = NotificationServiceGrpc.getUnregisterPushTokenMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getUnregisterPushTokenMethod = NotificationServiceGrpc.getUnregisterPushTokenMethod) == null) {
          NotificationServiceGrpc.getUnregisterPushTokenMethod = getUnregisterPushTokenMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.UnregisterPushTokenRequest, com.movieplatform.proto.notification.UnregisterPushTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnregisterPushToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.UnregisterPushTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.UnregisterPushTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("UnregisterPushToken"))
              .build();
        }
      }
    }
    return getUnregisterPushTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetPushDeliveryStatusRequest,
      com.movieplatform.proto.notification.GetPushDeliveryStatusResponse> getGetPushDeliveryStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPushDeliveryStatus",
      requestType = com.movieplatform.proto.notification.GetPushDeliveryStatusRequest.class,
      responseType = com.movieplatform.proto.notification.GetPushDeliveryStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetPushDeliveryStatusRequest,
      com.movieplatform.proto.notification.GetPushDeliveryStatusResponse> getGetPushDeliveryStatusMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetPushDeliveryStatusRequest, com.movieplatform.proto.notification.GetPushDeliveryStatusResponse> getGetPushDeliveryStatusMethod;
    if ((getGetPushDeliveryStatusMethod = NotificationServiceGrpc.getGetPushDeliveryStatusMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getGetPushDeliveryStatusMethod = NotificationServiceGrpc.getGetPushDeliveryStatusMethod) == null) {
          NotificationServiceGrpc.getGetPushDeliveryStatusMethod = getGetPushDeliveryStatusMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.GetPushDeliveryStatusRequest, com.movieplatform.proto.notification.GetPushDeliveryStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPushDeliveryStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetPushDeliveryStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetPushDeliveryStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("GetPushDeliveryStatus"))
              .build();
        }
      }
    }
    return getGetPushDeliveryStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendMarketingEmailRequest,
      com.movieplatform.proto.notification.SendMarketingEmailResponse> getSendMarketingEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMarketingEmail",
      requestType = com.movieplatform.proto.notification.SendMarketingEmailRequest.class,
      responseType = com.movieplatform.proto.notification.SendMarketingEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendMarketingEmailRequest,
      com.movieplatform.proto.notification.SendMarketingEmailResponse> getSendMarketingEmailMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendMarketingEmailRequest, com.movieplatform.proto.notification.SendMarketingEmailResponse> getSendMarketingEmailMethod;
    if ((getSendMarketingEmailMethod = NotificationServiceGrpc.getSendMarketingEmailMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getSendMarketingEmailMethod = NotificationServiceGrpc.getSendMarketingEmailMethod) == null) {
          NotificationServiceGrpc.getSendMarketingEmailMethod = getSendMarketingEmailMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.SendMarketingEmailRequest, com.movieplatform.proto.notification.SendMarketingEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMarketingEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendMarketingEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendMarketingEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("SendMarketingEmail"))
              .build();
        }
      }
    }
    return getSendMarketingEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendMarketingPushRequest,
      com.movieplatform.proto.notification.SendMarketingPushResponse> getSendMarketingPushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendMarketingPush",
      requestType = com.movieplatform.proto.notification.SendMarketingPushRequest.class,
      responseType = com.movieplatform.proto.notification.SendMarketingPushResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendMarketingPushRequest,
      com.movieplatform.proto.notification.SendMarketingPushResponse> getSendMarketingPushMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SendMarketingPushRequest, com.movieplatform.proto.notification.SendMarketingPushResponse> getSendMarketingPushMethod;
    if ((getSendMarketingPushMethod = NotificationServiceGrpc.getSendMarketingPushMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getSendMarketingPushMethod = NotificationServiceGrpc.getSendMarketingPushMethod) == null) {
          NotificationServiceGrpc.getSendMarketingPushMethod = getSendMarketingPushMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.SendMarketingPushRequest, com.movieplatform.proto.notification.SendMarketingPushResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendMarketingPush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendMarketingPushRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SendMarketingPushResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("SendMarketingPush"))
              .build();
        }
      }
    }
    return getSendMarketingPushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetMarketingCampaignsRequest,
      com.movieplatform.proto.notification.GetMarketingCampaignsResponse> getGetMarketingCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMarketingCampaigns",
      requestType = com.movieplatform.proto.notification.GetMarketingCampaignsRequest.class,
      responseType = com.movieplatform.proto.notification.GetMarketingCampaignsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetMarketingCampaignsRequest,
      com.movieplatform.proto.notification.GetMarketingCampaignsResponse> getGetMarketingCampaignsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetMarketingCampaignsRequest, com.movieplatform.proto.notification.GetMarketingCampaignsResponse> getGetMarketingCampaignsMethod;
    if ((getGetMarketingCampaignsMethod = NotificationServiceGrpc.getGetMarketingCampaignsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getGetMarketingCampaignsMethod = NotificationServiceGrpc.getGetMarketingCampaignsMethod) == null) {
          NotificationServiceGrpc.getGetMarketingCampaignsMethod = getGetMarketingCampaignsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.GetMarketingCampaignsRequest, com.movieplatform.proto.notification.GetMarketingCampaignsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMarketingCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetMarketingCampaignsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetMarketingCampaignsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("GetMarketingCampaigns"))
              .build();
        }
      }
    }
    return getGetMarketingCampaignsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.TrackMarketingEventRequest,
      com.movieplatform.proto.notification.TrackMarketingEventResponse> getTrackMarketingEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TrackMarketingEvent",
      requestType = com.movieplatform.proto.notification.TrackMarketingEventRequest.class,
      responseType = com.movieplatform.proto.notification.TrackMarketingEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.TrackMarketingEventRequest,
      com.movieplatform.proto.notification.TrackMarketingEventResponse> getTrackMarketingEventMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.TrackMarketingEventRequest, com.movieplatform.proto.notification.TrackMarketingEventResponse> getTrackMarketingEventMethod;
    if ((getTrackMarketingEventMethod = NotificationServiceGrpc.getTrackMarketingEventMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getTrackMarketingEventMethod = NotificationServiceGrpc.getTrackMarketingEventMethod) == null) {
          NotificationServiceGrpc.getTrackMarketingEventMethod = getTrackMarketingEventMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.TrackMarketingEventRequest, com.movieplatform.proto.notification.TrackMarketingEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TrackMarketingEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.TrackMarketingEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.TrackMarketingEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("TrackMarketingEvent"))
              .build();
        }
      }
    }
    return getTrackMarketingEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetNotificationPreferencesRequest,
      com.movieplatform.proto.notification.GetNotificationPreferencesResponse> getGetNotificationPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotificationPreferences",
      requestType = com.movieplatform.proto.notification.GetNotificationPreferencesRequest.class,
      responseType = com.movieplatform.proto.notification.GetNotificationPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetNotificationPreferencesRequest,
      com.movieplatform.proto.notification.GetNotificationPreferencesResponse> getGetNotificationPreferencesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetNotificationPreferencesRequest, com.movieplatform.proto.notification.GetNotificationPreferencesResponse> getGetNotificationPreferencesMethod;
    if ((getGetNotificationPreferencesMethod = NotificationServiceGrpc.getGetNotificationPreferencesMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getGetNotificationPreferencesMethod = NotificationServiceGrpc.getGetNotificationPreferencesMethod) == null) {
          NotificationServiceGrpc.getGetNotificationPreferencesMethod = getGetNotificationPreferencesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.GetNotificationPreferencesRequest, com.movieplatform.proto.notification.GetNotificationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotificationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetNotificationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetNotificationPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("GetNotificationPreferences"))
              .build();
        }
      }
    }
    return getGetNotificationPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest,
      com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse> getUpdateNotificationPreferencesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNotificationPreferences",
      requestType = com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest.class,
      responseType = com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest,
      com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse> getUpdateNotificationPreferencesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest, com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse> getUpdateNotificationPreferencesMethod;
    if ((getUpdateNotificationPreferencesMethod = NotificationServiceGrpc.getUpdateNotificationPreferencesMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getUpdateNotificationPreferencesMethod = NotificationServiceGrpc.getUpdateNotificationPreferencesMethod) == null) {
          NotificationServiceGrpc.getUpdateNotificationPreferencesMethod = getUpdateNotificationPreferencesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest, com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNotificationPreferences"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("UpdateNotificationPreferences"))
              .build();
        }
      }
    }
    return getUpdateNotificationPreferencesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SubscribeToNotificationsRequest,
      com.movieplatform.proto.notification.SubscribeToNotificationsResponse> getSubscribeToNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeToNotifications",
      requestType = com.movieplatform.proto.notification.SubscribeToNotificationsRequest.class,
      responseType = com.movieplatform.proto.notification.SubscribeToNotificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SubscribeToNotificationsRequest,
      com.movieplatform.proto.notification.SubscribeToNotificationsResponse> getSubscribeToNotificationsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.SubscribeToNotificationsRequest, com.movieplatform.proto.notification.SubscribeToNotificationsResponse> getSubscribeToNotificationsMethod;
    if ((getSubscribeToNotificationsMethod = NotificationServiceGrpc.getSubscribeToNotificationsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getSubscribeToNotificationsMethod = NotificationServiceGrpc.getSubscribeToNotificationsMethod) == null) {
          NotificationServiceGrpc.getSubscribeToNotificationsMethod = getSubscribeToNotificationsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.SubscribeToNotificationsRequest, com.movieplatform.proto.notification.SubscribeToNotificationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeToNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SubscribeToNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.SubscribeToNotificationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("SubscribeToNotifications"))
              .build();
        }
      }
    }
    return getSubscribeToNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest,
      com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse> getUnsubscribeFromNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnsubscribeFromNotifications",
      requestType = com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest.class,
      responseType = com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest,
      com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse> getUnsubscribeFromNotificationsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest, com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse> getUnsubscribeFromNotificationsMethod;
    if ((getUnsubscribeFromNotificationsMethod = NotificationServiceGrpc.getUnsubscribeFromNotificationsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getUnsubscribeFromNotificationsMethod = NotificationServiceGrpc.getUnsubscribeFromNotificationsMethod) == null) {
          NotificationServiceGrpc.getUnsubscribeFromNotificationsMethod = getUnsubscribeFromNotificationsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest, com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnsubscribeFromNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("UnsubscribeFromNotifications"))
              .build();
        }
      }
    }
    return getUnsubscribeFromNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetNotificationTemplatesRequest,
      com.movieplatform.proto.notification.GetNotificationTemplatesResponse> getGetNotificationTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotificationTemplates",
      requestType = com.movieplatform.proto.notification.GetNotificationTemplatesRequest.class,
      responseType = com.movieplatform.proto.notification.GetNotificationTemplatesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetNotificationTemplatesRequest,
      com.movieplatform.proto.notification.GetNotificationTemplatesResponse> getGetNotificationTemplatesMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetNotificationTemplatesRequest, com.movieplatform.proto.notification.GetNotificationTemplatesResponse> getGetNotificationTemplatesMethod;
    if ((getGetNotificationTemplatesMethod = NotificationServiceGrpc.getGetNotificationTemplatesMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getGetNotificationTemplatesMethod = NotificationServiceGrpc.getGetNotificationTemplatesMethod) == null) {
          NotificationServiceGrpc.getGetNotificationTemplatesMethod = getGetNotificationTemplatesMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.GetNotificationTemplatesRequest, com.movieplatform.proto.notification.GetNotificationTemplatesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotificationTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetNotificationTemplatesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetNotificationTemplatesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("GetNotificationTemplates"))
              .build();
        }
      }
    }
    return getGetNotificationTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.CreateNotificationTemplateRequest,
      com.movieplatform.proto.notification.CreateNotificationTemplateResponse> getCreateNotificationTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNotificationTemplate",
      requestType = com.movieplatform.proto.notification.CreateNotificationTemplateRequest.class,
      responseType = com.movieplatform.proto.notification.CreateNotificationTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.CreateNotificationTemplateRequest,
      com.movieplatform.proto.notification.CreateNotificationTemplateResponse> getCreateNotificationTemplateMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.CreateNotificationTemplateRequest, com.movieplatform.proto.notification.CreateNotificationTemplateResponse> getCreateNotificationTemplateMethod;
    if ((getCreateNotificationTemplateMethod = NotificationServiceGrpc.getCreateNotificationTemplateMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getCreateNotificationTemplateMethod = NotificationServiceGrpc.getCreateNotificationTemplateMethod) == null) {
          NotificationServiceGrpc.getCreateNotificationTemplateMethod = getCreateNotificationTemplateMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.CreateNotificationTemplateRequest, com.movieplatform.proto.notification.CreateNotificationTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNotificationTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.CreateNotificationTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.CreateNotificationTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("CreateNotificationTemplate"))
              .build();
        }
      }
    }
    return getCreateNotificationTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UpdateNotificationTemplateRequest,
      com.movieplatform.proto.notification.UpdateNotificationTemplateResponse> getUpdateNotificationTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNotificationTemplate",
      requestType = com.movieplatform.proto.notification.UpdateNotificationTemplateRequest.class,
      responseType = com.movieplatform.proto.notification.UpdateNotificationTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UpdateNotificationTemplateRequest,
      com.movieplatform.proto.notification.UpdateNotificationTemplateResponse> getUpdateNotificationTemplateMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.UpdateNotificationTemplateRequest, com.movieplatform.proto.notification.UpdateNotificationTemplateResponse> getUpdateNotificationTemplateMethod;
    if ((getUpdateNotificationTemplateMethod = NotificationServiceGrpc.getUpdateNotificationTemplateMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getUpdateNotificationTemplateMethod = NotificationServiceGrpc.getUpdateNotificationTemplateMethod) == null) {
          NotificationServiceGrpc.getUpdateNotificationTemplateMethod = getUpdateNotificationTemplateMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.UpdateNotificationTemplateRequest, com.movieplatform.proto.notification.UpdateNotificationTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNotificationTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.UpdateNotificationTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.UpdateNotificationTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("UpdateNotificationTemplate"))
              .build();
        }
      }
    }
    return getUpdateNotificationTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.DeleteNotificationTemplateRequest,
      com.movieplatform.proto.notification.DeleteNotificationTemplateResponse> getDeleteNotificationTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNotificationTemplate",
      requestType = com.movieplatform.proto.notification.DeleteNotificationTemplateRequest.class,
      responseType = com.movieplatform.proto.notification.DeleteNotificationTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.DeleteNotificationTemplateRequest,
      com.movieplatform.proto.notification.DeleteNotificationTemplateResponse> getDeleteNotificationTemplateMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.DeleteNotificationTemplateRequest, com.movieplatform.proto.notification.DeleteNotificationTemplateResponse> getDeleteNotificationTemplateMethod;
    if ((getDeleteNotificationTemplateMethod = NotificationServiceGrpc.getDeleteNotificationTemplateMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getDeleteNotificationTemplateMethod = NotificationServiceGrpc.getDeleteNotificationTemplateMethod) == null) {
          NotificationServiceGrpc.getDeleteNotificationTemplateMethod = getDeleteNotificationTemplateMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.DeleteNotificationTemplateRequest, com.movieplatform.proto.notification.DeleteNotificationTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNotificationTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.DeleteNotificationTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.DeleteNotificationTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("DeleteNotificationTemplate"))
              .build();
        }
      }
    }
    return getDeleteNotificationTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetNotificationAnalyticsRequest,
      com.movieplatform.proto.notification.GetNotificationAnalyticsResponse> getGetNotificationAnalyticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotificationAnalytics",
      requestType = com.movieplatform.proto.notification.GetNotificationAnalyticsRequest.class,
      responseType = com.movieplatform.proto.notification.GetNotificationAnalyticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetNotificationAnalyticsRequest,
      com.movieplatform.proto.notification.GetNotificationAnalyticsResponse> getGetNotificationAnalyticsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetNotificationAnalyticsRequest, com.movieplatform.proto.notification.GetNotificationAnalyticsResponse> getGetNotificationAnalyticsMethod;
    if ((getGetNotificationAnalyticsMethod = NotificationServiceGrpc.getGetNotificationAnalyticsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getGetNotificationAnalyticsMethod = NotificationServiceGrpc.getGetNotificationAnalyticsMethod) == null) {
          NotificationServiceGrpc.getGetNotificationAnalyticsMethod = getGetNotificationAnalyticsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.GetNotificationAnalyticsRequest, com.movieplatform.proto.notification.GetNotificationAnalyticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotificationAnalytics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetNotificationAnalyticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetNotificationAnalyticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("GetNotificationAnalytics"))
              .build();
        }
      }
    }
    return getGetNotificationAnalyticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetDeliveryReportsRequest,
      com.movieplatform.proto.notification.GetDeliveryReportsResponse> getGetDeliveryReportsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeliveryReports",
      requestType = com.movieplatform.proto.notification.GetDeliveryReportsRequest.class,
      responseType = com.movieplatform.proto.notification.GetDeliveryReportsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetDeliveryReportsRequest,
      com.movieplatform.proto.notification.GetDeliveryReportsResponse> getGetDeliveryReportsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetDeliveryReportsRequest, com.movieplatform.proto.notification.GetDeliveryReportsResponse> getGetDeliveryReportsMethod;
    if ((getGetDeliveryReportsMethod = NotificationServiceGrpc.getGetDeliveryReportsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getGetDeliveryReportsMethod = NotificationServiceGrpc.getGetDeliveryReportsMethod) == null) {
          NotificationServiceGrpc.getGetDeliveryReportsMethod = getGetDeliveryReportsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.GetDeliveryReportsRequest, com.movieplatform.proto.notification.GetDeliveryReportsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeliveryReports"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetDeliveryReportsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetDeliveryReportsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("GetDeliveryReports"))
              .build();
        }
      }
    }
    return getGetDeliveryReportsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetEngagementMetricsRequest,
      com.movieplatform.proto.notification.GetEngagementMetricsResponse> getGetEngagementMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEngagementMetrics",
      requestType = com.movieplatform.proto.notification.GetEngagementMetricsRequest.class,
      responseType = com.movieplatform.proto.notification.GetEngagementMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetEngagementMetricsRequest,
      com.movieplatform.proto.notification.GetEngagementMetricsResponse> getGetEngagementMetricsMethod() {
    io.grpc.MethodDescriptor<com.movieplatform.proto.notification.GetEngagementMetricsRequest, com.movieplatform.proto.notification.GetEngagementMetricsResponse> getGetEngagementMetricsMethod;
    if ((getGetEngagementMetricsMethod = NotificationServiceGrpc.getGetEngagementMetricsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getGetEngagementMetricsMethod = NotificationServiceGrpc.getGetEngagementMetricsMethod) == null) {
          NotificationServiceGrpc.getGetEngagementMetricsMethod = getGetEngagementMetricsMethod =
              io.grpc.MethodDescriptor.<com.movieplatform.proto.notification.GetEngagementMetricsRequest, com.movieplatform.proto.notification.GetEngagementMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEngagementMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetEngagementMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.movieplatform.proto.notification.GetEngagementMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("GetEngagementMetrics"))
              .build();
        }
      }
    }
    return getGetEngagementMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServiceStub>() {
        @java.lang.Override
        public NotificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServiceStub(channel, callOptions);
        }
      };
    return NotificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServiceBlockingStub>() {
        @java.lang.Override
        public NotificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServiceBlockingStub(channel, callOptions);
        }
      };
    return NotificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServiceFutureStub>() {
        @java.lang.Override
        public NotificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServiceFutureStub(channel, callOptions);
        }
      };
    return NotificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Notification and communication service
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * User notifications
     * </pre>
     */
    default void sendUserNotification(com.movieplatform.proto.notification.SendUserNotificationRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendUserNotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendUserNotificationMethod(), responseObserver);
    }

    /**
     */
    default void getUserNotifications(com.movieplatform.proto.notification.GetUserNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetUserNotificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserNotificationsMethod(), responseObserver);
    }

    /**
     */
    default void markNotificationRead(com.movieplatform.proto.notification.MarkNotificationReadRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.MarkNotificationReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkNotificationReadMethod(), responseObserver);
    }

    /**
     */
    default void deleteNotification(com.movieplatform.proto.notification.DeleteNotificationRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.DeleteNotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNotificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Email notifications
     * </pre>
     */
    default void sendEmailNotification(com.movieplatform.proto.notification.SendEmailNotificationRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendEmailNotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEmailNotificationMethod(), responseObserver);
    }

    /**
     */
    default void sendEmailTemplate(com.movieplatform.proto.notification.SendEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendEmailTemplateMethod(), responseObserver);
    }

    /**
     */
    default void getEmailStatus(com.movieplatform.proto.notification.GetEmailStatusRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetEmailStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmailStatusMethod(), responseObserver);
    }

    /**
     */
    default void resendEmail(com.movieplatform.proto.notification.ResendEmailRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.ResendEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Push notifications
     * </pre>
     */
    default void sendPushNotification(com.movieplatform.proto.notification.SendPushNotificationRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendPushNotificationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPushNotificationMethod(), responseObserver);
    }

    /**
     */
    default void registerPushToken(com.movieplatform.proto.notification.RegisterPushTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.RegisterPushTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterPushTokenMethod(), responseObserver);
    }

    /**
     */
    default void unregisterPushToken(com.movieplatform.proto.notification.UnregisterPushTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UnregisterPushTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnregisterPushTokenMethod(), responseObserver);
    }

    /**
     */
    default void getPushDeliveryStatus(com.movieplatform.proto.notification.GetPushDeliveryStatusRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetPushDeliveryStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPushDeliveryStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Marketing communications
     * </pre>
     */
    default void sendMarketingEmail(com.movieplatform.proto.notification.SendMarketingEmailRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendMarketingEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMarketingEmailMethod(), responseObserver);
    }

    /**
     */
    default void sendMarketingPush(com.movieplatform.proto.notification.SendMarketingPushRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendMarketingPushResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMarketingPushMethod(), responseObserver);
    }

    /**
     */
    default void getMarketingCampaigns(com.movieplatform.proto.notification.GetMarketingCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetMarketingCampaignsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMarketingCampaignsMethod(), responseObserver);
    }

    /**
     */
    default void trackMarketingEvent(com.movieplatform.proto.notification.TrackMarketingEventRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.TrackMarketingEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTrackMarketingEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Preference management
     * </pre>
     */
    default void getNotificationPreferences(com.movieplatform.proto.notification.GetNotificationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetNotificationPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotificationPreferencesMethod(), responseObserver);
    }

    /**
     */
    default void updateNotificationPreferences(com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNotificationPreferencesMethod(), responseObserver);
    }

    /**
     */
    default void subscribeToNotifications(com.movieplatform.proto.notification.SubscribeToNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SubscribeToNotificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeToNotificationsMethod(), responseObserver);
    }

    /**
     */
    default void unsubscribeFromNotifications(com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnsubscribeFromNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    default void getNotificationTemplates(com.movieplatform.proto.notification.GetNotificationTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetNotificationTemplatesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotificationTemplatesMethod(), responseObserver);
    }

    /**
     */
    default void createNotificationTemplate(com.movieplatform.proto.notification.CreateNotificationTemplateRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.CreateNotificationTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNotificationTemplateMethod(), responseObserver);
    }

    /**
     */
    default void updateNotificationTemplate(com.movieplatform.proto.notification.UpdateNotificationTemplateRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UpdateNotificationTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNotificationTemplateMethod(), responseObserver);
    }

    /**
     */
    default void deleteNotificationTemplate(com.movieplatform.proto.notification.DeleteNotificationTemplateRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.DeleteNotificationTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNotificationTemplateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Analytics and reporting
     * </pre>
     */
    default void getNotificationAnalytics(com.movieplatform.proto.notification.GetNotificationAnalyticsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetNotificationAnalyticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotificationAnalyticsMethod(), responseObserver);
    }

    /**
     */
    default void getDeliveryReports(com.movieplatform.proto.notification.GetDeliveryReportsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetDeliveryReportsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeliveryReportsMethod(), responseObserver);
    }

    /**
     */
    default void getEngagementMetrics(com.movieplatform.proto.notification.GetEngagementMetricsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetEngagementMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEngagementMetricsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service NotificationService.
   * <pre>
   * Notification and communication service
   * </pre>
   */
  public static abstract class NotificationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return NotificationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service NotificationService.
   * <pre>
   * Notification and communication service
   * </pre>
   */
  public static final class NotificationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NotificationServiceStub> {
    private NotificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * User notifications
     * </pre>
     */
    public void sendUserNotification(com.movieplatform.proto.notification.SendUserNotificationRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendUserNotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendUserNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserNotifications(com.movieplatform.proto.notification.GetUserNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetUserNotificationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void markNotificationRead(com.movieplatform.proto.notification.MarkNotificationReadRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.MarkNotificationReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkNotificationReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNotification(com.movieplatform.proto.notification.DeleteNotificationRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.DeleteNotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Email notifications
     * </pre>
     */
    public void sendEmailNotification(com.movieplatform.proto.notification.SendEmailNotificationRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendEmailNotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendEmailNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendEmailTemplate(com.movieplatform.proto.notification.SendEmailTemplateRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendEmailTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendEmailTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmailStatus(com.movieplatform.proto.notification.GetEmailStatusRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetEmailStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmailStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resendEmail(com.movieplatform.proto.notification.ResendEmailRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.ResendEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Push notifications
     * </pre>
     */
    public void sendPushNotification(com.movieplatform.proto.notification.SendPushNotificationRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendPushNotificationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPushNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerPushToken(com.movieplatform.proto.notification.RegisterPushTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.RegisterPushTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterPushTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterPushToken(com.movieplatform.proto.notification.UnregisterPushTokenRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UnregisterPushTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnregisterPushTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPushDeliveryStatus(com.movieplatform.proto.notification.GetPushDeliveryStatusRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetPushDeliveryStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPushDeliveryStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Marketing communications
     * </pre>
     */
    public void sendMarketingEmail(com.movieplatform.proto.notification.SendMarketingEmailRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendMarketingEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMarketingEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendMarketingPush(com.movieplatform.proto.notification.SendMarketingPushRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendMarketingPushResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMarketingPushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMarketingCampaigns(com.movieplatform.proto.notification.GetMarketingCampaignsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetMarketingCampaignsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMarketingCampaignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void trackMarketingEvent(com.movieplatform.proto.notification.TrackMarketingEventRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.TrackMarketingEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTrackMarketingEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Preference management
     * </pre>
     */
    public void getNotificationPreferences(com.movieplatform.proto.notification.GetNotificationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetNotificationPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNotificationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNotificationPreferences(com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNotificationPreferencesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeToNotifications(com.movieplatform.proto.notification.SubscribeToNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SubscribeToNotificationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeToNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unsubscribeFromNotifications(com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnsubscribeFromNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public void getNotificationTemplates(com.movieplatform.proto.notification.GetNotificationTemplatesRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetNotificationTemplatesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNotificationTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNotificationTemplate(com.movieplatform.proto.notification.CreateNotificationTemplateRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.CreateNotificationTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNotificationTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNotificationTemplate(com.movieplatform.proto.notification.UpdateNotificationTemplateRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UpdateNotificationTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNotificationTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNotificationTemplate(com.movieplatform.proto.notification.DeleteNotificationTemplateRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.DeleteNotificationTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Analytics and reporting
     * </pre>
     */
    public void getNotificationAnalytics(com.movieplatform.proto.notification.GetNotificationAnalyticsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetNotificationAnalyticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNotificationAnalyticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDeliveryReports(com.movieplatform.proto.notification.GetDeliveryReportsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetDeliveryReportsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeliveryReportsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEngagementMetrics(com.movieplatform.proto.notification.GetEngagementMetricsRequest request,
        io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetEngagementMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEngagementMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service NotificationService.
   * <pre>
   * Notification and communication service
   * </pre>
   */
  public static final class NotificationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NotificationServiceBlockingStub> {
    private NotificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * User notifications
     * </pre>
     */
    public com.movieplatform.proto.notification.SendUserNotificationResponse sendUserNotification(com.movieplatform.proto.notification.SendUserNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendUserNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.GetUserNotificationsResponse getUserNotifications(com.movieplatform.proto.notification.GetUserNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserNotificationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.MarkNotificationReadResponse markNotificationRead(com.movieplatform.proto.notification.MarkNotificationReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkNotificationReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.DeleteNotificationResponse deleteNotification(com.movieplatform.proto.notification.DeleteNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNotificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Email notifications
     * </pre>
     */
    public com.movieplatform.proto.notification.SendEmailNotificationResponse sendEmailNotification(com.movieplatform.proto.notification.SendEmailNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendEmailNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.SendEmailTemplateResponse sendEmailTemplate(com.movieplatform.proto.notification.SendEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendEmailTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.GetEmailStatusResponse getEmailStatus(com.movieplatform.proto.notification.GetEmailStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmailStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.ResendEmailResponse resendEmail(com.movieplatform.proto.notification.ResendEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Push notifications
     * </pre>
     */
    public com.movieplatform.proto.notification.SendPushNotificationResponse sendPushNotification(com.movieplatform.proto.notification.SendPushNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPushNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.RegisterPushTokenResponse registerPushToken(com.movieplatform.proto.notification.RegisterPushTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterPushTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.UnregisterPushTokenResponse unregisterPushToken(com.movieplatform.proto.notification.UnregisterPushTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnregisterPushTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.GetPushDeliveryStatusResponse getPushDeliveryStatus(com.movieplatform.proto.notification.GetPushDeliveryStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPushDeliveryStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Marketing communications
     * </pre>
     */
    public com.movieplatform.proto.notification.SendMarketingEmailResponse sendMarketingEmail(com.movieplatform.proto.notification.SendMarketingEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMarketingEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.SendMarketingPushResponse sendMarketingPush(com.movieplatform.proto.notification.SendMarketingPushRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMarketingPushMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.GetMarketingCampaignsResponse getMarketingCampaigns(com.movieplatform.proto.notification.GetMarketingCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMarketingCampaignsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.TrackMarketingEventResponse trackMarketingEvent(com.movieplatform.proto.notification.TrackMarketingEventRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTrackMarketingEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Preference management
     * </pre>
     */
    public com.movieplatform.proto.notification.GetNotificationPreferencesResponse getNotificationPreferences(com.movieplatform.proto.notification.GetNotificationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNotificationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse updateNotificationPreferences(com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNotificationPreferencesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.SubscribeToNotificationsResponse subscribeToNotifications(com.movieplatform.proto.notification.SubscribeToNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeToNotificationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse unsubscribeFromNotifications(com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsubscribeFromNotificationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public com.movieplatform.proto.notification.GetNotificationTemplatesResponse getNotificationTemplates(com.movieplatform.proto.notification.GetNotificationTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNotificationTemplatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.CreateNotificationTemplateResponse createNotificationTemplate(com.movieplatform.proto.notification.CreateNotificationTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNotificationTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.UpdateNotificationTemplateResponse updateNotificationTemplate(com.movieplatform.proto.notification.UpdateNotificationTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNotificationTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.DeleteNotificationTemplateResponse deleteNotificationTemplate(com.movieplatform.proto.notification.DeleteNotificationTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNotificationTemplateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Analytics and reporting
     * </pre>
     */
    public com.movieplatform.proto.notification.GetNotificationAnalyticsResponse getNotificationAnalytics(com.movieplatform.proto.notification.GetNotificationAnalyticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNotificationAnalyticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.GetDeliveryReportsResponse getDeliveryReports(com.movieplatform.proto.notification.GetDeliveryReportsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeliveryReportsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.movieplatform.proto.notification.GetEngagementMetricsResponse getEngagementMetrics(com.movieplatform.proto.notification.GetEngagementMetricsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEngagementMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service NotificationService.
   * <pre>
   * Notification and communication service
   * </pre>
   */
  public static final class NotificationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NotificationServiceFutureStub> {
    private NotificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * User notifications
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.SendUserNotificationResponse> sendUserNotification(
        com.movieplatform.proto.notification.SendUserNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendUserNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.GetUserNotificationsResponse> getUserNotifications(
        com.movieplatform.proto.notification.GetUserNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserNotificationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.MarkNotificationReadResponse> markNotificationRead(
        com.movieplatform.proto.notification.MarkNotificationReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkNotificationReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.DeleteNotificationResponse> deleteNotification(
        com.movieplatform.proto.notification.DeleteNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNotificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Email notifications
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.SendEmailNotificationResponse> sendEmailNotification(
        com.movieplatform.proto.notification.SendEmailNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendEmailNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.SendEmailTemplateResponse> sendEmailTemplate(
        com.movieplatform.proto.notification.SendEmailTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendEmailTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.GetEmailStatusResponse> getEmailStatus(
        com.movieplatform.proto.notification.GetEmailStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmailStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.ResendEmailResponse> resendEmail(
        com.movieplatform.proto.notification.ResendEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Push notifications
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.SendPushNotificationResponse> sendPushNotification(
        com.movieplatform.proto.notification.SendPushNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPushNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.RegisterPushTokenResponse> registerPushToken(
        com.movieplatform.proto.notification.RegisterPushTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterPushTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.UnregisterPushTokenResponse> unregisterPushToken(
        com.movieplatform.proto.notification.UnregisterPushTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnregisterPushTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.GetPushDeliveryStatusResponse> getPushDeliveryStatus(
        com.movieplatform.proto.notification.GetPushDeliveryStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPushDeliveryStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Marketing communications
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.SendMarketingEmailResponse> sendMarketingEmail(
        com.movieplatform.proto.notification.SendMarketingEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMarketingEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.SendMarketingPushResponse> sendMarketingPush(
        com.movieplatform.proto.notification.SendMarketingPushRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMarketingPushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.GetMarketingCampaignsResponse> getMarketingCampaigns(
        com.movieplatform.proto.notification.GetMarketingCampaignsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMarketingCampaignsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.TrackMarketingEventResponse> trackMarketingEvent(
        com.movieplatform.proto.notification.TrackMarketingEventRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTrackMarketingEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Preference management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.GetNotificationPreferencesResponse> getNotificationPreferences(
        com.movieplatform.proto.notification.GetNotificationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNotificationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse> updateNotificationPreferences(
        com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNotificationPreferencesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.SubscribeToNotificationsResponse> subscribeToNotifications(
        com.movieplatform.proto.notification.SubscribeToNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeToNotificationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse> unsubscribeFromNotifications(
        com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnsubscribeFromNotificationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Template management
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.GetNotificationTemplatesResponse> getNotificationTemplates(
        com.movieplatform.proto.notification.GetNotificationTemplatesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNotificationTemplatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.CreateNotificationTemplateResponse> createNotificationTemplate(
        com.movieplatform.proto.notification.CreateNotificationTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNotificationTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.UpdateNotificationTemplateResponse> updateNotificationTemplate(
        com.movieplatform.proto.notification.UpdateNotificationTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNotificationTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.DeleteNotificationTemplateResponse> deleteNotificationTemplate(
        com.movieplatform.proto.notification.DeleteNotificationTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNotificationTemplateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Analytics and reporting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.GetNotificationAnalyticsResponse> getNotificationAnalytics(
        com.movieplatform.proto.notification.GetNotificationAnalyticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNotificationAnalyticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.GetDeliveryReportsResponse> getDeliveryReports(
        com.movieplatform.proto.notification.GetDeliveryReportsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeliveryReportsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.movieplatform.proto.notification.GetEngagementMetricsResponse> getEngagementMetrics(
        com.movieplatform.proto.notification.GetEngagementMetricsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEngagementMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_USER_NOTIFICATION = 0;
  private static final int METHODID_GET_USER_NOTIFICATIONS = 1;
  private static final int METHODID_MARK_NOTIFICATION_READ = 2;
  private static final int METHODID_DELETE_NOTIFICATION = 3;
  private static final int METHODID_SEND_EMAIL_NOTIFICATION = 4;
  private static final int METHODID_SEND_EMAIL_TEMPLATE = 5;
  private static final int METHODID_GET_EMAIL_STATUS = 6;
  private static final int METHODID_RESEND_EMAIL = 7;
  private static final int METHODID_SEND_PUSH_NOTIFICATION = 8;
  private static final int METHODID_REGISTER_PUSH_TOKEN = 9;
  private static final int METHODID_UNREGISTER_PUSH_TOKEN = 10;
  private static final int METHODID_GET_PUSH_DELIVERY_STATUS = 11;
  private static final int METHODID_SEND_MARKETING_EMAIL = 12;
  private static final int METHODID_SEND_MARKETING_PUSH = 13;
  private static final int METHODID_GET_MARKETING_CAMPAIGNS = 14;
  private static final int METHODID_TRACK_MARKETING_EVENT = 15;
  private static final int METHODID_GET_NOTIFICATION_PREFERENCES = 16;
  private static final int METHODID_UPDATE_NOTIFICATION_PREFERENCES = 17;
  private static final int METHODID_SUBSCRIBE_TO_NOTIFICATIONS = 18;
  private static final int METHODID_UNSUBSCRIBE_FROM_NOTIFICATIONS = 19;
  private static final int METHODID_GET_NOTIFICATION_TEMPLATES = 20;
  private static final int METHODID_CREATE_NOTIFICATION_TEMPLATE = 21;
  private static final int METHODID_UPDATE_NOTIFICATION_TEMPLATE = 22;
  private static final int METHODID_DELETE_NOTIFICATION_TEMPLATE = 23;
  private static final int METHODID_GET_NOTIFICATION_ANALYTICS = 24;
  private static final int METHODID_GET_DELIVERY_REPORTS = 25;
  private static final int METHODID_GET_ENGAGEMENT_METRICS = 26;

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
        case METHODID_SEND_USER_NOTIFICATION:
          serviceImpl.sendUserNotification((com.movieplatform.proto.notification.SendUserNotificationRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendUserNotificationResponse>) responseObserver);
          break;
        case METHODID_GET_USER_NOTIFICATIONS:
          serviceImpl.getUserNotifications((com.movieplatform.proto.notification.GetUserNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetUserNotificationsResponse>) responseObserver);
          break;
        case METHODID_MARK_NOTIFICATION_READ:
          serviceImpl.markNotificationRead((com.movieplatform.proto.notification.MarkNotificationReadRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.MarkNotificationReadResponse>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATION:
          serviceImpl.deleteNotification((com.movieplatform.proto.notification.DeleteNotificationRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.DeleteNotificationResponse>) responseObserver);
          break;
        case METHODID_SEND_EMAIL_NOTIFICATION:
          serviceImpl.sendEmailNotification((com.movieplatform.proto.notification.SendEmailNotificationRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendEmailNotificationResponse>) responseObserver);
          break;
        case METHODID_SEND_EMAIL_TEMPLATE:
          serviceImpl.sendEmailTemplate((com.movieplatform.proto.notification.SendEmailTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendEmailTemplateResponse>) responseObserver);
          break;
        case METHODID_GET_EMAIL_STATUS:
          serviceImpl.getEmailStatus((com.movieplatform.proto.notification.GetEmailStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetEmailStatusResponse>) responseObserver);
          break;
        case METHODID_RESEND_EMAIL:
          serviceImpl.resendEmail((com.movieplatform.proto.notification.ResendEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.ResendEmailResponse>) responseObserver);
          break;
        case METHODID_SEND_PUSH_NOTIFICATION:
          serviceImpl.sendPushNotification((com.movieplatform.proto.notification.SendPushNotificationRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendPushNotificationResponse>) responseObserver);
          break;
        case METHODID_REGISTER_PUSH_TOKEN:
          serviceImpl.registerPushToken((com.movieplatform.proto.notification.RegisterPushTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.RegisterPushTokenResponse>) responseObserver);
          break;
        case METHODID_UNREGISTER_PUSH_TOKEN:
          serviceImpl.unregisterPushToken((com.movieplatform.proto.notification.UnregisterPushTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UnregisterPushTokenResponse>) responseObserver);
          break;
        case METHODID_GET_PUSH_DELIVERY_STATUS:
          serviceImpl.getPushDeliveryStatus((com.movieplatform.proto.notification.GetPushDeliveryStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetPushDeliveryStatusResponse>) responseObserver);
          break;
        case METHODID_SEND_MARKETING_EMAIL:
          serviceImpl.sendMarketingEmail((com.movieplatform.proto.notification.SendMarketingEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendMarketingEmailResponse>) responseObserver);
          break;
        case METHODID_SEND_MARKETING_PUSH:
          serviceImpl.sendMarketingPush((com.movieplatform.proto.notification.SendMarketingPushRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SendMarketingPushResponse>) responseObserver);
          break;
        case METHODID_GET_MARKETING_CAMPAIGNS:
          serviceImpl.getMarketingCampaigns((com.movieplatform.proto.notification.GetMarketingCampaignsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetMarketingCampaignsResponse>) responseObserver);
          break;
        case METHODID_TRACK_MARKETING_EVENT:
          serviceImpl.trackMarketingEvent((com.movieplatform.proto.notification.TrackMarketingEventRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.TrackMarketingEventResponse>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATION_PREFERENCES:
          serviceImpl.getNotificationPreferences((com.movieplatform.proto.notification.GetNotificationPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetNotificationPreferencesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NOTIFICATION_PREFERENCES:
          serviceImpl.updateNotificationPreferences((com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_NOTIFICATIONS:
          serviceImpl.subscribeToNotifications((com.movieplatform.proto.notification.SubscribeToNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.SubscribeToNotificationsResponse>) responseObserver);
          break;
        case METHODID_UNSUBSCRIBE_FROM_NOTIFICATIONS:
          serviceImpl.unsubscribeFromNotifications((com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATION_TEMPLATES:
          serviceImpl.getNotificationTemplates((com.movieplatform.proto.notification.GetNotificationTemplatesRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetNotificationTemplatesResponse>) responseObserver);
          break;
        case METHODID_CREATE_NOTIFICATION_TEMPLATE:
          serviceImpl.createNotificationTemplate((com.movieplatform.proto.notification.CreateNotificationTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.CreateNotificationTemplateResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NOTIFICATION_TEMPLATE:
          serviceImpl.updateNotificationTemplate((com.movieplatform.proto.notification.UpdateNotificationTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.UpdateNotificationTemplateResponse>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATION_TEMPLATE:
          serviceImpl.deleteNotificationTemplate((com.movieplatform.proto.notification.DeleteNotificationTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.DeleteNotificationTemplateResponse>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATION_ANALYTICS:
          serviceImpl.getNotificationAnalytics((com.movieplatform.proto.notification.GetNotificationAnalyticsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetNotificationAnalyticsResponse>) responseObserver);
          break;
        case METHODID_GET_DELIVERY_REPORTS:
          serviceImpl.getDeliveryReports((com.movieplatform.proto.notification.GetDeliveryReportsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetDeliveryReportsResponse>) responseObserver);
          break;
        case METHODID_GET_ENGAGEMENT_METRICS:
          serviceImpl.getEngagementMetrics((com.movieplatform.proto.notification.GetEngagementMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.movieplatform.proto.notification.GetEngagementMetricsResponse>) responseObserver);
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
          getSendUserNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.SendUserNotificationRequest,
              com.movieplatform.proto.notification.SendUserNotificationResponse>(
                service, METHODID_SEND_USER_NOTIFICATION)))
        .addMethod(
          getGetUserNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.GetUserNotificationsRequest,
              com.movieplatform.proto.notification.GetUserNotificationsResponse>(
                service, METHODID_GET_USER_NOTIFICATIONS)))
        .addMethod(
          getMarkNotificationReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.MarkNotificationReadRequest,
              com.movieplatform.proto.notification.MarkNotificationReadResponse>(
                service, METHODID_MARK_NOTIFICATION_READ)))
        .addMethod(
          getDeleteNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.DeleteNotificationRequest,
              com.movieplatform.proto.notification.DeleteNotificationResponse>(
                service, METHODID_DELETE_NOTIFICATION)))
        .addMethod(
          getSendEmailNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.SendEmailNotificationRequest,
              com.movieplatform.proto.notification.SendEmailNotificationResponse>(
                service, METHODID_SEND_EMAIL_NOTIFICATION)))
        .addMethod(
          getSendEmailTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.SendEmailTemplateRequest,
              com.movieplatform.proto.notification.SendEmailTemplateResponse>(
                service, METHODID_SEND_EMAIL_TEMPLATE)))
        .addMethod(
          getGetEmailStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.GetEmailStatusRequest,
              com.movieplatform.proto.notification.GetEmailStatusResponse>(
                service, METHODID_GET_EMAIL_STATUS)))
        .addMethod(
          getResendEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.ResendEmailRequest,
              com.movieplatform.proto.notification.ResendEmailResponse>(
                service, METHODID_RESEND_EMAIL)))
        .addMethod(
          getSendPushNotificationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.SendPushNotificationRequest,
              com.movieplatform.proto.notification.SendPushNotificationResponse>(
                service, METHODID_SEND_PUSH_NOTIFICATION)))
        .addMethod(
          getRegisterPushTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.RegisterPushTokenRequest,
              com.movieplatform.proto.notification.RegisterPushTokenResponse>(
                service, METHODID_REGISTER_PUSH_TOKEN)))
        .addMethod(
          getUnregisterPushTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.UnregisterPushTokenRequest,
              com.movieplatform.proto.notification.UnregisterPushTokenResponse>(
                service, METHODID_UNREGISTER_PUSH_TOKEN)))
        .addMethod(
          getGetPushDeliveryStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.GetPushDeliveryStatusRequest,
              com.movieplatform.proto.notification.GetPushDeliveryStatusResponse>(
                service, METHODID_GET_PUSH_DELIVERY_STATUS)))
        .addMethod(
          getSendMarketingEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.SendMarketingEmailRequest,
              com.movieplatform.proto.notification.SendMarketingEmailResponse>(
                service, METHODID_SEND_MARKETING_EMAIL)))
        .addMethod(
          getSendMarketingPushMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.SendMarketingPushRequest,
              com.movieplatform.proto.notification.SendMarketingPushResponse>(
                service, METHODID_SEND_MARKETING_PUSH)))
        .addMethod(
          getGetMarketingCampaignsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.GetMarketingCampaignsRequest,
              com.movieplatform.proto.notification.GetMarketingCampaignsResponse>(
                service, METHODID_GET_MARKETING_CAMPAIGNS)))
        .addMethod(
          getTrackMarketingEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.TrackMarketingEventRequest,
              com.movieplatform.proto.notification.TrackMarketingEventResponse>(
                service, METHODID_TRACK_MARKETING_EVENT)))
        .addMethod(
          getGetNotificationPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.GetNotificationPreferencesRequest,
              com.movieplatform.proto.notification.GetNotificationPreferencesResponse>(
                service, METHODID_GET_NOTIFICATION_PREFERENCES)))
        .addMethod(
          getUpdateNotificationPreferencesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.UpdateNotificationPreferencesRequest,
              com.movieplatform.proto.notification.UpdateNotificationPreferencesResponse>(
                service, METHODID_UPDATE_NOTIFICATION_PREFERENCES)))
        .addMethod(
          getSubscribeToNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.SubscribeToNotificationsRequest,
              com.movieplatform.proto.notification.SubscribeToNotificationsResponse>(
                service, METHODID_SUBSCRIBE_TO_NOTIFICATIONS)))
        .addMethod(
          getUnsubscribeFromNotificationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.UnsubscribeFromNotificationsRequest,
              com.movieplatform.proto.notification.UnsubscribeFromNotificationsResponse>(
                service, METHODID_UNSUBSCRIBE_FROM_NOTIFICATIONS)))
        .addMethod(
          getGetNotificationTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.GetNotificationTemplatesRequest,
              com.movieplatform.proto.notification.GetNotificationTemplatesResponse>(
                service, METHODID_GET_NOTIFICATION_TEMPLATES)))
        .addMethod(
          getCreateNotificationTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.CreateNotificationTemplateRequest,
              com.movieplatform.proto.notification.CreateNotificationTemplateResponse>(
                service, METHODID_CREATE_NOTIFICATION_TEMPLATE)))
        .addMethod(
          getUpdateNotificationTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.UpdateNotificationTemplateRequest,
              com.movieplatform.proto.notification.UpdateNotificationTemplateResponse>(
                service, METHODID_UPDATE_NOTIFICATION_TEMPLATE)))
        .addMethod(
          getDeleteNotificationTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.DeleteNotificationTemplateRequest,
              com.movieplatform.proto.notification.DeleteNotificationTemplateResponse>(
                service, METHODID_DELETE_NOTIFICATION_TEMPLATE)))
        .addMethod(
          getGetNotificationAnalyticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.GetNotificationAnalyticsRequest,
              com.movieplatform.proto.notification.GetNotificationAnalyticsResponse>(
                service, METHODID_GET_NOTIFICATION_ANALYTICS)))
        .addMethod(
          getGetDeliveryReportsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.GetDeliveryReportsRequest,
              com.movieplatform.proto.notification.GetDeliveryReportsResponse>(
                service, METHODID_GET_DELIVERY_REPORTS)))
        .addMethod(
          getGetEngagementMetricsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.movieplatform.proto.notification.GetEngagementMetricsRequest,
              com.movieplatform.proto.notification.GetEngagementMetricsResponse>(
                service, METHODID_GET_ENGAGEMENT_METRICS)))
        .build();
  }

  private static abstract class NotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.movieplatform.proto.notification.NotificationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotificationService");
    }
  }

  private static final class NotificationServiceFileDescriptorSupplier
      extends NotificationServiceBaseDescriptorSupplier {
    NotificationServiceFileDescriptorSupplier() {}
  }

  private static final class NotificationServiceMethodDescriptorSupplier
      extends NotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    NotificationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (NotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationServiceFileDescriptorSupplier())
              .addMethod(getSendUserNotificationMethod())
              .addMethod(getGetUserNotificationsMethod())
              .addMethod(getMarkNotificationReadMethod())
              .addMethod(getDeleteNotificationMethod())
              .addMethod(getSendEmailNotificationMethod())
              .addMethod(getSendEmailTemplateMethod())
              .addMethod(getGetEmailStatusMethod())
              .addMethod(getResendEmailMethod())
              .addMethod(getSendPushNotificationMethod())
              .addMethod(getRegisterPushTokenMethod())
              .addMethod(getUnregisterPushTokenMethod())
              .addMethod(getGetPushDeliveryStatusMethod())
              .addMethod(getSendMarketingEmailMethod())
              .addMethod(getSendMarketingPushMethod())
              .addMethod(getGetMarketingCampaignsMethod())
              .addMethod(getTrackMarketingEventMethod())
              .addMethod(getGetNotificationPreferencesMethod())
              .addMethod(getUpdateNotificationPreferencesMethod())
              .addMethod(getSubscribeToNotificationsMethod())
              .addMethod(getUnsubscribeFromNotificationsMethod())
              .addMethod(getGetNotificationTemplatesMethod())
              .addMethod(getCreateNotificationTemplateMethod())
              .addMethod(getUpdateNotificationTemplateMethod())
              .addMethod(getDeleteNotificationTemplateMethod())
              .addMethod(getGetNotificationAnalyticsMethod())
              .addMethod(getGetDeliveryReportsMethod())
              .addMethod(getGetEngagementMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
