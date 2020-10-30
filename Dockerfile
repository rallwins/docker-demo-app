FROM java:8

EXPOSE 8181

ADD target/docker-demo.jar docker-demo.jar

ENTRYPOINT ["java", "-jar", "docker-demo.jar"]