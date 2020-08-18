FROM openjdk:8
EXPOSE 8080
ADD target/products-docker.jar products-docker.jar
ENTRYPOINT ["java","jar","/products-docker.jar"]
