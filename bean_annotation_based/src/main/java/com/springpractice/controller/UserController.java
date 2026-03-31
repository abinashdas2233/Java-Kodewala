package com.springpractice.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springpractice.config.BeanConfig;
import com.springpractice.entity.User;

public class UserController {
public static void main(String[] args) {
	ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
	User user=context.getBean(User.class);
	System.out.println(user.toString());
}
}
