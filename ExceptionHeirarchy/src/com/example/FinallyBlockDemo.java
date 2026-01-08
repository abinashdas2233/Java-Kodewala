package com.example;

public class FinallyBlockDemo {
	public static void main(String[] args) {
		try {
			String name=null;
			name.length();
			System.out.println("try block end");
			
		}
		catch(Exception e) {
			System.out.println("inside exception handle  block");
		}
		finally {
			System.out.println("inside final block");
			try {
				throw new  ArrayIndexOutOfBoundsException();
				
			}
			catch(Exception e) {
				System.out.println("Inside final block mannualy exception thrown");
			}
		}
		
	}

}
