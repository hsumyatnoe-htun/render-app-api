package com.example.springboot.customer;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
	private static final List<Customer> CUSTOMERS=Arrays.asList(
			new Customer(1L,"john","doe","john@javawhizz.com"),
			new Customer(2L,"mary","public","mary@javawhizz.com"),
			new Customer(3L,"elon","musk","elon@javawhizz.com"),
			new Customer(4L,"danny","dancan","danny@javawhizz.com")
	);
	
	@GetMapping
	
	public List<Customer> findAllCustomers(){
		return CUSTOMERS;
	}

}
