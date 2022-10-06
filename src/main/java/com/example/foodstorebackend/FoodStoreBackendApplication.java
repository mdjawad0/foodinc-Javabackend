package com.example.foodstorebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class FoodStoreBackendApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.location", "application.properties");
		SpringApplication.run(FoodStoreBackendApplication.class, args);
	}

}
