FROM openjdk:11-slim
COPY /target/*.jar app.jar
EXPOSE 8080
LABEL com.example.description='Just a small spring boot demo project'
LABEL com.example.release-date='May 14, 2021'
LABEL com.example.maintainer='NT IPA'
RUN echo "Howdy, this is GK's demo project"
ENTRYPOINT ["java" , "-jar", "app.jar"]
