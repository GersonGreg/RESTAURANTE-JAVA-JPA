package com.desarrollo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.desarrollo.persistence.entity.PizzaEntity;
import com.desarrollo.persistence.repository.PizzaRepository;

@Service
public class PizzaService {

	//private final JdbcTemplate jdbcTemplate;
	
	 private final PizzaRepository pizzaRepository;
	 
	@Autowired
	public PizzaService (PizzaRepository pizzaRepository) {
		this.pizzaRepository = pizzaRepository;
	}
	
	public List<PizzaEntity> getAll(){
		
		//return this.jdbcTemplate.query("SELECT*FROM pizza", new BeanPropertyRowMapper<>(PizzaEntity.class));
		
		return this.pizzaRepository.findAll();
	}
	
	public PizzaEntity get(int idPizza) {
		return this.pizzaRepository.findById(idPizza).orElse(null);
	}
	
	// METODO PARA GUARDAR
	
	public PizzaEntity save(PizzaEntity pizza) {
		return this.pizzaRepository.save(pizza);
	}
	
	//METODO PARA SABER SI YA EXISTE
	public Boolean exists(int idPizza) {
		return this.pizzaRepository.existsById(idPizza);
	}
	
	//METODO PARA ELIMINAR
	public void delete(int idPizza) {
		this.pizzaRepository.deleteById(idPizza);
	}
	
}































