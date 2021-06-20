package com.scorpin.problems.divisibleSumPairs;

import java.util.Scanner;

/**
 * Purpose :
 * 
 * find and print the number of pairs that sum is divisible by k.
 * ar=[1,2,3,4,5,6] and k=5. Our three pairs meeting the criteria are[1,4],[2,3]
 * and [4,6].
 * 
 * @author Nikunj Balar
 *
 */
public class DivisibleSumPairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int numberOfPairs = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((ar[i] + ar[j]) % k == 0) {
					numberOfPairs++;
				}
			}
		}
		return numberOfPairs;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = divisibleSumPairs(n, k, ar);
		System.out.println(result);

		scanner.close();
	}

}
