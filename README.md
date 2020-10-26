[![Build Status](https://travis-ci.org/Apokarseznam/AutoApp.svg?branch=master)](https://travis-ci.org/Apokarseznam/AutoApp)

# AutoApp

This is a Spring Boot Java app which connects to a MySQL database running inside a Docker container.

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

The Database
* Port: 3307 
* Username: root 
* Password: root 

The app defines following CRUD APIs.

| Method | Url |
| --- | --- |
| GET | /api/autos	 |
| GET | /api/autos/	{autoId} |
| POST | /api/autos |
| PUT | /api/autos/{autoId} |
| DELETE | /api/autos/{autoId} |


