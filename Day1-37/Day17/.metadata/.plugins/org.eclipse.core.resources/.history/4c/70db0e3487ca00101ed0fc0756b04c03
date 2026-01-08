package com.admission;
class Status{
	public Status() {
		//for guest student
		System.out.println("need to register");
	}
	public Status(String email) {
		//for register student
		System.out.println(email+"is register");
	}
	public Status(String email,String course) {
		//for enrolled student
		System.out.println(email+"is register & cours name-"+course);
	}
	public Status(String email,String course,long amount) {
		//for enrolled student
		System.out.println(email+"is register & cours name-"+course+" amount is-"+amount);
	}
	
}
class Student extends Status{
	public Student() {
		//for guest student
		super();
		
		System.out.println("Guest Student");
	}
	public Student(String email) {
		//for register student
		super(email);
	}
	public Student(String email,String course) {
		//for enrolled student
		super(email,course);
	}
	public Student(String email,String course,long amount) {
		//for paid
		super(email,course,amount);
	}
}

public class admissioncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Guest=new Student();
		Student register=new Student("abhi@gmail.com");
		Student enroll=new Student("kn87@gmail.com","java");
		Student paid=new Student("lk67@gmail.com","java",30000);

	}

}
