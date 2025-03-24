# Springboot2 Simplelogin

A simple Spring Boot 2 web application demonstrating user login functionality with session handling and form-based authentication. This project serves as a lightweight, beginner-friendly example of building secure login flows using Spring Boot 2 and Thymeleaf.

## About the Project
This application uses:

* Spring Boot (with embedded Tomcat)
* Spring Security
* Thymeleaf templates
* Java 8

## How to Run
### Prerequisites

* Java 8 or later
* Maven
  
### Run
Clone the repository:

```bash
git clone https://github.com/savitharaghunathan/springboot_simplelogin.git
cd springboot_simplelogin
```
### Build and run the application:

```bash
mvn clean install
mvn spring-boot:run
```

Once started, open your browser and navigate to: http://localhost:8080/login

### Default Credentials
You can log in using the hardcoded user credentials in the SecurityConfig.java:
```
Username: user | admin
Password: userpass | adminpass
```

### Testing
Run the unit tests:

```bash
mvn test
```
