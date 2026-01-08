package com.ecom;

class PaymentProcess {
	public PaymentMode display() {
		System.out.println("returning credit card object");
		return new PaymentMode();
	}
}
class OnlinePayment extends PaymentProcess{
	@Override
	public CreditCard display() {
		System.out.println("returning credit card object");
		return new CreditCard();
	}
	
}
class Cod extends PaymentProcess{
	@Override
	public DebitCard display() {
		System.out.println("returning debit card object");
		return new DebitCard();
	}
	
	
}
