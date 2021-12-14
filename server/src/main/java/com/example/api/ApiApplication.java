package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ApiApplication {

	private Logger logger = LogManager.getLogger("com.example.api.ApiApplication");

	@GetMapping
	public String home() {
		logger.info("Hello World");
		return "Hello World";
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String log4jTest(@RequestBody String str) {
		logger.info(str);
		return str;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
