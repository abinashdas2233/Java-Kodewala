package com.kodewish.config;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kodewish.bean.Adreess;
import com.kodewish.bean.Customer;

@Configuration
@ComponentScan(basePackages = "com.kodewish")
public class BeanConfig {
	@Bean
	public Adreess addressInstance() {
		
		return new Adreess("BBSR", "od");
	}
	
	@Bean
	public Customer customerInstance() {
		
		return new Customer("abhinash", addressInstance());
		
	}
	
	
	

}
