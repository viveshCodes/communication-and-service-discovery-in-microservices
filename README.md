# spring-microservices-communication-discovery
Communication and discovery of microservices using Spring Boot.

## Project Description
The goal of the project is to understand communication and discovery of microservices using Spring Boot. Three microservices (refer Microservices below) will be created to achieve the goal. 


## Microservices
- Movie Catalog Service (folder: movie-catalog-service)
    - Input: User Id
    - Output: Details and ratings of movies rated by user

This is the microservice which will be consumed by client. This microservice will communicate with rating-data-service and movie-info-service.
- Rating Data Service (folder: rating-data-service)
    - Input: User Id
    - Output: Movie Id & Ratings of movies rated by user
- Movie Info Service (folder: movie-info-service)
    - Input: Movie Id
    - Output: Movie details

## Eureka Server
    Folder to look: eureka-server
     
## Technology Used:
- Java
- Spring Boot
- Spring Eureka

## Improvement
The project only focuses on communication and service discovery in microservice. It has not taken fault tolerance and resilience in microservices into consideration. The repo [fault-tolerance-and resilience-in-microservices](https://github.com/viveshCodes/fault-tolerance-and-reselience-in-microservices) handles these important aspects.
