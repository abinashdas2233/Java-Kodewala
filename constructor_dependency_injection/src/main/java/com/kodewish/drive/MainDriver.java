package com.kodewish.drive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewish.bean.Customer;
import com.kodewish.config.BeanConfig;

public class MainDriver {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		
		Customer customer=context.getBean(Customer.class);
		
		System.out.println(customer.getName()+" "+customer.getAddress().getCity());
		

	}

}
