package com.desarrollo.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.desarrollo.persistence.entity.PizzaEntity;

@Repository
public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {

}
