package com.cognizant.spring_learns.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String SayHello() {
		return "Hello World!!";
	
	}

}
