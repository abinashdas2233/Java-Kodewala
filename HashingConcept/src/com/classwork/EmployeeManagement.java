package com.classwork;
class Employee{
	public Employee() {
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;       
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        return true; 
	}
}

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		Employee e2=new Employee();
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));

	}

}
