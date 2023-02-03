FROM openjdk:11
COPY target/ap-0.0.1-SNAPSHOT.jar ap.jar
ENTRYPOINT ["java", "-jar","ap.jar"]