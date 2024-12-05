# Java 8 Features Showcase

This repository demonstrates Java 8-specific features, many of which were either changed or removed in subsequent Java versions.

## Features Demonstrated

- Security Manager (deprecated in Java 17)
- Legacy Collections and Concurrent Collections
- Lambda Expressions and Functional Interfaces
- Stream API and Parallel Streams
- DateTime API Transition
- Nashorn JavaScript Engine (removed in Java 15)
- PermGen Memory Management
- Type Annotations
- Interface Default Methods
- Enhanced Reflection Capabilities

## Requirements

- Java 8 JDK
- Maven 3.x

## Building the Project

```bash
mvn clean install
```

## Project Structure

The project is organized by feature categories, with each package demonstrating specific Java 8 capabilities:

```
java8-features/
├── src/main/java/com/example/java8/
    ├── annotations/      - Type annotation demonstrations
    ├── collection/       - Legacy collection implementations
    ├── datetime/         - Date/Time API examples
    ├── interfaces/       - Default method demonstrations
    ├── lambda/          - Lambda expression examples
    ├── memory/          - PermGen memory management
    ├── reflection/      - Enhanced reflection features
    ├── script/          - Nashorn JavaScript engine
    ├── security/        - Security manager implementation
    └── stream/          - Stream and parallel stream processing
```

## Important Notes

1. Java Version Compatibility
   - This project specifically targets Java 8
   - Code won't compile with later Java versions without modifications

2. JVM-Specific Features
   - PermGen memory settings only work with Java 8 JVM
   - Security Manager implementation is Java 8 specific
   - Nashorn JavaScript engine requires Java 8

3. Deprecated Features
   - Some features demonstrated here are deprecated or removed in later Java versions
   - Code serves as a reference for maintaining legacy Java 8 applications

## License

MIT License - See LICENSE file for details
