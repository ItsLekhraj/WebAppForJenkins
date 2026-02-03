package com.example.smallwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmallWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmallWebAppApplication.class, args);
		
		System.out.println("Hello Mr Sharma");
	}

}
