package com.jacksawyer.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//1. Importing dependencies 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
	
	@RequestMapping("/")
    // 2. Method that maps to the request route above 
        public String hello() { 
    // 3.   
		return "Hello World!";
     }
	
	@RequestMapping("/cruel")
		public String cruel() {
		return "Hello Cruel World!";
	}
}
