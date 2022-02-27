package io.mtech.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.mtech.model.Loans;

public interface LoansRepository extends CrudRepository<Loans, Long> {
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
