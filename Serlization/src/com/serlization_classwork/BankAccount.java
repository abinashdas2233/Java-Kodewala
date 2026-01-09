package com.serlization_classwork;

import java.io.Serializable;

public class BankAccount implements Serializable{
	@Override
	public String toString() {
		return "BankAccount [amount=" + amount + ", accountNo=" + accountNo + ", name=" + name + "]";
	}
	private double amount;
	private String accountNo;
	private String name;
	public BankAccount(double amount, String accountNo, String name) {
		super();
		this.amount = amount;
		this.accountNo = accountNo;
		this.name = name;
	}
	

}
