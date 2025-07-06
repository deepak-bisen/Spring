package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		System.out.println("started springboot application");
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("execution completed of springboot application");
	}

}
