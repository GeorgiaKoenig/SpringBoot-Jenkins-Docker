FROM openjdk:11-slim
COPY /target/*.jar app.jar
EXPOSE 8080
LABEL com.example.description='Just a small spring boot demo project' com.example.release-date='May 14, 2021' com.example.maintainer='NT IPA'
RUN echo 'Howdy, this is GKs demo project'
ENTRYPOINT ["java" , "-jar", "app.jar"]
