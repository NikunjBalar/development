package com.java.Syncronised.methods.demo;

public class ThreadBookMyShow extends Thread{
	
	BookMyChairDemo bookMyChairDemo;
	public ThreadBookMyShow(BookMyChairDemo bookMyChairDemo) {
		this.bookMyChairDemo=bookMyChairDemo;
		
	}
	public void run() {
		bookMyChairDemo.bookingSeats();
		bookMyChairDemo.cheackAvailability();
	}
}
