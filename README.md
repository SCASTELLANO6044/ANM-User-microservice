# ANM User Microservice

A Spring Boot REST microservice for creating and retrieving users.

## Tech Stack

- Java 25
- Spring Boot 4.1.1
- Spring Web MVC
- Spring Data JPA
- PostgreSQL
- ModelMapper
- Lombok
- Springdoc OpenAPI
- Gradle

## Requirements

- Java 25 or a compatible JDK
- PostgreSQL

Configure the PostgreSQL connection in `src/main/resources/application.properties` or through your environment before starting the application.

## Run Locally

On Windows:

```powershell
.\gradlew.bat bootRun
```

On macOS/Linux:

```bash
./gradlew bootRun
```

The service starts on the default Spring Boot port:

```text
http://localhost:8080
```

## API

### Create a user

```http
POST /
Content-Type: application/json
```

Example request:

```json
{
  "email": "user@example.com",
  "anmUlid": "01JUSEREXAMPLE",
  "usersname": "example-user"
}
```

### Get a user by ID

```http
GET /{id}
```

Example:

```text
GET /1
```

## API Documentation

When the application is running, OpenAPI documentation is available at:

- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`

## Test

Run the test suite with:

```powershell
.\gradlew.bat test
```

On macOS/Linux, use `./gradlew test`.
