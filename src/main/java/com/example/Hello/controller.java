package com.example.Hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Value("${server.port}")
	private String valueFromFile;
	@GetMapping("/hello")
	public String hello()
	{
		System.out.printf("Port"+valueFromFile);
		return "<H1>I am running inside Docker Contsiner Hello Sring Boot</H1>";
	}

}