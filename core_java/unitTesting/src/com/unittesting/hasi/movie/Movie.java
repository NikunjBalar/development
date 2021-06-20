package com.unittesting.hasi.movie;

public class Movie {
	String movieName = "Joker";

	public String bookTickets(int noOfTickets) {
		System.out.println("stsrting invoking bookTickets()");
		if (noOfTickets < 1)
			throw new IllegalArgumentException();

		return movieName;
	}
}
