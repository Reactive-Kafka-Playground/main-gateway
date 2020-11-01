FROM adoptopenjdk/openjdk11:ubi
RUN mkdir /opt/app
ARG JAR_FILE=build/libs/main-gateway-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /opt/app/app.jar
CMD ["java", "-jar", "/opt/app/app.jar"]