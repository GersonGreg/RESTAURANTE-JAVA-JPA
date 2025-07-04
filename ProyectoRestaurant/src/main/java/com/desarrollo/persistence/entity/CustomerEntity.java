package com.desarrollo.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@Getter
@Setter
@NoArgsConstructor
public class CustomerEntity {
	
	@Id
	@Column(name="id_customer",length = 15)
	private Integer idCustomer;
	
	@Column(nullable = false,length = 60)
	private String name;
	
	@Column(length = 100)
	private String address;
	
	@Column(nullable = false,length = 50,unique = true)
	private String email;
	
	@Column(name="phone_number",length = 20)
	private String phone;


}

















































