package com.springpractice.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class User {
	@Value("abinash")
	private String firstName;
	@Value("das")
	private String lastName;
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
