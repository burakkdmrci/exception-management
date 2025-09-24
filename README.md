# Exception Management with Spring Boot & JPA

A Spring Boot project that demonstrates structured exception handling, API error responses, and data persistence using JPA.

## 🚀 Features

- Centralized exception handling using `@ControllerAdvice`  
- Custom exception classes (e.g. `NotFoundException`, `BadRequestException`)  
- Global error response format (consistent structure for all errors)  
- CRUD operations for main entities (via Spring Data JPA)  
- Validation errors handled and returned as friendly error messages  

## 🛠 Technologies Used

- Java 17+  
- Spring Boot  
- Spring Web MVC  
- Spring Data JPA  
- Hibernate  
- PostgreSQL

## 📁 Project Structure

<pre> ``` src └── main ├── java │ └── com.yourorg.exceptionmanagement │ ├── controller │ ├── dto │ ├── entity │ ├── exception │ ├── advice │ ├── repository │ └── service └── resources ├── application.properties └── other config files ``` </pre>

markdown

- **controller**: REST endpoints  
- **dto**: Data Transfer Objects for requests/responses  
- **entity**: JPA entity classes  
- **exception**: Custom exception types  
- **advice**: `@ControllerAdvice` classes for global handling  
- **repository**: Spring Data JPA repositories  
- **service**: Business logic layer  

## 🔧 Getting Started

### Prerequisites

- Java 17 or higher  
- Maven or Gradle  
- A relational database

### Installation & Run

1. Clone repository  
   ```bash
   git clone https://github.com/burakkdmrci/exception-management.git
Navigate into project folder

bash
cd exception-management
Configure database settings in src/main/resources/application.properties

Build & run

bash
./mvnw spring-boot:run
# or with Gradle
./gradlew bootRun
The application should start at:

arduino
http://localhost:8080
