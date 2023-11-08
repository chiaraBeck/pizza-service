FROM maven:3.8.3-openjdk-17

# Copy the JAR file into the image
COPY target/*.jar /pizza-service
EXPOSE 8080
ADD target/pizza-service.jar pizza-service.jar
ENTRYPOINT ["java", "-jar", "pizza-service.jar"]

