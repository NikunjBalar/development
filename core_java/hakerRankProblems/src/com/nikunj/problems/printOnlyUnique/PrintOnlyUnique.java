package com.nikunj.problems.printOnlyUnique;

import java.util.Arrays;
import java.util.Random;

/**
 * Purpose = to print only unique value of the list
 * 
 * @author Nikunj balar
 *
 */
public class PrintOnlyUnique {

	// creating object of random class for generating random number
	Random random = new Random();

	// function to print only unique number using array
	public void printUnique(int n) {
		int[] array = new int[n];
		// generating some random value
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(250);
		}

		// sort array 
		Arrays.sort(array);
		
		// logic to print only unique numbers
		for (int i = 0; i < array.length - 1; i++) {
			if (i == 0 && array[i] != array[i + 1]) {
				System.out.print(array[i] + ", ");
			} else if (array[i] != array[i + 1] && array[i - 1] != array[i]) {
				System.out.print(array[i] + ", ");
			}
			if (i == array.length - 2 && array[i] != array[i + 1]) {
				System.out.println(array[i + 1]);
			}
		}
	}

	public static void main(String[] args) {
		PrintOnlyUnique onlyUnique = new PrintOnlyUnique();
		int n = 1000;
		onlyUnique.printUnique(n);
	}

}