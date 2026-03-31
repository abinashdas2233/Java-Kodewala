package com.kodewish;

public class MainController {
	public static void main(String[] args) {
		Account a1=Account.getInstance();
		
		Account a2=Account.getInstance();
		
		System.out.println(a1==a2);
	}

}
