package com.cognizant.account.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Accounts")
public class AccountController {
	@GetMapping("/{number}")
	public Map<String, Object> GetName(@PathVariable String number) {
		Map<String, Object> response = new HashMap<>();
		response.put("number", number);
		response.put("type", "savings");
		response.put("balance", 234343);
		return response;
	}
}
