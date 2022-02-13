package io.mtech.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.mtech.model.Customer;
import java.lang.String;
import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>{
	List<Customer> findByEmail(String email);
}
