package com.welcome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Welcome {
	
	
	@GetMapping("/welcome")
	public String welcomeCOntroller()
	{
		
		return "!!!!!!!!!!!!Welcome from Springboot!!!!!!!!!!!!!!!!";
		
	}
	
	@GetMapping("/hello")
	public String helloCOntroller()
	{
		
		return "!!!!!!!!!!!!Welcome from Springboot!!!!!!!!!!!!!!!!";
		
	}
}
