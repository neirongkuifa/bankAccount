FROM openjdk:8-jdk-alpine

WORKDIR /home/bankAccount

COPY ./target/bankaccount-0.0.1-SNAPSHOT.jar ./

CMD ["java","-jar","bankaccount-0.0.1-SNAPSHOT.jar"]

EXPOSE 7890