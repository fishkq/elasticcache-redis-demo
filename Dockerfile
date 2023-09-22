FROM maven:3.8.6-openjdk-8-slim

ADD . /usr/local/src

WORKDIR /usr/local/src

RUN mvn clean package -Dmaven.test.skip=true

EXPOSE 8000

ENTRYPOINT java -jar target/elasticcache-redis-demo-0.0.1-SNAPSHOT.jar
