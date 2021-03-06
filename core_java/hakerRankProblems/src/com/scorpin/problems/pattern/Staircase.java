package com.scorpin.problems.pattern;

import java.util.Scanner;

/**
 * Purpose : To print the following pattern
 * 
 *     #
 *    ##
 *   ### 
 *  ####  
 *  
 * @author Mahadev
 *
 */
public class Staircase {
	
	static void staircase(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j >= n-1) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
