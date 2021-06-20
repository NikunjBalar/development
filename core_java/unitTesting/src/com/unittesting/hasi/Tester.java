package com.unittesting.hasi;

import com.unittesting.hasi.movie.Movie;

public class Tester {
	public static void main(String[] args) {
		Movie movie=new Movie();
		String name=movie.bookTickets(2);
		
		if(name != null) {
			System.out.println(name);
		}
		
	}
}


