# Java CRUD API

This project is a simple Java Spring Boot application that implements a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on a resource called `Item`. The API is documented using Swagger and can be accessed via a web browser or API testing tools like Postman.

## Project Structure

```
java-crud-api
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── Application.java
│   │   │           ├── controller
│   │   │           │   └── CrudController.java
│   │   │           ├── model
│   │   │           │   └── Item.java
│   │   │           └── service
│   │   │               └── CrudService.java
│   │   └── resources
│   │       └── application.properties
├── Dockerfile
├── pom.xml
└── README.md
```

## Technologies Used

- Java
- Spring Boot
- Maven
- Docker
- Swagger

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone https://github.com/yourusername/java-crud-api.git
   cd java-crud-api
   ```

2. **Build the project:**
   ```
   mvn clean install
   ```

3. **Run the application locally:**
   ```
   mvn spring-boot:run
   ```

4. **Access the API:**
   Open your browser or Postman and navigate to `http://localhost:8080/api/items`.

## Docker Instructions

To run the application in a Docker container, follow these steps:

1. **Build the Docker image:**
   ```
   docker build -t java-crud-api .
   ```

2. **Run the Docker container:**
   ```
   docker run -p 8080:8080 java-crud-api
   ```

3. **Access the API:**
   Open your browser or Postman and navigate to `http://localhost:8080/api/items`.

## API Endpoints

- **Create Item**
  - **POST** `/api/items`
  
- **Get Item**
  - **GET** `/api/items/{id}`
  
- **Update Item**
  - **PUT** `/api/items/{id}`
  
- **Delete Item**
  - **DELETE** `/api/items/{id}`

## API Documentation

The API is documented using Swagger. You can access the Swagger UI at `http://localhost:8080/swagger-ui.html` after running the application.

## License

This project is licensed under the MIT License. See the LICENSE file for details.