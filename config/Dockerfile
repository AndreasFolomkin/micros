FROM alpine:3.13

RUN apk add openjdk11
COPY ../cat-app-graele/build/libs/cat-app-graele.jar /app.jar

ENTRYPOINT ["java","-jar","app.jar"]