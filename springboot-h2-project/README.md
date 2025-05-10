# Spring Boot H2 Database Project

This project is a simple Spring Boot application that demonstrates the use of an H2 in-memory database with two main entities: Employee and Department. 

## Project Structure

```
springboot-h2-project
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── springbooth2
│   │   │               ├── SpringbootH2Application.java
│   │   │               ├── model
│   │   │               │   ├── Department.java
│   │   │               │   └── Employee.java
│   │   │               ├── repository
│   │   │               │   ├── DepartmentRepository.java
│   │   │               │   └── EmployeeRepository.java
│   │   │               └── controller
│   │   │                   └── EmployeeController.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── springbooth2
│                       └── SpringbootH2ApplicationTests.java
└── README.md
```

## Prerequisites

- Java 11 or higher
- Maven

## Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd springboot-h2-project
   ```

2. **Run the application:**
   You can run the application using the following command:
   ```bash
   ./mvnw spring-boot:run
   ```
   For Windows, use:
   ```bash
   mvnw.cmd spring-boot:run
   ```

3. **Access the H2 Console:**
   Once the application is running, you can access the H2 console at:
   ```
   http://localhost:8080/h2-console
   ```
   Use the following credentials:
   - **JDBC URL:** jdbc:h2:mem:testdb
   - **User Name:** sa
   - **Password:** (leave blank)

## Usage

- The application provides RESTful endpoints for managing employees and departments.
- You can create, read, update, and delete employee records through the API.

## Sample Data

The application initializes the database with sample data defined in `src/main/resources/data.sql`.

## Testing

To run the tests, use the following command:
```bash
./mvnw test
```
For Windows, use:
```bash
mvnw.cmd test
```

## License

This project is licensed under the MIT License.