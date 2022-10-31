# spring-boot-logs-api

A simple example of log handling in spring boot 📚

## Spring initializr
Basic configuration

<img width="1522" alt="Captura de Pantalla 2022-09-30 a la(s) 3 18 51 p m" src="https://user-images.githubusercontent.com/24255842/193350009-46ddc952-f341-4348-b4db-f2852286a96f.png">

## Instal dependencies
    mvn install

## Install postgis
    https://postgis.net/install/

## Run the project
    mvn spring-boot:run

## Run with docker
1. Compile and create docker image

       mvn compile jib:dockerBuild

2. Docker compose

       docker compose up

3. Or run the container

       docker run -it --rm -p 8036:8036 spring-boot-logs-api:1.0.0

## Create a docker image for kubernetes
1.     docker run -it --rm wondercode/composerize-plus:1.2.1 docker run -it --rm -p 8036:8036 spring-boot-logs-api:1.0.0 > docker-compose.yml

2.     kompose convert

## Export docker image in a tar
    docker save spring-boot-logs-api:1.0.0 > spring-boot-logs-api:1.0.0.tar

## More info about

### Logging
https://www.baeldung.com/spring-boot-logging

### Log Rolling File
https://www.baeldung.com/java-logging-rolling-file-appenders

### JIB
https://www.baeldung.com/jib-dockerizing

# Autor
https://github.com/Julianhm9612
