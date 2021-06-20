package com.scorpin.problems.subArrayDivision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;


/**
 * Purpose :
 * 
 * find all the possibility that the sum of m continues number is equal to d and print it 
 * 
 *   input: number of element 5
 *   
 *   list of element of array/attaylist : 1 2 1 3 2
 *   
 *   d=3 m=2
 *   "5
 *   
 *   1 2 1 3 2
 *   
 *   3 2"
 *   
 *   output : 2
 * 
 * @author Nikunj Balar
 *
 */
public class SubArrayDivision {
	static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		int sum;

		if (s.size() == 1) {
			sum = s.get(0);
			if (sum == d) {
				count++;
			}
		} else {
			for (int i = 0; i <= s.size() - m; i++) {
				sum = 0;
				for (int j = i; j < i + m; j++) {
					sum += s.get(j);
				}
				if (sum == d) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int d = Integer.parseInt(dm[0]);

		int m = Integer.parseInt(dm[1]);

		int result = birthday(s, d, m);

		System.out.println(result);

		bufferedReader.close();
	}
}
