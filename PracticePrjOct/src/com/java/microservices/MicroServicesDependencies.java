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
	//Web, Devtools, Actuator, Config-Client, spring data jpa, h2
	//use  Environment env; from spring core, to get server.port from file.
	//basiclly it can read all the properties.
	//properties to add in application.properties 
	//spring.jpa.show-sql=true
	//spring.h2.console.enabled=true
	//write a data.sql to put data in h2 db
	//write a JPARepo to read data from h2 db. need to write an interface which will extedns 
	//JPARepository.
	
	//Using Naming server:- just like Currency conversion service we can do same here 
	
	
	/*
	 * Currecy-Conversion-Service
	 */
	//Web, Devtools, Actuator, Config-Client, open-feign
	//Call Currency-Exchange-Service from this service
	//1. Using RestTemplate, like below.
	/*HashMap<String, String> map = new HashMap<>();
	map.put("from", from);
	map.put("to", to);
	
	ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,map);
	CurrencyConversionBean resBody = responseEntity.getBody();
	*/
	//Call new RestTemplate.getForEntity method and pass URL of desired service, required bean type and params map.
	
	//2. Using Feign 
	//add dependency
	//@EnableFeignClients("package-name")
	//create serviceProxy interface and use in controller, in that interface we need to provide the declaration of service we want to call
	//@FeignClient(name="currency-exchange-service",url="localhost:8000")
	//@FeignClient(name="called service name",url="called service url for port"), url = called service url for port, later when we use Ribbon LB we won't use port url 
	//as ribbon will call the instance
	
	//3. How to use Ribbon with Feign
	// use annotation @RibbonClient(name="currency-exchange-service") in serviceProxy interface, where name = called service name
	// use this property in application.properties
	//currency-exchange-service.ribbon.listOfServers=http://localhost:8000, http://localhost:8001
	
	//TroubleShooting Guide 
	//https://github.com/in28minutes/in28minutes-initiatives/tree/master/The-in28Minutes-TroubleshootingGuide-And-FAQ#debugging-problems-with-feign-and-ribbon
	
	//4. Naming Server :- like in last LB example we configured listOf Servers in Currecy Conversion Service, when we want to add one more instance if load goes up,
	//we need to change the service confuguration again and again which is not so good, and here nameing server cocmes into picture.
	// We will create a Naming server with Eureka and all services will register with this when they come up.
	//when an instance comes up and register itself with Eureka Naming server :- this is called service registry.
	//when an service wants to talk to another service it asks Eureka which instance is available to talk :- this is called service discovery 
	
	//5. Once NetFlix Eureka Naming Server setup is done add Eureka client dependency in this service 
	//Then add @EnableDiscoveryClient in application class 
	// Add Eureka url in applcation.properties :- eureka.client.service-url.default-zone= http://localhost:8761/eureka
	//Once naming server is done we cann comment this property listof servers #currency-exchange-service.ribbon.listOfServers=http://localhost:8000, http://localhost:8001
	
	
	//6. //now once zuul api gateway server is setup, we go back to currency conversion to setup zuul there, till now 
	//we are using feignClient to call currency exchange service to make rest client
	//now instead callign currency exchange service directly from feign client we will call
	//zuul api gatway

	
	/*
	 * NetFlix Eureka Naming Server setup
	 */
	//dependecies : Eureka Server, Config client, Spring Boot Actuator, Devtools
	//add properties
	//server.port = 8761
	//eureka.client.register-with-eureka=false
		//	eureka.client.fetch-registry=false
	//Annotation user with application class : @EnableEurekaServer
	
	/* Ques 1. How can an application be both a Eureka Instance and a Eureka Client?

	Applications often need to make themselves available for use by others (so they are an instance) while at the same time they need to discover other services 
	(so they are a client).

	Ques 2. Does a Eureka Client have to be a Eureka Instance?

	No. Sometimes an application has nothing to offer and is only a caller of other services. Via configuration 
	(eureka.client.register-with-eureka=false), you can tell it not to register itself as an instance. It is therefore only a Eureka Client as it only discovers other services.
	
	*/
	
	/*
	 * Netflix-zuul-api-gateway-server
	 */
	//dependencies : zuul, eureka discovery, Actuator, devtools
	//netflix-zuul-api-gateway-server
	//spring.application.name=netflix-zuul-api-gateway-server
	//server.port=8765
		//	eureka.client.service-url.default-zone= http://localhost:8761/eureka

/*@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient*/
	
	//here we write our class and extends zuulFilter 
	//most imp method is run, we print logs with current request in this method.
	//code : HttpServletRequest req = RequestContext.getCurrentContext().getRequest();
	/*logger.info("request -> {} request-> {}", req, req.getRequestURI());
	return null;*/
	
	//normally any service like currecy exchange service runs like this : http://localhost:8000/currency-exchange/from/USD/to/INR
	// through zuul it runs like this 
	//http://localhost:8765/{application-name}/{application-uri}
	//now once this is setup, we go back to currency conversion to setup zuul there, till now 
	//we are using feignClient to call currency exchange service to make rest client
	//now instead callign currency exchange service directly from feign client we will call
	//zuul api gatway

}
