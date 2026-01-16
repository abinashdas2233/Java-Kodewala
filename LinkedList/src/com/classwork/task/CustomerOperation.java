package com.classwork.task;

import java.util.ArrayList;
import java.util.List;

public class CustomerOperation {
	public List<Customer> displayCustomers(List<Customer> list) {
		return list;
	}
	public List<Customer>filterCustomer(List<Customer>list){
		List<Customer>res=new ArrayList<>();
		for(Customer c:list) {
			if(c.getName().endsWith("ra")) {
				res.add(c);
			}
			
		}
		return res;
		
	}

}
