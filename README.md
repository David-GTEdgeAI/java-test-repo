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

The project is organized by feature categories, with each package demonstrating specific Java 8 capabilities.

## Important Notes

- This project specifically targets Java 8 and won't compile with later Java versions without modifications
- Some features (like PermGen settings) are specific to Java 8 JVM
- Nashorn JavaScript engine demonstrations require Java 8
