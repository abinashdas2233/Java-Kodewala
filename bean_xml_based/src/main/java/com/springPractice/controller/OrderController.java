package com.springPractice.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springPractice.entity.Orders;

public class OrderController {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Orders order=context.getBean(Orders.class);
		System.out.println(order.toString());
	}

}
