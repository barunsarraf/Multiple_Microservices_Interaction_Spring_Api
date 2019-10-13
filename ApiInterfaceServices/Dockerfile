FROM openjdk:11
WORKDIR usr/src
ADD ./target/ApiInterfaceServices-0.0.1-SNAPSHOT.jar /usr/src/Api.jar
ENTRYPOINT ["java","-jar","/usr/src/Api.jar"]
