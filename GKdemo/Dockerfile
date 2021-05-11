FROM openjdk:11-slim
COPY /target/*.jar app.jar
EXPOSE 8080
RUN echo 'Howdy, this is GK's demo project'
ENTRYPOINT ["java" , "-jar", "app.jar"]
