package com.cognizant.greet_service.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class GreetController {
	@GetMapping("/greet")
	public String SayHello() {
		return "Hello World!!!";
	}

}

