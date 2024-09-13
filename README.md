# Spring MVC CRUD Student Management App

This project is a web-based application built using **Spring Boot**, **Spring MVC**, and **Thymeleaf** to perform CRUD (Create, Read, Update, Delete) operations on student records. The app connects to a relational database (such as MySQL) to manage a list of students.

## Features
- Add new students
- View a list of all students
- Update student information
- Delete a student
- Persistence using relational databases (MySQL, H2, etc.)

## Technologies Used
- **Spring Boot 3.3.3** (Main framework)
- **Spring MVC** (Web framework)
- **Thymeleaf** (View layer)
- **Hibernate** (JPA for data persistence)
- **MySQL** (Default Database, easily changeable)
- **Maven** (Build tool)
- **Java 17** (Language version)

## Project Setup

### Prerequisites
Make sure the following software is installed on your system:
- **Java JDK 17**
- **Maven**
- **MySQL** (or any other relational database)

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/MReza-90/spring-mvc-crud-student-management.git
   cd spring-mvc-crud-student
   ```

2. **Database Setup:**
   Create a new MySQL database (or use any preferred relational database) and configure it in `application.properties` located in `src/main/resources`.

   Example for MySQL:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/student_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build and Run the Application:**
   Use Maven to build the project and run it.
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the Application:**
   Open a web browser and navigate to `http://localhost:8080` to access the student management system.


