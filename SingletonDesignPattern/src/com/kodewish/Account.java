package com.kodewish;

public class Account {
	private static Account instance;
	
	private Account() {
		
	}
	
	public static Account getInstance() {
		if(instance==null) {
			instance=new Account();
		}
		return instance;
	}

}
