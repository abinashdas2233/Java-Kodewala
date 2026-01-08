package com.learn;

public class BookingController {

	public static void main(String[] args) {
		
		
		IOlaBooking book=(name,surname)->{
			
			return name.toUpperCase()+" "+surname.toUpperCase();
			
		};
		String res=book.registration("abinash", "das");
		System.out.println(res);
	}

}
