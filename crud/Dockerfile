FROM openjdk:21-jdk-slim
COPY "./target/crud-0.0.1-SNAPSHOT.jar" "crud.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "crud.jar"]