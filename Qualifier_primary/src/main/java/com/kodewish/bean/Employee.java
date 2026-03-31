package com.kodewish.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("acc1")
public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
	}

	public String getFirstName() {
		return firstName;
	}

	

	public String getLastName() {
		return lastName;
	}
	

	
	
	

}
