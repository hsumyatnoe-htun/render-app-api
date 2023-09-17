package com.example.springboot.customer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
	private Long customerId;
	private String firstName;
	private String lastName;
	private String email;
	public Customer(long customerId, String firstName, String lastName, String email) {
		this.setCustomerId(customerId);
	    this.setFirstName(firstName);
	    this.setLastName(lastName);
	    this.setEmail(email);
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}