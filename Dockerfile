FROM openjdk:20
ARG JAR_FILE=target/*.jar
COPY ./target/to-do-app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]