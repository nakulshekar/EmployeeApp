FROM openjdk:11
EXPOSE 9191
ADD target/employee-app-spring.jar employee-app-spring.jar
ENTRYPOINT ["java" ,"-jar","employee-app-spring.jar"]
