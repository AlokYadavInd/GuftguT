package com.example.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "<H1>I am running inside Docker ContsinerHello Sring Boot</H1>";
	}

}
