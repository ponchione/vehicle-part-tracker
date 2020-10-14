FROM openjdk:14-jdk-alpine
ARG JAR=build/libs/tracker.0.0.1-SNAPSHOT.jar
COPY ${JAR} tracker.jar
ENTRYPOINT ["java", "-jar", "/tracker.jar"]