package com.example.demo;

public class Customer {

	private long id;
	private String firstname, lastname;
	public Customer(long id, String firstname, String lastname) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	
}
