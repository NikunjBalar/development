package com.scorpin.problems.BirthdayCakeCandle;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

/**
 * Purpose : to find highest candle from all and print it
 * 
 * candles = {4, 4, 3, 2, 3 }
 * 
 * The maximum height candles are 4 units high.There are 2 of them,so return 2 .
 * 
 * @author Nikunj Balar
 *
 */
public class BlowTheHighestCandel {

	public static int birthdayCakeCandles(List<Integer> candles) {
		int size = candles.size();
		// Collections.sort(candles);
		int count = 0;
		int i = 0;
		int max = 0;

		while (i < size) {
			if (max < candles.get(i)) {
				max = candles.get(i);
				count = 1;
			} else if (max == candles.get(i)) {
				count += 1;
			}
			i++;
		}

		/*
		 * while (candles.get(i) == candles.get(i-1)) { count++; i--; }
		 */

		/*
		 * for (int i = size-1 ; i >=0 ; i--) { if (candles.get(i) == candles.get(i-1))
		 * { count++; } else { break; } }
		 */
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int result = BlowTheHighestCandel.birthdayCakeCandles(candles);

		System.out.println(result);
		bufferedReader.close();
	}
}
