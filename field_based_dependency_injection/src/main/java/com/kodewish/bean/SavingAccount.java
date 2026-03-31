package com.kodewish.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SavingAccount {
	@Value("f5678")
	private String AccountNumber;
	public String getAccountNumber() {
		return AccountNumber;
	}

	

	

}
