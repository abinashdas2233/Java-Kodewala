package com.evenodd;

public class Driver {

	public static void main(String[] args) {
		ICheckNumber check=(n)->  n%2==0;
		boolean res1=check.isEven(6);
		System.out.println(res1);
		boolean res2=check.isEven(5);
		System.out.println(res2);
		

	}

}
