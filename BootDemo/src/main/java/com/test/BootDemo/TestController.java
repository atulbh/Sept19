package com.test.BootDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/")
	public String sayHi(){
		return "hello thr! hi thr!!  ";
	}
	
	@GetMapping("/hello")
	public String sayHello(){
		return "hello thr! this is new";
	}
}
