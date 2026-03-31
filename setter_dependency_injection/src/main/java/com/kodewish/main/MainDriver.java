package com.kodewish.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewish.bean.Employee;
import com.kodewish.config.BeanConfig;

public class MainDriver {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		Employee employee=context.getBean(Employee.class);
		System.out.println(employee.getName()+" "+employee.getAddress().getCity()+","+employee.getAddress().getState());

	}

}
