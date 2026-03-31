package com.kodewish.bean;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Employee implements InitializingBean, DisposableBean{

	public Employee() {
		super();
		System.out.println("constructor called");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("@postConstructor called");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy() called");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after property set");
		
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("@Pre-Destroy called");
	}
	
	

}
