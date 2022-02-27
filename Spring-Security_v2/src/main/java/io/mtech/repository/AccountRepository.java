package io.mtech.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.mtech.model.Accounts;
@Repository
public interface AccountRepository extends CrudRepository<Accounts, Long> {
	public Accounts findByCustomerId(int customerId);
}
