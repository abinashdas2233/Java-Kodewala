package com.learn;
import java.util.*;
public class OrderDetails {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id nmb-");
		int id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter name-");
		String name=sc.nextLine();
		
		
		double price;
		while(true) {
			System.out.println("Enter price-");
			if(sc.hasNextDouble()) { //check wether input is int or not
				price=sc.nextDouble();
				break;
			}
			else {
				System.out.println("Enter again with correct input");
				sc.next();//consume the unwanted input which is not int;
				
			}
		}
		
		System.out.println("Id-"+id+" name-"+name+" price-"+price);
		sc.close();

	}

}
