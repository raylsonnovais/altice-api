FROM openjdk:17-oracle

ARG JAR_FILE=target/altice-api-1.0.jar

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 80