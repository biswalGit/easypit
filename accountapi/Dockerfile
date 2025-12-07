FROM mcr.microsoft.com/openjdk/jdk:21-azurelinux
COPY target/accountapi-0.0.1-SNAPSHOT.jar accountapi.jar
ENTRYPOINT ["java", "-jar", "accountapi.jar"]