package com.scorpin.problems.ratio;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;



/**
 * Purpose : To find the ratio of positive number , negative number and zero of an array in 6decimal format
 * 
 * @author NikunjBalar
 *
 */
public class RatioOfPluseMinusZero {

	//function to find the ratio of the positive, negative and zero numbers of an array 
	static void plusMinus(int[] arr) {
		float positive = 0;
		float negative = 0;
		float zero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				positive++;
			} else if (arr[i] == 0) {
				zero++;
			} else {
				negative++;
			}
		}
		positive = positive / arr.length;
		zero = zero / arr.length;
		negative = negative / arr.length;
		
		// convert output in 6 decimal number
		DecimalFormat df = new DecimalFormat("#.######");
		df.setRoundingMode(RoundingMode.CEILING);

		System.out.println(df.format(positive));
		System.out.println(df.format(negative));
		System.out.println(df.format(zero));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}