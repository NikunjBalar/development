package com.unittesting.hasi.movie;

import org.junit.jupiter.api.Test;

//@Disabled
class MovieTickets {

	//@Disabled
	@Test
	void test() {
		System.out.println("executing testing");
		Movie movie=new Movie();
		String name=movie.bookTickets(2);
		
		if(name != null) {
			System.out.println(name);
		}
	}
	
	@Test
	void testBookMovieTickets() {
		Movie movie=new Movie();
		String name=movie.bookTickets(-1);
		if(name!=null)
			System.out.println(name);
	}
	
	

}
