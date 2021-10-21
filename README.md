# Taxi Service

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Technologies](#technologies)
- [Setup](#setup)

## Description
Taxi Service is a simple web application for taxi drivers that 
shows information about drivers and their cars. This project was built with JDBC and Java Servlet API 
to better understanding what's in popular frameworks going on under the hood.

## Features
- Registration and authentication of a driver
- Adding new driver, manufacturer and car
- Display information about drivers, manufacturers and cars 
(with the ability to delete each of them)
- Adding a driver to a car
- Logging of authentication attempts

## Technologies
- Java (JDK version 11)
- JDBC
- Java Servlet API (version 4.0.1)
- JSP 
- JSTL (version 1.2)
- MySQL (version 8.0.22)
- Tomcat (version 9.0.54), to run application locally

## Setup
1. Download and install MySQL.
2. Download and install Tomcat (version 9.0.54).
3. Fork this project and clone it to your Java IDE.
4. Use `init_db.sql` file in `src/main/resources` folder 
to create schema (download MySQL Workbench if you need).
5. Add your information in `ConnectionUtil.java` file in `src/main/java/mate/util` folder. 

```
    private static final String URL = "YOUR DATABASE URL";
    private static final String USERNAME = "YOUR USERNAME";
    private static final String PASSWORD = "YOUR PASSWORD";
    private static final String JDBC_DRIVER = "YOUR DRIVER";
```

Username and password is data which you used to connect to MySQL Server (in Workbench, Database tool in IDE etc.).
Example of URL: `jdbc:mysql://localhost:3306/taxi?serverTimezone=UTC`. 
Example of Driver: `com.mysql.cj.jdbc.Driver`. 
 
6. Change `fileName` in `log4j2.xml` file in `src/main/resources` folder to your absolute path to this project.

```
<File name="LogToFile" fileName="C:/Users/Admin/IdeaProjects/taxi-service/logs/app.log">
```

Or you can change it to `logs/app.log` and logging info will store in Tomcat folder `/apache-tomcat-9../bin/logs` (if it has access).

7. Run this app with Tomcat local server.
8. You will be redirected to login page. Click on `Create new Driver` and register new driver. Then you need to authenticate, as well.
