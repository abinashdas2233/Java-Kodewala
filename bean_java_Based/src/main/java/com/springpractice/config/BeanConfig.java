package com.springpractice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springpractice.entity.Orders;

@Configuration
public class BeanConfig {
	
	@Bean
	public Orders orderPost() {
		Orders order=new Orders();
		order.setOrderId(223);
		order.setOrderName("maggie");
		return order;
	}
	
	

}
