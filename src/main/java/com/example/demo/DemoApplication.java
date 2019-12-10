package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication
{
	@GetMapping("/")
	public String welcome()
	{
		return "Welcome to example Container";
	}
	
	@GetMapping("/{id}")
	public String getUserInfo(@PathVariable String id)
	{
		return "Retrieving info for user: " + id;
	}
	
	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

}
