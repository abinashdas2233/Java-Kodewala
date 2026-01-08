package com.practicequestion;

import java.util.InputMismatchException;
import java.util.Scanner;

class Authentication{
	public static void emailCheck(String email) throws Exception {
		if(!email.equals("abhi@gmail.com")) {
			throw new InputMismatchException();
		}
		else {
			System.out.println("auth done");
		}
	}
	public static void EmailHandler(String email) throws Exception{
		emailCheck(email);
	}
}




public class ThrowVsThrownDemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email-");
		String str=sc.nextLine();
		
		try {
			Authentication.EmailHandler(str);
		}
		catch(Exception e) {
			System.out.println("Exception Handled sucessfully");
		}
		
	}

}
