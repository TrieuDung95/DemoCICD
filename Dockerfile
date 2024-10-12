FROM openjdk:17
ADD target/demoSpring-0.0.1-SNAPSHOT.jar app1.jar
ENTRYPOINT [ "java", "-jar","app1.jar" ]