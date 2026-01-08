class CashDiscount{
	public static int discount(int amount,int discount){
		int discountRate=(discount*amount/100);
		if(discountRate>10000){
			discountRate=1000;

}
		return amount-discountRate;







}

	public static void main(String[]args){
         int amount=Integer.parseInt(args[0]);
		if(amount<1000){
		System.out.println("No Discount.Amount to be paid:- "+amount);
	}
	 
		if(amount>1000 && amount<=5000){
		System.out.println("After 10% discount Amount to be paid:- ");
		int res=discount(amount,10);
		System.out.println(res);
                
		

	}
	else{
		System.out.println("15% discount applied");
		System.out.println("After 15% discount Amount to be paid:- ");
		int res=discount(amount,15);
		System.out.println(res);


	}
	
	



	}
}