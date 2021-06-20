package com.nikunj.problems.findUniqueData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Purpose : to find unique number from input
 * 
 * @author Nikunj Balar
 *
 */
public class FindUniqueNumber {

	// creating object of random class for generating random number
	Random random = new Random();

	// function to find unique number using array
	public void usingArray(int n) {
		
		int[] arry = new int[n];
		// generating some random value
		for (int i = 0; i < arry.length; i++) {
			arry[i] = random.nextInt(10);
		}

		//sort array
		Arrays.sort(arry);
		// logic to print only unique number
		for (int i = 0; i < arry.length - 1; i++) {
			if (arry[i] != arry[i + 1]) {
				System.out.print(arry[i] + ", ");
			}
			if (i == arry.length - 2) {
				System.out.println(arry[arry.length - 1]);
			}
		}
	}

	// function to find unique number using arraylist
	public void usingArrayList(int n) {
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		// for generating random number and added into array list  
		for (int i = 0; i < n; i++) {
			arraylist.add(random.nextInt(10));
		}
		
		ArrayList<Integer> uniqueNumber = new ArrayList<Integer>();
		// for finding unique number and add into in array list 
		for (Integer integer : arraylist) {
			if (!uniqueNumber.contains(integer)) {
				uniqueNumber.add(integer);
			}
		}
		
		System.out.println(uniqueNumber);
	}

	public static void main(String[] args) {
		FindUniqueNumber findUniqueNumber = new FindUniqueNumber();
		int n=10000;
		findUniqueNumber.usingArray(n);
		findUniqueNumber.usingArrayList(n);
	}
}