package com.classwork.task;
import java.util.*;
public class CustomerDriver {
	public static void main(String[] args) {
		List<Customer>list=Arrays.asList(new Customer("Abhinash"),new Customer("rabi"),new Customer("narendra"));
		CustomerOperation customer=new CustomerOperation();
		
		System.out.println("All customer");
		
		List<Customer>all=customer.displayCustomers(list);
		for(Customer i:all) {
			System.out.println(i.getName());
		}
		
		
		
		List<Customer>filtered=customer.filterCustomer(list);
		System.out.println("after filter");
		
		
		for(Customer i:filtered) {
			System.out.println(i.getName());
		}
		
		
	}

}
