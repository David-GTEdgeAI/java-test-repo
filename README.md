# Task Manager

A simple task management system built with Spring Boot and Java 8.

## Features
- CRUD operations for tasks (Create, Read, Update, Delete)
- RESTful API endpoints
- H2 in-memory database
- Basic task attributes:
  - Title
  - Description
  - Completion status
  - Priority level
  - Due date

## Technology Stack
- Java 8
- Spring Boot 2.7.5
- Spring Data JPA
- H2 Database
- Maven
- JUnit & Mockito for testing

## Prerequisites
- JDK 8
- Maven 3.x
- Your favorite IDE (Eclipse, IntelliJ IDEA, etc.)

## Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/yourusername/task-manager.git
cd task-manager
```

### 2. Build the project
```bash
mvn clean install
```

### 3. Run the application
```bash
mvn spring-boot:run
```
The application will start on `http://localhost:8080`

### 4. Access H2 Console
- URL: `http://localhost:8080/h2-console`
- JDBC URL: `jdbc:h2:mem:taskdb`
- Username: `sa`
- Password: `` (empty)

## API Endpoints

### Tasks
| Method | URL | Description |
|--------|-----|-------------|
| GET    | /api/tasks | Get all tasks |
| GET    | /api/tasks/{id} | Get task by ID |
| POST   | /api/tasks | Create a new task |
| PUT    | /api/tasks/{id} | Update an existing task |
| DELETE | /api/tasks/{id} | Delete a task |

### Sample Request Body (POST/PUT)
```json
{
  "title": "Complete project",
  "description": "Finish the task manager project",
  "completed": false,
  "priority": "HIGH",
  "dueDate": "2024-12-31T23:59:59"
}
```

## Running Tests
```bash
mvn test
```

## Project Structure
```
task-manager/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/taskmanager/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
└── pom.xml
```

## Contributing
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Error Handling
The API uses standard HTTP status codes:
- 200: Success
- 404: Not Found
- 400: Bad Request
- 500: Internal Server Error

## Development
- The application uses an H2 in-memory database, so data will be reset when the application restarts
- For production use, consider switching to a persistent database like MySQL or PostgreSQL
- Logging is configured in application.properties
- All API endpoints return JSON responses

## Future Improvements
- Add user authentication and authorization
- Implement task categories/labels
- Add task search and filtering
- Email notifications for due dates
- Task assignments to users
- Batch operations for tasks
- API documentation with Swagger/OpenAPI

## License
This project is licensed under the MIT License - see the LICENSE file for details

## Acknowledgments
- Spring Boot Documentation
- H2 Database Documentation
- Spring Data JPA Documentation
