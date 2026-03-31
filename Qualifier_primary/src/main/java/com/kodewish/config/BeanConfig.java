package com.kodewish.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewish.bean.Employee;

@Configuration
@ComponentScan(basePackages = "com.kodewish")
public class BeanConfig {
	
	@Bean("acc1")
	
	
	public Employee createEmployee1() {
		return new Employee("Abinash", "das");
	}
	
	@Bean("acc2")
	public Employee createEmployee2() {
		return new Employee("abhijeet", "das");
	}

}
