package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}
public class Practice {

    public static void main(String[] args) {
    	
    	List<Employee> list = Arrays.asList(
    	        new Employee("A", "IT"),
    	        new Employee("B", "HR"),
    	        new Employee("C", "IT")
    	);
    	Map<Object,List<Employee>>res=list.stream().collect(Collectors.groupingBy(i->i.dept));
    	System.out.println(res);
    	
    }
}