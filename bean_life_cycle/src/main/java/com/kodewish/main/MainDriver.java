package com.kodewish.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kodewish.bean.Employee;
import com.kodewish.config.BeanConfig;

public class MainDriver {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);

        System.out.println("bean ready to use");

        Employee e1 = context.getBean(Employee.class);

        context.close();  
    }
}