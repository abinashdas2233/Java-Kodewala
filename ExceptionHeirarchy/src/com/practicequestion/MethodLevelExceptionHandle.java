package com.practicequestion;

class ExceptionDealMethod {
	public static void A() {
		try {
			B();
		} catch (Exception e) {
			System.out.println("Exception Handle at inside method A");
		}

	}

	public static void B()throws ArrayIndexOutOfBoundsException {
		C();

	}

	public static void C()throws ArrayIndexOutOfBoundsException{
		throw new ArrayIndexOutOfBoundsException();
		

	}
}

/*
 * Create 3 methods:
 * 
 * methodA() → methodB() → methodC()
 * 
 * Exception occurs in methodC
 * 
 * Handle it in methodA
 */

public class MethodLevelExceptionHandle {

	public static void main(String[] args) {
		ExceptionDealMethod.A();
		

	}

}
