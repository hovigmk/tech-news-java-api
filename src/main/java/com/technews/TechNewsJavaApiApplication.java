package com.technews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TechNewsJavaApiApplication {
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Tech News! The Java version. ";
	}

	public static void main(String[] args) {
		SpringApplication.run(TechNewsJavaApiApplication.class, args);
	}

}