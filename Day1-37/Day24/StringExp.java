package com.kodewala.strings;

public class StringExp {

	public static void main(String[] args) {
		
		String s1 = "Kodewala"; // scp
		String s2 = new String("Kodewala"); // heap
	    
		System.out.println(s1 == s2); // false
		
		System.out.println(s1.equals(s2)); // true
		
		String s3 = "BTM"; // immutable - can not change
		String s4 = s3.concat(" Bangalore"); // trying to change the s3(immutable)
		
		System.out.println(s3); // 
		
	
		
		
	}
}
