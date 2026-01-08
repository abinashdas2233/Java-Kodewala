package com.staticmethoh;

public class TicketContorller {
	public static void main(String[] args) {
		IReservation ir=new ReserveCoach();
		ir.print();
		IReservation gn=new General();
		gn.print();
	}

}
