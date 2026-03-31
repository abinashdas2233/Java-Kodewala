package com.kodewish.bean;

import org.springframework.stereotype.Component;


public class Customer {
	String name;
	Adreess address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adreess getAddress() {
		return address;
	}
	public void setAddress(Adreess address) {
		this.address = address;
	}
	
	public Customer(String name, Adreess address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	

}
