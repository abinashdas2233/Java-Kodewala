package com.irctc;

public interface Iirctc {
	public abstract void displayStatus();
	public abstract void bookTicket();
	public default void applyGst() {
		System.out.println("Gst applied");
		
	}
	

}
