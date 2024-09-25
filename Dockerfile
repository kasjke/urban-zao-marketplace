FROM maven:3.8.4-openjdk-17 AS builder
ENV DOCKER_BUILDKIT=1
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN --mount=type=cache,target=/root/.m2 mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app
COPY --from=builder /app/target/market-0.0.1-SNAPSHOT.jar ./market-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "market-0.0.1-SNAPSHOT.jar"]
