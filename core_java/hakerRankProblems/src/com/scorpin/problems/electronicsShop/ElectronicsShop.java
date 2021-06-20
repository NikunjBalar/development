package com.scorpin.problems.electronicsShop;

import java.util.Scanner;

/**
 * Purpose :
 * 
 * b=60; budget
 * 
 * keyboards=[40,50,60] price of each keyboard model
 * 
 * drives=[5,8,12] price of each drives
 * 
 * The person can buy a 40 keyboard + 12 USB drive=52 that is <b(52<60), or a 50
 * keyboard + 8USB drive=58 that is <b(58<60). Choose the latter as the more
 * expensive option and return 58.
 * 
 * The maximum amount of money she can spend on a keyboard and USB drive, or -1
 * if she can't purchase both items
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int expensive =0;
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if (keyboards[i]+drives[j] <= b && keyboards[i]+drives[j] > expensive) {
					expensive=keyboards[i]+drives[j];
				}
				else if(expensive == 0 ){
					expensive=-1;
				}
			}
		}	
		return expensive;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] bnm = scanner.nextLine().split(" ");

		int b = Integer.parseInt(bnm[0]);

		int n = Integer.parseInt(bnm[1]);

		int m = Integer.parseInt(bnm[2]);

		int[] keyboards = new int[n];

		String[] keyboardsItems = scanner.nextLine().split(" ");

		for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
			int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
			keyboards[keyboardsItr] = keyboardsItem;
		}

		int[] drives = new int[m];

		String[] drivesItems = scanner.nextLine().split(" ");

		for (int drivesItr = 0; drivesItr < m; drivesItr++) {
			int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
			drives[drivesItr] = drivesItem;
		}

		int moneySpent = getMoneySpent(keyboards, drives, b);
		System.out.println(moneySpent);
		scanner.close();
	}
}
