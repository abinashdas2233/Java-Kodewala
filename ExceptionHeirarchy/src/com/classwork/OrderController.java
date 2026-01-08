package com.classwork;

public class OrderController {
	public static void main(String[] args) {
		try {
			ZeptoOrderAccept.authentication();
		} catch (Exception e) {
			
			System.out.println("Exception handle inside main()");
		}
	}

}
