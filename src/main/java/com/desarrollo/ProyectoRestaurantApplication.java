package com.desarrollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ProyectoRestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRestaurantApplication.class, args);
	}

}
