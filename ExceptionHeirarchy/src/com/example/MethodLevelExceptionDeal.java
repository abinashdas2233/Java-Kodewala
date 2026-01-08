package com.example;

import java.util.InputMismatchException;

public class MethodLevelExceptionDeal {
	public static int DatabaseDriverConnection() {
		try {
			throw new InputMismatchException();
			
		}
		catch(Exception e) {
			return 1;
			
		}
		finally {
			return 0;
			
		}
		
		
	}
	public static void main(String[] args) {
		int result=DatabaseDriverConnection();
		if(result==0) {
			System.out.println("connection closed");
		}
		else {
			System.out.println("connection open");
		}
	}

}
