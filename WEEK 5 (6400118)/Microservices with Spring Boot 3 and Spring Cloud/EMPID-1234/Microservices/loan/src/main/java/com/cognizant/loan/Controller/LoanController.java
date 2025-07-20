package com.cognizant.loan.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {
	@GetMapping("/{number}")
	public Map<String, Object> GetLoan(@PathVariable String number) {
		Map<String, Object> response = new HashMap<>();
		response.put("number :", number);
		response.put("loan amount :", 100000);
		response.put("emi :", 5000);
		response.put("type :", "homeloan");
		response.put("tenure", 20);
		return response;

	}

}
