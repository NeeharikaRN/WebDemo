package com.example.WebDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebDemoController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
