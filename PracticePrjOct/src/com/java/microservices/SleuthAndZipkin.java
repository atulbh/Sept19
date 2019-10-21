package com.java.microservices;

public class SleuthAndZipkin {

	//Spring Sleuth adds a unique id to a request 
	// add dependency 
//	<dependency>
//	<groupId>org.springframework.cloud</groupId>
//	<artifactId>spring-cloud-starter-sleuth</artifactId>
//</dependency>
	
	//add above dependency in netflix-zuul api server, currency-conversion and currecny-exchange 
	//basically whatever services u want to follow, need to add dependency in all of them
	//zuul api gateway is must, as all req are going throug it.
	
	//Now if we want to collect all logs at one place we need to use Zipkin
	//solutions for centralized logging 
	//e.g. ELK Stash(Elastic Stack), LogStash and Kibana
}
