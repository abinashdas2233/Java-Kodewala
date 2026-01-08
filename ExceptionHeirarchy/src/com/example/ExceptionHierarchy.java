package com.example;

import java.util.InputMismatchException;



public class ExceptionHierarchy {
   public static void main(String[] args) {
	
	
	try {
		
		
		String input ="abhi";
		
		
		System.out.println("length-"+input.length());
		
		throw new InputMismatchException();
		 
		 
		 
		
		
		
	} 
	catch(InputMismatchException e) {
		System.out.println("its input mismatch exception");
	}
	catch(NullPointerException e) {
		System.out.println("Its null pointer exception");
	}
	
	
	catch (Exception e) {
		System.out.println("Exception occur");
		
	}
}

}
