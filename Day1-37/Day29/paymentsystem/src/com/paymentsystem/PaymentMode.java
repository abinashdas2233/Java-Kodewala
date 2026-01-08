package com.paymentsystem;

 class PaymentMode {
	 
	 public void generateBill() {
		 System.out.print("payment method");
	 }

}
 class Upi extends PaymentMode{
	 @Override
	 public void generateBill() {
		 System.out.print("payment method done through Upi");
	 }
	 
 }
 class CreditCard extends PaymentMode{

	@Override
	public void generateBill() {
		// TODO Auto-generated method stub
		 System.out.print("payment method done through Credit card");
		
		
	}
	 
 }
