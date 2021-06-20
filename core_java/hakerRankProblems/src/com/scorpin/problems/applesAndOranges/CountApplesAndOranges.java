package com.scorpin.problems.applesAndOranges;

import java.util.Scanner;

/**
 * Purpose : Sam's house is between s=7 and t=10 . The apple tree is located at
 * a=4 and the orange at b=12. There are m=3 apples and n=3 oranges. Apples are
 * thrown apples = [2,3,-4] units distance from a, and oranges = [3,-2,-4] units
 * distance. Adding each apple distance to the position of the tree, they land
 * at [4+2,4+3,4+(-4)]=[6,7,0]. Oranges land at
 * [12+3,12+(-2),12+(-4)]=[15,10,8]. One apple and two oranges land in the
 * inclusive range 7-10 so we print 1 2 .
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class CountApplesAndOranges {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int applesCount = 0;
		int orangesCount = 0;
		for (int i = 0; i < apples.length; i++) {
			apples[i] = a + apples[i];
			if (s <= apples[i] && t>= apples[i]) {
				applesCount++;
			}
		}

		for (int i = 0; i < oranges.length; i++) {
			oranges[i] = b + oranges[i];
			if (s <= oranges[i] && t>= oranges[i]) {
				orangesCount++;
			}
		}
		System.out.println(applesCount);
		System.out.println(orangesCount);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] st = scanner.nextLine().split(" ");

		int s = Integer.parseInt(st[0]);

		int t = Integer.parseInt(st[1]);

		String[] ab = scanner.nextLine().split(" ");

		int a = Integer.parseInt(ab[0]);

		int b = Integer.parseInt(ab[1]);

		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		int[] apples = new int[m];

		String[] applesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			int applesItem = Integer.parseInt(applesItems[i]);
			apples[i] = applesItem;
		}

		int[] oranges = new int[n];

		String[] orangesItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int orangesItem = Integer.parseInt(orangesItems[i]);
			oranges[i] = orangesItem;
		}

		countApplesAndOranges(s, t, a, b, apples, oranges);

		scanner.close();
	}
}