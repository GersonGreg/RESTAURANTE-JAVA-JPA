package com.desarrollo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desarrollo.persistence.entity.PizzaEntity;
import com.desarrollo.service.PizzaService;

@RestController
@RequestMapping("/api/pizza")
public class PizzaController {

	private final PizzaService pizzaService;
	
	@Autowired
	public PizzaController (PizzaService pizzaService) {
		this.pizzaService = pizzaService;
	}
	
	@GetMapping
	public ResponseEntity<List<PizzaEntity>> getAll(){
		return ResponseEntity.ok(this.pizzaService.getAll());
	}
}
