# Go Protocol Buffer Stubs

Generated Go stubs for Movie Platform gRPC services.

## Overview
This package contains auto-generated Go structs and interfaces from Protocol Buffer definitions for the Movie Platform microservices architecture.

## Generated Services
- **common**: Base types, error handling, pagination
- **auth**: Authentication, authorization, and session management
- **user**: User management, profiles, and preferences
- **movie**: Movie catalog, metadata, and content management
- **recommendation**: ML-based content recommendations
- **playback**: Video streaming and progress tracking
- **notification**: User notifications and communications

## Go Module
This package is a Go module with the following structure:

```go
module github.com/movie-stream-platform/movie-proto-go
```

## Dependencies Required
```go
require (
    google.golang.org/grpc v1.64.0
    google.golang.org/protobuf v1.33.0
)
```

## Usage Example
```go
import (
    "github.com/movie-stream-platform/movie-proto-go/common"
    "github.com/movie-stream-platform/movie-proto-go/user"
)

// Create base request
baseRequest := &common.BaseRequest{
    RequestId: "req-123",
    AuthToken: "jwt-token",
}

// Use in service calls
request := &user.CreateUserRequest{
    BaseRequest: baseRequest,
    Username:    "john_doe",
    Email:       "john@example.com",
}
```

## Package Structure
```
github.com/movie-stream-platform/movie-proto-go/
.
```

## Regeneration
To regenerate these stubs, run from the project root:
```bash
./generate_proto.sh --generate go
```

## Notes
- Generated from Protocol Buffer definitions in `proto/` directory
- Uses Protocol Buffers v1.33.0
- Compatible with gRPC v1.64.0
- All services follow consistent naming conventions
- Includes comprehensive error handling and validation
