from setuptools import setup, find_packages

setup(
    name="proto",
    version="1.0.0",
    description="Generated Protocol Buffer stubs for Movie Platform",
    author="Movie Platform Team",
    packages=find_packages(),
    install_requires=[
        "grpcio>=1.64.0",
        "grpcio-tools>=1.64.0",
        "protobuf>=4.25.0",
    ],
    python_requires=">=3.11",
)
