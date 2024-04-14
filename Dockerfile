FROM openjdk:11
WORKDIR /app
COPY target/films-0.0.1-SNAPSHOT.jar /app/films-0.0.1-SNAPSHOT.jar
EXPOSE 9090
CMD ["java","-jar","films-0.0.1-SNAPSHOT.jar"]