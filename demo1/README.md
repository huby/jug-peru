# Despliegue de un war en JBoos usando Jenkins

### Pre requisitos

* Java 8
* Docker
* Intellij Ultimate o Intellij CE

### Mysql 

0. Levantar un contenedor con la imagen de mysql

docker run --name mysql-jboss -p 3306:3306  --restart always -e MYSQL_ROOT_PASSWORD=root -d mysql:5.7.21 

### Usando Docker images

0. Construimos el war

`./gradlew build`

1. Creamos la imagen:

docker build --tag=wildfly-app .  

2. Levantamos el container

docker run -p 8080:8080 -it wildfly-app 

### Usando cli

0. Construimos el war

./gradlew build  

1. Levantamos el container

docker run -p 8080:8080 -p 9990:9990 -it wildfly-admin /opt/jboss/wildfly/bin/standalone.sh -bmanagement 0.0.0.0 

2. Descargamos y descomprimimos Wildfly

https://wildfly.org/downloads/

3. Ejecutamos el archivo deplyment.sh

./deployment.sh

### Instalando Jenkins usando Docker

1. Ejecutar la siguiente linea

docker run -u root --rm -d -p 8081:8080 -p 50000:50000 -v jenkins-data:/var/jenkins_home -v /var/run/docker.sock:/var/run/docker.sock jenkinsci/blueocean

2. Encontrar el password

docker container ls
docker logs 









 
