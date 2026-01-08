package com.practicequestion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlockDeal {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number-");
		try {
			String str=sc.nextLine();
			//int n=sc.nextInt();
			//int res=n/0;
			int n=Integer.parseInt(str);
			
		} catch ( InputMismatchException e) {
			// TODO: handle exception
			System.out.println("it's input mismatch");
		}
		catch(ArithmeticException e) {
			System.out.println("it's Arthematic exception");
			
		}
		catch(NumberFormatException e) {
			System.out.println("number exception throwing");
		}
		
	}
}
