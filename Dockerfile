FROM  openjdk:17-jdk-alpine
ENV APP_NAME JavaRds
COPY ./target/${APP_NAME}.jar  /app/${APP_NAME}.jar	
WORKDIR /app	
CMD java -jar ${APP_NAME}.jar	
#CMD ["java", "-jar", "JavaRds-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
