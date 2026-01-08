class PaymentGateway{
	public static void main(String[]args){


	int paymentMode=Integer.parseInt(args[0]);
		if(paymentMode==1){
		System.out.println("CreditCard Choosed by Customer");

		}
		else if(paymentMode==2){
		System.out.println("DebitCard Choosed by Customer");

		}
		else if(paymentMode==3){
		System.out.println("NetBanking Choosed by Customer");

		}
		else{
			System.out.println("new Payment type found");

}
	}
}