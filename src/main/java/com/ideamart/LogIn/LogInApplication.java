package com.ideamart.LogIn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "https://localhost:4200")
@SpringBootApplication
public class LogInApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogInApplication.class, args);
	}

}
