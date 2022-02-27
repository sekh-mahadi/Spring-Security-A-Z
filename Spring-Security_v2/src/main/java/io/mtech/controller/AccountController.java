package io.mtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.mtech.model.Accounts;
import io.mtech.model.Customer;
import io.mtech.repository.AccountRepository;

@RestController
public class AccountController {
	@Autowired
	private AccountRepository accountRepository;

	@GetMapping("/myAccount")
	public Accounts getCardsDetails(@RequestBody Customer customer) {
		Accounts accounts = accountRepository.findByCustomerId(customer.getId());
		if (accounts != null) {
			return accounts;
		} else {
			return null;
		}
	}
}
