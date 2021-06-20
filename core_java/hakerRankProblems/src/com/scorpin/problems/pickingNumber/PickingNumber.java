package com.scorpin.problems.pickingNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/**
 * Purpose :
 * 
 * a=[1,1,2,2,4,4,5,5,5]
 * 
 * There are two sub arrays meeting the criterion: [1,1,2,2] and [4,4,5,5,5].
 * The maximum length sub array has 5 elements.
 * 
 * @author Nikunj Balar
 *
 */
public class PickingNumber {

	public static int pickingNumbers(List<Integer> a) {
		int count = 0;
		Collections.sort(a);
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i; j < a.size(); j++) {
				if (Math.abs(a.get(i) - a.get(j)) <= 1) {
					arr.add(a.get(j));
				} else {
					break;
				}
			}
			count = arr.size() > count ? arr.size() : count;
			arr.removeAll(arr);
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		int result = pickingNumbers(a);
		System.out.println(result);

		bufferedReader.close();

	}
}
