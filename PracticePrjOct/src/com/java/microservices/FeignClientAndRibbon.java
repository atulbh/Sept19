package com.java.microservices;

public class FeignClientAndRibbon {

	//How do we create client without feign using RestTemplate with below piece of code.
	/*Map<String, String> uriVariables = new HashMap<>();
	uriVariables.put("from", from);
	uriVariables.put("to",to);
	
	ResponseEntity<CurrencyConversionBean> response = 
	new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,uriVariables);
	
	CurrencyConversionBean bean = response.getBody();*/
	
	//How to create Feign client 
	//Step1 . add feign dependency
	//Step 2. Enable feign : @EnableFeignClients("com.in28minutes.microservices.currencyconversionservice")
	//Step 3. Create a new interface with annotation @FeignClient
	//example : @FeignClient(name="currency-exchange-service",url="localhost:8000")
	//Step 4 : now we need to write a method declaration in interface same as the service we want
	//to invoke, the only change is we need to write return type bean as defined in caller service.
	//Step 5 : use @Autowired for injecting Proxy bean and call.
	
	//How to use Ribbon load balancer
	//Step 1 : add dependency
	//Step 2: use @RibbonClient with @FeignClient in Proxy interface, when we are using Ribbon we need
	// need not to provide port as we can refer to any port.
	//Step 3: add list of servers in application.properties of caller service.
}
