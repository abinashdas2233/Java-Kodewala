package com.kodewish.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kodewish.bean.Employee;

@Configuration
@ComponentScan("com.kodewish")
public class BeanConfig {
	@Bean
	public Employee createEmployee() {
		return new Employee();
	}

}
