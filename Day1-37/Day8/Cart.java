class Cart{
     	int orderId=34;
     	String itemName="Vegetable";
	int OrderQty=2;
	double price=500.00;
        static double gst=0.12;
	
	public double caluculateFinalPrice(){
		Cart cart=new Cart();
		
		double finalPrice=gst*cart.price+cart.price;

 
		return finalPrice;
	}

	public void printBill(){
		
		Cart cart=new Cart();
           	 System.out.println("OrderId="+cart.orderId+" ItemName="+cart.itemName+" OrderQty="+cart.OrderQty+" price="+cart.price+" Final Price="+String.valueOf(cart.caluculateFinalPrice()));

	}
	public static void main(String[]args){
 
		Cart cart=new Cart();
		cart.printBill();
}

	
  }