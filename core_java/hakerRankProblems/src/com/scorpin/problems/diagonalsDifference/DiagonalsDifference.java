package com.scorpin.problems.diagonalsDifference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class DiagonalsDifference {

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected t	o return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */

	public static int diagonalDifference(List<List<Integer>> arr) {
		int primaryDiagonal = 0;
		int secondaryDiagonal = 0;

		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if (i == j) {
					primaryDiagonal += arr.get(i).get(j);
					
				} if (i + j == arr.size() - 1) {
					secondaryDiagonal += arr.get(i).get(j);
				}
			}
		}
		int diff = Math.abs(primaryDiagonal-secondaryDiagonal);
		
		return diff;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		int result = DiagonalsDifference.diagonalDifference(arr);
		System.out.println(result);
	}

}
