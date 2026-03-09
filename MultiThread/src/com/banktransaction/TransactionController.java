package com.banktransaction;

public class TransactionController {

	public static void main(String[] args) throws InterruptedException {
		Account account=new Account();
		Thread t1=new Thread(()->{
			
			
			for(int i=1;i<=1000;i++) {
				account.doCredit();
			}
		});
		
		Thread t2=new Thread(()->{
			for(int i=1;i<=1000;i++) {
				account.doCredit();
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("last transaction -"+account.balance);

	}

}
