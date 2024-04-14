FROM adoptopenjdk:11-jre-hotspot
VOLUME /tmp
ARG JAR_FILE

ENV DB_HOST=default
ENV DB_PORT=default
ENV DB_USER=default
ENV DB_PASS=default
ENV DB_NAME=default
ENV DB_TABLE=default

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
