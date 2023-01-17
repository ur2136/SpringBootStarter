FROM openjdk:17
ADD target/starter-api-docker.jar starter-api-docker.jar
ENTRYPOINT ["java", "-jar","starter-api-docker.jar"]
EXPOSE 8080