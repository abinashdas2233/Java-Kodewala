package com.array.learn;
class Account{
	String name;
	String accountNumber;
	String email;
	double balance ;
	
	
	public Account(String name, String accountNumber, String email, double balance) {
		
		this.name = name;
		this.accountNumber= accountNumber;
		this.email = email;
		this.balance = balance;
	}
	public void printNotification() {
		
		if(balance<0.00) {
			System.out.println("dear "+name+" your account having number "+accountNumber+" current balance is"+balance);
		}
		
	}
	
	
}

public class BankNotifaction {

	public static void main(String[] args) {
		
		Account[]accountList =new Account[4];
		
		Account account1=new Account("Abinash", "223456", "abhi@gmail.com", 1000.00);
		Account account2=new Account("hitesh", "223746", "hitesh@gmail.com", -1000.00);
		Account account3=new Account("nitesh", "223456", "hi678@gmail.com", 2000.00);
		Account account4=new Account("shiva", "223456", "shiva34@gmail.com", -1000.00);
		
		accountList[0]=account1;
		accountList[1]=account2;
		accountList[2]=account3;
		accountList[3]=account4;
		
		for(int i=0;i<accountList.length;i++) {
			accountList[i].printNotification();
		}
		

	}

}
