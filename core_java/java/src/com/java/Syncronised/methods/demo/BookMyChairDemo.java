package com.java.Syncronised.methods.demo;

public class BookMyChairDemo {
	public BookMyChairDemo() {
		System.out.println("counstrctor");
	}
	public void cheackAvailability() {
		for (int i = 0; i <2; i++) {
			
		System.out.println(Thread
				.currentThread()
				.getName()+"available seats are 10");
	}
	}
	
	public synchronized void bookingSeats() {
		for (int i = 0; i <3; i++) {
			
		
		System.out.println(Thread
				.currentThread()
				.getName()+
				"booking seats are 5");
	}
	}
	
	public void cencleTicket() {
		System.out.println("cencle tickets 2");
	}
}
