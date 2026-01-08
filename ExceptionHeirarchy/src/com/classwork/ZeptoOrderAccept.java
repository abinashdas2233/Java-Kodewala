package com.classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZeptoOrderAccept {
	public static void authentication() throws Exception {
		try {
			dataBaseRepo();
		}
		catch(InputMismatchException e){
			System.out.println("error handle inside authentication method");
			
			throw new Exception();
			
		}
		
		
	}
	public static void dataBaseRepo() throws InputMismatchException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new pin-");
		int pin=sc.nextInt();
		
		
		
	}
}
