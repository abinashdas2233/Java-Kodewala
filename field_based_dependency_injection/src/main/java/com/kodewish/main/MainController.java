package com.kodewish.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewish.bean.Account;
import com.kodewish.config.BeanConfigs;

public class MainController {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfigs.class);
		
		Account account=context.getBean(Account.class);
		
		System.out.println(account.getName()+" "+account.getAccount().getAccountNumber());
	}

}
