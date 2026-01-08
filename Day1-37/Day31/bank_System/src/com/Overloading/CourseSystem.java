package com.Overloading;
//overloading example

public class CourseSystem {
	public static void process(String name, long numb, String email) {
		System.out.println("New Student");
	}

	public static void process(String email, double amount) {
		System.out.println("new student paid money");
	}

	public static void process(String email, String password) {
		System.out.println("redirected to  index page after login");
	}

	public static void main(String[] args) {

		process("abhi", 685948, "abhi@gmail.com");// 1s method call
		process("abhi@gmail.com", 18000.00);// 2nd method call
		process("abhi@gmail.com", "kn25");// 3rd method call

	}

}
