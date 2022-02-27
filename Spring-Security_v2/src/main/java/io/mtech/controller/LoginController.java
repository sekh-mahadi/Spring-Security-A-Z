package io.mtech.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.mtech.model.Customer;
import io.mtech.repository.CustomerRepository;

@RestController
public class LoginController {
	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping("/user")
	public Customer getUserDetailsAfterLogin(Principal user) {
		List<Customer> customers = customerRepository.findByEmail(user.getName());
		if (customers.size() > 0) {
			return customers.get(0);
		} else {
			return null;
		}
	}
}
