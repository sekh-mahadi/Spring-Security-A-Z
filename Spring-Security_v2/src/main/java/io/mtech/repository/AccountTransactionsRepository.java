package io.mtech.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.mtech.model.AccountTransactions;
import io.mtech.model.Customer;

@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, Long> {
	List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(Customer customerId);
}
