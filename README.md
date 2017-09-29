<<<<<<< HEAD
# SpringSecurityUserDetailsService

Similiar project than https://github.com/gustavoponce7/SpringSecurityLoginTutorial but this code implements the UserDetailsService as authentication strategy.

1. mvn clean
2. mvn clean install
3. Go to the target folder
4. java -jar demo-0.0.1-SNAPSHOT.ja

- http://localhost:8080/registration
- http://localhost:8080/login
=======
# Sample To Do List web application using Spring Boot and MySQL

A simple Todo list application using Spring Boot with the following options:

- Spring JPA and MySQL for data persistence
- Thymeleaf templae for the rendering.

To build and run the sample from a fresh clone of this repo:

## Configure MySQL

1. Create a database in your MySQL instance.
2. Update the application.properties file in the `src/main/resources` folder with the URL, username and password for your MySQL instance. The table schema for the Todo objects will be created for you in the database.


## Build and run the sample

1. `mvnw package`
3. `java -jar target/TodoDemo-0.0.1-SNAPSHOT.jar`
3. Open a web browser to http://localhost:8080

As you add and update tasks in the app you can verify the changes in the database through the MySQL console using simple statements like 
`select * from todo_item`.
>>>>>>> 9e40a90806fa1a33eefa36f745a788ebf1fd0a19
