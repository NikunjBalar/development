package com.scorpin.problems.BetweenTwoSets;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Purpose : You will be given two arrays of integers and asked to determine all
 * integers that satisfy the following two conditions:
 * 
 * 1.The elements of the first array are all factors of the integer being
 * considered
 * 
 * 2.The integer being considered is a factor of all elements of the second
 * array.
 * 
 * These numbers are referred to as being between the two arrays. You must
 * determine how many such numbers exist.
 * 
 * For example, given the arrays a=[2,6] and b=[24,36] , there are two numbers
 * between them:6 and 12. 6%2=0,6%6=0,24%6=0 and 36%6=0 for the first value.
 * Similarly 12%2=0, 12%6=0, and 24%12=0, 36%12=0 .
 * 
 * @author Nikunj Balar
 *
 */
public class BetweenTwoSets {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int numbers = 0;
		Collections.sort(b);
		int i = 1;
		boolean status;
		while (i <= b.get(0)) {
			status = true;
			for (Integer integer : a) {
				if (i % integer != 0) {
					status = false;
					break;
				}
			}
			for (Integer integer : b) {
				if (integer % i != 0) {
					status = false;
					break;
				}
			}
			if (status == true) {
				numbers++;
			}
			
			i++;
		}

		return numbers;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = getTotalX(arr, brr);
		System.out.println(total);

		bufferedReader.close();
	}

}