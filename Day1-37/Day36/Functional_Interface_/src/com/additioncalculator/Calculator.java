package com.additioncalculator;

public class Calculator {
	public static void main(String[] args) {
		Icalculator cal=(a,b)->a+b;
		int res=cal.add(5, 6);
		System.out.println(res);
	}
}
