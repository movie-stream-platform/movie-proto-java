# Python Protocol Buffer Stubs

Generated Python stubs for Movie Platform gRPC services.

## Overview
This package contains auto-generated Python classes from Protocol Buffer definitions for the Movie Platform microservices architecture.

## Generated Services
- **common**: Base types, error handling, pagination
- **auth**: Authentication, authorization, and session management
- **user**: User management, profiles, and preferences
- **movie**: Movie catalog, metadata, and content management
- **recommendation**: ML-based content recommendations
- **playback**: Video streaming and progress tracking
- **notification**: User notifications and communications

## Installation
```bash
pip install -e .
```

## Dependencies Required
```python
install_requires=[
    "grpcio>=1.64.0",
    "grpcio-tools>=1.64.0",
    "protobuf>=4.25.0",
]
```

## Usage Example
```python
from proto.common.base_request_pb2 import BaseRequest
from proto.user.user_req_res_pb2 import CreateUserRequest

# Create base request
base_request = BaseRequest(
    request_id="req-123",
    auth_token="jwt-token"
)

# Use in service calls
request = CreateUserRequest(
    base_request=base_request,
    username="john_doe",
    email="john@example.com"
)
```

## Package Structure
```
proto/
proto
```

## Regeneration
To regenerate these stubs, run from the project root:
```bash
./generate_proto.sh --generate python
```

## Notes
- Generated from Protocol Buffer definitions in `proto/` directory
- Uses Protocol Buffers v4.30.2
- Compatible with gRPC v1.64.0
- All services follow consistent naming conventions
- Includes comprehensive error handling and validation
