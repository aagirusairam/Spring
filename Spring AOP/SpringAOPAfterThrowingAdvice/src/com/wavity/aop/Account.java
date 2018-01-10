package com.wavity.aop;

public class Account {

	private String firstname;
	private String lastname;
	
	public Account(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Account [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
