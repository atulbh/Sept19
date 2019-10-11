package com.java.microservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.microservices.currencyexchangeservice.ExchangeValue;

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
	
	//Step4. Adding JPA, to add JPA, it must have included Spring JPA and H2 db dependency.
	//Convert your bean into Entity
	//create a data.sql file to insert some records, just write some insert queries and put file in 
	//resources, when spring boots up that will be executed and records will be insterted in H2 DB
	//that we can check in localhost:port/he-console
	//write the JPA interface like ExchangeValueRepo extends JpaRepository<ExchangeValue, Long>
	//write a method signature in this interface and JPA will provide implementation for the same it 
	//Spring boot JPA magic
	

}
