package com.scorpin.problems.tomAndJerry;

import java.util.Scanner;

/**
 * Purpose :
 * 
 * x=2, y=5, z=4
 * 
 * The cats are at positions 2 (Cat A) and 5 (Cat B), and the mouse is at
 * position 4. Cat B, at position 5 will arrive first since it is only 1 unit
 * away while the other is 2 units away. Return 'Cat B'.
 * 
 * @author Nikunj Balar
 *
 */
public class TomAndJerry {

	static String catAndMouse(int x, int y, int z) {
		int diff1 = Math.abs(x - z);
		int diff2 = Math.abs(y - z);
		if (diff1 < diff2) {
			return "Cat A";
		} else if (diff1 == diff2) {
			return "Mouse C";
		} else {
			return "Cat B";
		}
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String[] xyz = scanner.nextLine().split(" ");

			int x = Integer.parseInt(xyz[0]);

			int y = Integer.parseInt(xyz[1]);

			int z = Integer.parseInt(xyz[2]);

			String result = catAndMouse(x, y, z);
			System.out.println(result);
		}
		scanner.close();
	}
}
