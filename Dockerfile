FROM alpine:latest as build

RUN apk update
RUN apk add openjdk21

COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

FROM openjdk:21-alpine
EXPOSE 8080
COPY --from=build ./build/libs/com.environment-0.0.1-SNAPSHOT.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]