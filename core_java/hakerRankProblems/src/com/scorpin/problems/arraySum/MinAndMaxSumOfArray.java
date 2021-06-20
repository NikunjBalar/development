package com.scorpin.problems.arraySum;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxSumOfArray {
	
	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		long min=((long)arr[0])+((long)arr[1])+((long)arr[2])+((long)arr[3]);
		long max=((long)arr[1])+((long)arr[2])+((long)arr[3])+((long)arr[4]);
		
		System.out.println(min + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
