package io.mtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.mtech.model.Customer;
import io.mtech.model.Loans;
import io.mtech.repository.LoansRepository;

@RestController
public class LoansController {

	@Autowired
	private LoansRepository loansRepository;

	@PostMapping("/myLoans")
	public List<Loans> getLoanDetails(@RequestBody Customer customer) {
		List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDtDesc(customer);
		if (loans != null) {
			return loans;
		} else {
			return null;
		}
	}
}
