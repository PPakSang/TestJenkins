FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
VOLUME /tmp
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]
