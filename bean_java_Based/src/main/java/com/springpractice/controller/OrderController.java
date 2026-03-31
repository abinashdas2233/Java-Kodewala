package com.springpractice.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springpractice.config.BeanConfig;
import com.springpractice.entity.Orders;

public class OrderController {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		Orders order=context.getBean(Orders.class);
		System.out.println(order.toString());
		
	}

}
