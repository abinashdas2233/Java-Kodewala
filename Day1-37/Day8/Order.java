class Order{
 public void placeOrder(){
	int orderQty=10;
	Order order=new Order();
	System.out.println(orderQty);	//here orderQty variable is local to placeOrder()
}
	public void cancelOrder(){
		Order order=new Order();
		System.out.println(order.orderQty);//it will throw an error(variable or symbol not found)
	}
	
}


