# AutoApp

This is a Spring Boot Java app which connects to a MySQL instance running inside a Docker container.

### Technologies used:
* Maven 
* Spring Boot
* MySQL
* Hibernate 
* Bootstrap 
* Docker 
* Docker compose 

### To get the code:
```shell
$ git clone https://github.com/Apokarseznam/AutoApp.git
```
### Running the app with Docker:
Just need to execute:

```shell
docker-compose up
```
You can then access app here: http://localhost:8088/list

The app defines following CRUD APIs.

| Command | Description |
| --- | --- |
| git status | List all new or modified files |
| git diff | Show file differences that haven't been staged |


