package com.ecommerce;
class Order{
	int orderId;
	String itemName;
	double price;
	int quantity;
	int gst;
	public Order(int orderId,String itemName,double price,int quantity) {
		this.orderId=orderId;
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}
	public Order(int orderId,String itemName,double price,int quantity,int gst) {
		this.orderId=orderId;
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
		this.gst=gst;
	}
	public void printBill() {
		
			System.out.println(orderId+" "+itemName+" "+price+" "+gst +" gst applicable");
			
			
		
		
		
		
		
		
	}
	
}
public class ZomatoCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order abhi=new Order(23,"maggie",80.00,2);
		Order rahul=new Order(25,"pizza",150.00,1,3);
		Order rakhi=new Order(29,"burgger",180.00,2,6);
		Order mani=new Order(28,"biriyani",380.00,2);
		abhi.printBill();
		rahul.printBill();
		rakhi.printBill();
		mani.printBill();

	}

}
