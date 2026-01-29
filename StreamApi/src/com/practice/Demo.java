package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	 double salary;
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
public class Demo {

	public static void main(String[] args) {
		List<Employee>list=Arrays.asList(new Employee(1,"kanha",8000.00),new Employee(2,"abhinash",200.00),new Employee(3,"dhnashu",9000));
		List<Employee>res=list.stream().filter((i)->i.salary>5000.00).collect(Collectors.toList());
		
		for(Employee e:res) {
			System.out.println(e.name+"->"+e.salary);
		}
		Map<Double,List<String>>res2=list.stream().filter((i)->i.salary>5000.00).collect(Collectors.groupingBy(i->i.salary,Collectors.mapping(i->i.name,Collectors.toList() )));
		System.out.println(res2);
		
		
		
		
		
		
		
	}

}
