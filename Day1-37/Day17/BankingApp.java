package com.kodewala.threads.bank.app;

class Account {

	int balance = 1000; // initial balance

	public synchronized void credit(int _amount) {
		int temp = balance;
		temp = temp + _amount;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = temp;
	}

	public synchronized void debit(int _amount) {
		int temp = balance;
		temp = temp - _amount;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = temp;
	}

	public int getBalance() {
		return balance;
	}

}

class CreditThread extends Thread {
	Account account;

	CreditThread(Account _account) {
		this.account = _account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			account.credit(100);
			System.out.println("Balance after 100 rs credit : " + account.getBalance());
		}
	}
}

class DebitThread extends Thread {
	Account account;

	DebitThread(Account _account) {
		this.account = _account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			account.debit(100);
			System.out.println("Balance after 100 rs debit : " + account.getBalance());
		}
	}
}

public class BankingApp {

	public static void main(String[] args) throws InterruptedException {

		Account account = new Account();

		CreditThread t1 = new CreditThread(account);
		t1.start();

		DebitThread t2 = new DebitThread(account);
		t2.start();

		t1.join();
		t2.join();

		System.out.println(" final balance " + account.getBalance());

	}

}
