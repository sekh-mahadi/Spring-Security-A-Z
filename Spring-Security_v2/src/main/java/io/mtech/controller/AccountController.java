package io.mtech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AccountController {
	
	@GetMapping("/myAccount")
	public String getCardsDetails() {
		return "Here are the Account Details from the DB";
	}
}
