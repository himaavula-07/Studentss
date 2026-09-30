STUDENT MANAGEMENT APPLICATION
===============================

Technologies:
Frontend: HTML, CSS, JavaScript
Backend: Java + Spring Boot
Architecture: MVC
Database: MySQL
Database access: JDBC / JdbcTemplate

FLOW:
Frontend -> REST Controller -> Repository -> JDBC -> MySQL

SETUP:
1. Install JDK 17+ and MySQL.
2. Open MySQL and run database.sql.
3. Open src/main/resources/application.properties.
4. Replace YOUR_MYSQL_PASSWORD with your MySQL password.
5. Open this project in VS Code/IntelliJ.
6. Run:
   mvn spring-boot:run
7. Open:
   http://localhost:8080

You can add and delete students from the frontend.
