package com.scorpin.problems.drawingBook;

import java.util.Scanner;

/**
 * Purpose :
 * 
 * n=5; p=3;
 * 
 * this diagram show the number printed on the page of book
 * 
 * --- --- --- --- --- --- | | 1 | --> | 2 | 3 | --> | 4 | 5 | --- --- --- ---
 * --- ---
 * 
 * Using the diagram above, if the student wants to get to page 3, they open the
 * book to page 1, flip page 1 and they are on the correct page. If they open
 * the book to the last page, page 5, they turn 1 page and are at the correct
 * page. Return 1.
 * 
 * 
 * @author Mahadev
 *
 */
public class DrawingBook {

	static int pageCount(int n, int p) {
		int front = p / 2;
		int last = (n - p) / 2;
		if (n % 2 == 0 && n - p == 1) {
			last = 1;
		}
		if (last < front) {
			return last;
		} else {
			return front;
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int p = scanner.nextInt();
		// scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

		int result = pageCount(n, p);
		System.out.println(result);
		scanner.close();
	}
}
