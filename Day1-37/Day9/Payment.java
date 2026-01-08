class Payment{
	public static double calculateDiscount(double Amount){
	//for 10% discount
	double discountRate =0.1*Amount;
		if(discountRate >500){
			// if discount rate will come > 500 then it will return 499.00
			return 499.00;
	}
	//final price after discount
	
	    return Amount-discountRate;

	}
	public static void main(String[]args){

		double totalAmount=2000.00;
		if(totalAmount>1000.00){
			//customer will get 10% discount on total purchase
			double finalPrice=calculateDiscount(totalAmount);
			System.out.println("After Discount final price-"+finalPrice);
		

	}
		else{
		System.out.println("No,Discount .Final Price-"+totalAmount);
	}
	}

	}