package com.customException;

public class OrderControllerDriver {
	
	
	public static void main(String[] args) {
		//demonstrate below program by puting total price<1000 and another test make parnterName=null
		double totalPrice=100.00;
		String partnerName=null;
		try {
			if(totalPrice<1000.00) {
				throw new OrderNotProccedException("order not accepted");
			}
			if(partnerName==null) {
				throw new DeliveryPatnerNotFound("partner not available");
			}
			
		}
		catch (OrderNotProccedException  e) {
			System.out.println(" order not to be proceed");
		}
		catch(DeliveryPatnerNotFound e) {
		System.out.println("Delivery partner not available");
		}
		
		
	}

}
