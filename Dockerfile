FROM openjdk:17-jdk-slim
MAINTAINER zunzun
COPY target/demoSpring-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]