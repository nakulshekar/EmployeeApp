FROM openjdk:11
EXPOSE 9191
ADD target/EmployeeApp-spring.jar EmployeeApp-spring.jar
ENTRYPOINT ["java" ,"-jar","EmployeeApp-spring.jar"]