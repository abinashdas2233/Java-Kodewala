package com.example;

public class UserInputException {

	public static void main(String[] args) {
		try {
			System.out.println("name-"+args[0]+" surename-"+args[1]);
		} catch (Exception e) {
			System.out.print("Exception occur due to user input misssing");
			e.printStackTrace();
		}

	}

}
