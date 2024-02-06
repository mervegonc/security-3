# Spring Boot Security JWT Authentication Example

This project is an example of implementing JSON Web Token (JWT) based authentication mechanism using Spring Boot and Spring Security.

## Project Purpose

This project has been developed to secure a web application using a robust authentication mechanism. JSON Web Token (JWT) is utilized to authenticate user identity. The main purpose of the project is to enable users to sign up and log in, and to control access to specific endpoints for authorized users.

## Technologies Used

- Java
- Spring Boot v3.2.2
- Spring Security v6
- JWT (JSON Web Token) v0.12.3
- PostgreSQL
- Maven

## How to Run the Project

1. Clone the project to your computer or download it as a ZIP.
2. Open the project in a Java IDE (e.g., IntelliJ IDEA or Eclipse).
3. Open the `src/main/resources/application.properties` file and configure the necessary properties.
4. Use Maven to install project dependencies (`mvn clean install`).
5. Run the project by right-clicking on it or start the application by using the `mvn spring-boot:run` command in the terminal.
6. Once the application is successfully running, you can access it through your browser or API testing tool (e.g., Postman).

## Endpoints

- `/signup`: POST request to create a new user registration. Expects a JSON body containing username, email, and password information.
- `/login`: POST request to log in with an existing user. Expects a JSON body containing username or email and password information.
- `/admin`: A private endpoint accessible to authorized users only. This endpoint can only be accessed by users with the correct JWT token.

## Contributing

- If you find any bugs or issues, please open an issue on GitHub.
- If you have any development suggestions, please submit a pull request on GitHub.

## License

This project is licensed under the MIT License. See the LICENSE file for more information.
