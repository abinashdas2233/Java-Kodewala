package com.practicequestion;

import java.util.Scanner;

public class CustomExceptionDemo {

	public static void main(String[] args) throws InvalidOrderException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price-");
		double price=sc.nextDouble();
		if(price<500.00) {
			throw new InvalidOrderException("price is below 500,order not accepted");
			
			
		}
		else {
			System.out.println("Order accepted");
		}

	}

}
