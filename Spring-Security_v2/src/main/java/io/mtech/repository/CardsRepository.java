package io.mtech.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.mtech.model.Cards;

public interface CardsRepository extends CrudRepository<Cards, Long>{
	List<Cards> findByCustomerId(int customerId);
}
