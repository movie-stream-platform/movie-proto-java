# Java Protocol Buffer Stubs

Generated Java stubs for Movie Platform gRPC services.

## Overview
This package contains auto-generated Java classes from Protocol Buffer definitions for the Movie Platform microservices architecture.

## Generated Services
- **common**: Base types, error handling, pagination
- **auth**: Authentication, authorization, and session management
- **user**: User management, profiles, and preferences
- **movie**: Movie catalog, metadata, and content management
- **recommendation**: ML-based content recommendations
- **playback**: Video streaming and progress tracking
- **notification**: User notifications and communications

## Gradle Dependency
Add this to your `build.gradle`:

```gradle
dependencies {
    implementation 'com.movieplatform:proto:1.0.0'
}
```

## Dependencies Required
```gradle
dependencies {
    implementation "io.grpc:grpc-netty-shaded:1.64.0"
    implementation "io.grpc:grpc-protobuf:1.64.0"
    implementation "io.grpc:grpc-stub:1.64.0"
    implementation "javax.annotation:javax.annotation-api:1.3.2"
}
```

## Usage Example
```java
import com.movieplatform.proto.common.BaseRequest;
import com.movieplatform.proto.user.UserServiceGrpc;
import com.movieplatform.proto.user.CreateUserRequest;

// Create base request
BaseRequest baseRequest = BaseRequest.newBuilder()
    .setRequestId("req-123")
    .setAuthToken("jwt-token")
    .build();

// Use in service calls
CreateUserRequest request = CreateUserRequest.newBuilder()
    .setBaseRequest(baseRequest)
    .setUsername("john_doe")
    .setEmail("john@example.com")
    .build();
```

## Package Structure
```
com.movieplatform.proto/
src/main/java
```

## Regeneration
To regenerate these stubs, run from the project root:
```bash
./generate_proto.sh --generate java
```

## Notes
- Generated from Protocol Buffer definitions in `proto/` directory
- Uses Protocol Buffers v4.30.2
- Compatible with gRPC v1.64.0
- All services follow consistent naming conventions
- Includes comprehensive error handling and validation
