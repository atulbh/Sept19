package com.java.microservices;

public class MicroServices {

	/*
	 * Challenges of microservices 
	 */
	//Boundry of MicroServices : Define bounded context
	//deciding the boundaries between microservices is evolutionary process, it is not something which will be correct at first time,
	//as you don't have complete business knowledge
	//Follow the DDD start the work as you perfrom this you will keep gaining knowledge, the important thing is you need to put back your knowledge 
	//in the microservices system
	
	//Configuration managment -> Spring cloud config server
	
	//Dynamic Scale-up and Scale-down
	
	//Visibility : if some particular microservice is down or an instance is down, how will you know it.. the centralized logging 
	
	//Pack of Cards : if microservices are not well designed then its a pack of cards, mean one goes down entire application goers down,
	// so we need fault tolerance for this 
	
	
	//Example : suppose CurrencyCalculationService wants to establish connection with CurrencyExchange service, it will ask Eureka naming server 
	//and Eureka naming server will tell how many instances are there available of CurrencyExchange server(with details), if there are more than 1
	// Ribbon load balancer will send request to one of them, so CurrencyCalculation Service will host the Ribbon.
	
	
	//Ribbon :- Client side load balancer
	//Eureka :- All the instances of all microservices are registered with naming server Eureka
	//Feign :- easy REST Clients
	//Spring Cloud Sleuth:- for tracing purpose, it generates id using which we can follow the request flow across the instances.
	//Zipkin Distributed tracing :- we would use zipkin server to trace a req across instances, may be it will use Sleuth id.
	//Netflix Zuul API : there are many features common in all microservices like logging, security, analytics etc, and we can't implement all 
	//in all services, API gateway is solution for this.
	
	//Hystrix :- Fault Tolerance 
	
	/*
	 * 
	 * Advantages of microservices
	 */
	// Easy adoption of new technologies
	//Dynamic Scaling
	//Faster release cycle
	
	
	/*Make your microservices cloud ready with Spring Cloud

	we will learn

	Establishing Communication between Microservices
	Centralized Microservice Configuration with Spring Cloud Config Server
	Using Spring Cloud Bus to exchange messages about Configuration updates
	Simplify communication with other Microservices using Feign REST Client
	Implement client side load balancing with Ribbon
	Implement dynamic scaling using Eureka Naming Server and Ribbon
	Implement API Gateway with Zuul
	Implement Distributed tracing with Spring Cloud Sleuth and Zipkin
	Implement Fault Tolerance with Zipkin
	*/
	
	/*Ports
	Application	Port
	Limits Service	8080, 8081, ...
	Spring Cloud Config Server	8888
	Currency Exchange Service	8000, 8001, 8002, ..
	Currency Conversion Service	8100, 8101, 8102, ...
	Netflix Eureka Naming Server	8761
	Netflix Zuul API Gateway Server	8765
	Zipkin Distributed Tracing Server	9411
	*/

}
