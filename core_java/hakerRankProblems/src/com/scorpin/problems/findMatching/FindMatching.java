package com.scorpin.problems.findMatching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Purpose :
 * 
 * there are socks with colors arr=[1,2,1,2,1,3,2]. There is one pair of color 1
 * and one of color 2. There are three odd socks left, one of each color. The
 * number of pairs is 2.
 * 
 * input : arr=[1,2,1,2,1,3,2]
 * 
 * output : 2
 * 
 * @author Nikunj Balar
 *
 */
public class FindMatching {
	static int sockMerchant(int n, int[] ar) {
		int pair = 0 ;
		Arrays.sort(ar);
		for (int i = 0; i < ar.length -1; i++) {
			if (ar[i] == ar[i+1]) {
				pair ++;
				i++;
			}
		}
		return pair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
        scanner.close();
    }

}
