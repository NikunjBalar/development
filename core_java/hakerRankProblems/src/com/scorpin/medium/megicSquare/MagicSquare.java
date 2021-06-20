package com.scorpin.medium.megicSquare;

import java.util.Scanner;


/**
 * Purpose :
 * 
 * class contain the solution to find magic square that cost is minimum to given square
 * 
 * @author Nikunj Balar
 *
 */
public class MagicSquare {

	// function to rotate square to 90 degree 
	// and print row
	static int[] rotateR(int[] s) {
		int n[] = { s[2], s[5], s[8], s[1], s[4], s[7], s[0], s[3], s[6] };

		return n;
	}

	// function to change column squre
	static int[] rotateC(int[] s) {
		int n[] = { s[0], s[3], s[6], s[1], s[4], s[7], s[2], s[5], s[8] };

		return n;
	}

	// function to find magic squre
	static int formingMagicSquare(int[][] s) {
		int squre[] = { 8, 3, 4, 1, 5, 9, 6, 7, 2 };
		int cost = 45;
		// 2d array that content all possible squre matrix
		int possibility[][] = { squre, rotateC(squre), rotateR(squre), rotateC(rotateR(squre)), rotateR(rotateR(squre)),
				rotateC(rotateR(rotateR(squre))), rotateR(rotateR(rotateR(squre))),
				rotateC(rotateR(rotateR(rotateR(squre)))) };

		int temp = 0;
		// comparing the given cost matrix to all possibility matrix and find cost
		for (int i = 0; i < 8; i++) {
			temp = Math.abs(s[0][0] - possibility[i][0]) + Math.abs(s[0][1] - possibility[i][1]) + Math.abs(s[0][2] - possibility[i][2])
					+ Math.abs(s[1][0] - possibility[i][3]) + Math.abs(s[1][1] - possibility[i][4]) + Math.abs(s[1][2] - possibility[i][5])
					+ Math.abs(s[2][0] - possibility[i][6]) + Math.abs(s[2][1] - possibility[i][7]) + Math.abs(s[2][2] - possibility[i][8]);
			cost = temp < cost ? temp : cost;
		}
		return cost;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] s = new int[3][3];

		for (int i = 0; i < 3; i++) {
			String[] sRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int sItem = Integer.parseInt(sRowItems[j]);
				s[i][j] = sItem;
			}
		}

		int result = formingMagicSquare(s);
		System.out.println(result);

		scanner.close();
	}

}
