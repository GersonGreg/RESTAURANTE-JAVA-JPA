package com.desarrollo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/{idPizza}")
	public ResponseEntity<PizzaEntity> get(@PathVariable("idPizza") int idPizza){
		return ResponseEntity.ok(this.pizzaService.get(idPizza));
	}
	// METODO PARA GUARDAR
	
	@PostMapping
	public ResponseEntity<PizzaEntity> add(@RequestBody PizzaEntity pizza){
		if(pizza.getIdPizza() == null || this.pizzaService.exists(pizza.getIdPizza())) {
			return ResponseEntity.ok(this.pizzaService.save(pizza));
		}
		return ResponseEntity.badRequest().build();
	}
	
	// METODO PARA ACTUALIZAR
	@PutMapping
	public ResponseEntity<PizzaEntity> update(@RequestBody PizzaEntity pizza){
		if(pizza.getIdPizza() != null && this.pizzaService.exists(pizza.getIdPizza())) {
			return ResponseEntity.ok(this.pizzaService.save(pizza));
		}
		
		return ResponseEntity.badRequest().build();
	}
	
	// ENDPOINT PARA ELIMINAR 
	@DeleteMapping("/{idPizza}")
	public ResponseEntity<Void> delete(@PathVariable("idPizza") int idPizza){
		if(this.pizzaService.exists(idPizza)) {
			this.pizzaService.delete(idPizza);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.badRequest().build();
	}
}




































