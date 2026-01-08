package com.reservationcontroller;

public class MainBookController {
	public static void functionalityCall(IIrctcBooking booking) {
		if(booking instanceof UserController) {
			//calling user functions
			booking.bookTicket();
			booking.cancelTicker();
			booking.searchTicket();
		}
		else {
			//calling agent functions
			booking.bookTicket();
			booking.cancelTicker();
			booking.searchTicket();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IIrctcBooking user=new UserController();
		IIrctcBooking agent=new AgentController();
		
		functionalityCall(user);
		functionalityCall(agent);
		
		
		
		//calling object more than to check max ticket booking functionality
		System.out.println("checking more than 6 ticket not to be booked per pnr");
		for(int i=1;i<=9;i++) {
			functionalityCall(user);
		}
		

	}

}
