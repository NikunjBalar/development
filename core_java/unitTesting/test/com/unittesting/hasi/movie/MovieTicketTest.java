package com.unittesting.hasi.movie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MovieTicketTest {
	@Disabled
	@Test
	void testBookMovieTicketsForPositive() {
		Movie movie = new Movie();

		String name = movie.bookTickets(3);
		/*if (name != null)
			System.out.println(name);*/
		assertEquals( "Joker", movie.bookTickets(-1),"success");
	}

	@Test
	void testBookMovieTickets() {
		Movie movie=new Movie();
		//String name=movie.bookTickets(-1);
		
		
		assertThrows(IllegalArgumentException.class,()->{movie.bookTickets(-1);});
	}

}
