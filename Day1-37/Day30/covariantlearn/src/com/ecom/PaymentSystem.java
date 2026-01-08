package com.ecom;

public class PaymentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcess online=new OnlinePayment();
		online.display();
		PaymentProcess cash=new Cod();
		cash.display();

	}

}
