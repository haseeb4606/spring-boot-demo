package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		System.out.println("I am testing my Application");
		
		SpringApplication.run(Application.class, args);
		
	}

}
