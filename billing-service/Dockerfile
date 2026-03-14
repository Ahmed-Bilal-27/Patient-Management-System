FROM maven:3.9.12-eclipse-temurin-25 AS builder

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn clean package -DskipTests

FROM amazoncorretto:25-jdk AS runner

WORKDIR /app

COPY --from=builder ./app/target/billing-service-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 6000
EXPOSE 6001

ENTRYPOINT ["java", "-jar", "app.jar"]
