#create a package first
#mvn package -Dmaven.test.skip
#Eexecute application
#project_directory:> java -jar target/eurekaserver-0.0.1-SNAPSHOT.jar

# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/eurekaserver-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/sa-discovery.jar
COPY ${JAR_FILE} sa-discovery.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","sa-discovery.jar"]

EXPOSE 8761

# Make docker file
# docker build -t sa-discovery:tag_name .

#Docker command for dockerhub
#docker build -t faizulnoor/sa-discovery .

#run docker file
#docker run -d -p 8761:8761 -t sa-discovery
