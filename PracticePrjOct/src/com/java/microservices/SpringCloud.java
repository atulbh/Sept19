package com.java.microservices;


public class SpringCloud {

	/*
	 * Configurations required in Spring cloud config server
	 */
	
	// Step1. create a local git repo 
	// Step2.  create a properties file with the name of service like service1.properties and put the properties here 
	// whatever you have defined in application.properties of service1.
	// Step3. provide the git uri in application.properties of spring-cloud-config-server 
	// ex. spring.cloud.config.server.git.uri=C:/MicroServices/git-localconfig-repo
	// Step4. use @EnableConfigServer in application boot class
	//cloud config server will run on port 8888
}
