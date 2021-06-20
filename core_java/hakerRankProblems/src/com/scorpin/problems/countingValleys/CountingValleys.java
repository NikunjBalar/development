package com.scorpin.problems.countingValleys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Purpose :
 * 
 * steps=8 path=[DDUUUUDD]
 * 
 * The hiker first enters a valley 2 units deep. Then they climb out and up onto
 * a mountain 2 units high. Finally, the hiker returns to sea level and ends the
 * hike.
 * 
 * @author Nikunj Balar
 *
 */
public class CountingValleys {

	public static int countingValleys(int steps, String path) {
		int count = 0;
		int valleys = 0 ;
		int v=0;
		char paths[] = path.toCharArray();
		for (int i = 0; i < paths.length; i++) {
			if (paths[i] == 'D') {
				count--;
			}
			else {
				count++;
			}
			if (count < 0) {
				v=1;
			}
			if ( v == 1 && count == 0 ) {
				valleys ++;
				v=0;
			}
			
		}
		return valleys;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int steps = Integer.parseInt(bufferedReader.readLine().trim());

		String path = bufferedReader.readLine();

		int result = countingValleys(steps, path);
		System.out.println(result);

		bufferedReader.close();
	}
}
