FROM openjdk:8-jre-alpine
COPY target/*.jar flyservice.jar
EXPOSE 8080

CMD ["java","-jar","flyservice.jar"]