# Java Protocol Buffer Stubs

Generated Java stubs for Movie Platform gRPC services.

## Overview
This package contains auto-generated Java classes from Protocol Buffer definitions for the Movie Platform microservices architecture.

## Generated Services
- **Common**: Base request/response patterns, error handling, pagination, common types
- **User**: User management, profiles, preferences, watchlists, ratings, history
- **Auth**: Authentication, registration, sessions, tokens, permissions, MFA
- **Movie**: Movie content, search, media assets, catalog, streaming metadata
- **Recommendation**: ML-based recommendations, behavior analysis, content similarity
- **Playback**: Streaming management, progress tracking, quality adaptation
- **Notification**: User notifications, email, push, marketing communications

## Maven Dependency
Add this to your `pom.xml`:

```xml
<dependency>
    <groupId>com.movieplatform</groupId>
    <artifactId>proto</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Dependencies Required
```xml
<dependencies>
    <dependency>
        <groupId>io.grpc</groupId>
        <artifactId>grpc-netty-shaded</artifactId>
        <version>1.64.0</version>
    </dependency>
    <dependency>
        <groupId>io.grpc</groupId>
        <artifactId>grpc-protobuf</artifactId>
        <version>1.64.0</version>
    </dependency>
    <dependency>
        <groupId>io.grpc</groupId>
        <artifactId>grpc-stub</artifactId>
        <version>1.64.0</version>
    </dependency>
    <dependency>
        <groupId>javax.annotation</groupId>
        <artifactId>javax.annotation-api</artifactId>
        <version>1.3.2</version>
    </dependency>
</dependencies>
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
├── common/          # Base types, error handling, pagination
├── user/            # User management services
├── auth/            # Authentication services
├── movie/           # Movie content services
├── recommendation/  # Recommendation engine services
├── playback/        # Streaming services
└── notification/    # Notification services
```

## Regeneration
To regenerate these stubs, run from the project root:
```bash
./proto/generate_proto.sh --java-only
```

## Notes
- Generated from Protocol Buffer definitions in `proto/` directory
- Uses Protocol Buffers v4.30.2
- Compatible with gRPC v1.64.0
- All services follow consistent naming conventions
- Includes comprehensive error handling and validation
