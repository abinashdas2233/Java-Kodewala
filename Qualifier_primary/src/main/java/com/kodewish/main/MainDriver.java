package com.kodewish.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewish.bean.Employee;
import com.kodewish.config.BeanConfig;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext  context=new AnnotationConfigApplicationContext(BeanConfig.class);
		Employee e1=context.getBean(Employee.class);
		System.out.println(e1.getFirstName()+" "+e1.getLastName());

	}

}
