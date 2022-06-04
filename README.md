# Sesion 01 - bicicleta-server

## constantes
set BASE=C:\home\udemy
cd /d %BASE%\spring-cloud-config\s01-intro

## Para compilar el proyecto
cd /d %BASE%\spring-cloud-config\s01-intro\bicicleta-server

mvn clean package

dir .\target\*.jar

## Para ejecutar simple
java -jar ./target/bicicleta-server-0.0.1-SNAPSHOT.jar

## Para sobreescribir variables
SET DATABASE_NAME=my-db-name-env-UPPER
SET database.name=my-db-name-env-dot

java -Ddatabase.name=my-db-name-system-property -jar ./target/bicicleta-server-0.0.1-SNAPSHOT.jar --database.name=my-db-name-command-line

## Para construir imagen y contenedor docker

docker build -t spring-only/bicicleta-server .

docker run -d -p 8075:8080 --name bicicleta-server-container spring-only/bicicleta-server

## curl
curl -GET http://localhost:8075/bicicleta/

