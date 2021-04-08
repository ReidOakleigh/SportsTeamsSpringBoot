package edu.dmacc.sportsteams.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hellp")
	public String hello() {
		return "Hello Spring Boot";
	}

}
