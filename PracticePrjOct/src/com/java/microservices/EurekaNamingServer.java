package com.java.microservices;

public class EurekaNamingServer {

	//Step 1. add dependency of Eureka Server
	//Step 2. add @EnableEurekaServer in application class
	//Step 3. application properties
	/*spring.application.name=netflix-eureka-naming-server
	server.port=8761
			eureka.client.register-with-eureka=false
			eureka.client.fetch-registry=false*/
	
	// now we can up the naming server, it will show in built UI
	
	
	//Add a service in Naming server
	//Step 1. add dependency to service 
	//Step 2. @EnableDiscoveryClient add this to application class
}
