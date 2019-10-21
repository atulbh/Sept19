package com.java.microservices;

public class MicroServicesDependencies {

	/*
	 * This doc has info about microservices dependecies and used annotations, component by component.
	 */
	
	/*
	 * Limits-service
	 */
	//Actuator 
	//Spring Boot Web
	//Devtools 
	//Config Client
	
	//@Component
	//@ConfigurationProperties("limits-service")
	
	//Notes : when we use cloud config to read properties, we use bootstrap.properties, instead 
	//application.properties
	//and below property to connect to spring cloud config
	//spring.profiles.active=dev
	//spring.cloud.config.uri=http://localhost:8888
	//about setting profile, everytime you need not to set/change in bootstrap properties,
	//you can set in VM Arguments or JAVA arguments
	
	/*
	 * Spring Cloud Config Server
	 */
	//Config Server
	//Devtools
	//@EnableConfigServer
	//spring.cloud.config.server.git.uri
	
	
	/*
	 * Currency-Exchange-Service
	 */
	//
	
}
