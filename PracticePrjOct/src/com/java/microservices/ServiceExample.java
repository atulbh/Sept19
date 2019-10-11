package com.java.microservices;

public class ServiceExample {

	// Step1. when we create a microservice we use @SpringBootApplication and if we need to read values from
	//properties file we define application name and then properties name like below.
	//spring.application.name=limits-service
	//limits-service.minimum=10
	//	limits-service.maximum=888

	//Step2. if we want to read the properties from cloud config server than we need to create a property file
	// in cloud config project like this. limits-service.properties
	//and we need to rename our application.properties to bootstrap.properties
	
	//Step3. in bootStrap properties we have to provide URL of cloud config server and set the profile like below.
	//spring.application.name=limits-service
	//spring.cloud.config.uri=http://localhost:8888
	//spring.profiles.active=dev

}
