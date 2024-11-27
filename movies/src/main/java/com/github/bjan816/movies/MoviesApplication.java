package com.github.bjan816.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// annotations are used to let the compiler know about what the class does
@RestController
// lets the framework know that this class is a REST API controller and not just a class
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/root")
	// lets the framework know that this method is a get endpoint
	public String apiRoot() {
		return "Hello World!";
	}

}
