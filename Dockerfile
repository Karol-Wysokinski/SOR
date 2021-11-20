FROM openjdk:11
COPY target/rms-0.0.1-SNAPSHOT.jar sor.jar
ENTRYPOINT ["java","-jar","sor.jar"]