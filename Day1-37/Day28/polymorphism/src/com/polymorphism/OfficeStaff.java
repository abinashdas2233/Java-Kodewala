package com.polymorphism;

class Employee extends Object{
	String companyName="Microsoft";
	
	
}
class Manager extends Employee{
	
}

class SeniorStaff extends Employee{
	
}
class JuniorStaff extends Employee{
	
}

public class OfficeStaff {

	public static void main(String[] args) {
		Manager manager=new Manager();
		System.out.println(manager.companyName);
		

	}

}
