FROM openjdk:11-jre-slim
RUN mkdir /app
COPY build/libs/squarepeg-0.0.1-SNAPSHOT.jar /app/spring-boot-application.jar
ENTRYPOINT ["java","-jar","/app/spring-boot-application.jar"]
EXPOSE 8080