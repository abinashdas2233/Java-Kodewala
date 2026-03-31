package com.kodewish.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Account {
	@Value("abinashdas")
	private String name;
	@Autowired
	private SavingAccount account;
	public String getName() {
		return name;
	}

	public SavingAccount getAccount() {
		return account;
	}
	
	
	
}
