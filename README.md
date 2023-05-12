# GreenStitch_Assingment

This project is a backend implementation for a login and signup REST API with security and JWT tokens using Spring Boot.

## Installation

1. Clone the repository:

      git clone https://github.com/Lakhan1122/GreenStitch_Assingment.git

2. Navigate to the project directory:

      cd GreenStitch_Assingment

3. Build the project using Maven:
  
        mvn clean install
  
## Setup
1. Open the application.properties file located in the src/main/resources directory.

2. Configure the H2 database:

    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=

3. Configure JWT properties:

      jwt.secret=YourSecretKey
      jwt.expiration=86400000

4. Run the application using Maven:

        mvn spring-boot:run

5. The application will start and listen on the default port 8080.


## API Endpoints

The following API endpoints are available:

### POST /api/auth/signup: Register a new user.
### POST /api/auth/login: Authenticate a user and retrieve a JWT token.

## Usage
  You can test the API endpoints using tools like Postman or cURL.

1.Register a new user:

  Send a POST request to /api/auth/signup.
  Provide the username and password in the request body.
  Receive a response indicating whether the user was registered successfully.

2. Authenticate a user and retrieve a JWT token:

  Send a POST request to /api/auth/login.
  Provide the username and password in the request body.
  Receive a response containing a JWT token.

3. Use the JWT token for authenticated requests:

  Include the JWT token in the Authorization header of subsequent requests.
  The token should be in the format: Bearer <token>.
  Validate the token on the server-side to authorize access to protected resources.

 ## Technologies Used
  
      Java,
      Spring Boot,
      Spring Security,
      H2 Database,
      JSON Web Tokens (JWT)
  
 Feel free to modify the instructions to match the specifics of your project.
  
Thank Your!
