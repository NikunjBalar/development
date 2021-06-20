package com.scorpin.problems.hurdleRace;

import java.io.IOException;
import java.util.Scanner;

/**
 * Purpose :
 * 
 * Input : size of array=5, k=4
 * 
 * array=1 6 3 5 2
 * 
 * OutPut : 2
 * 
 * Explanation :
 * 
 * Dan's character can jump a maximum of k=4 units, but the tallest hurdle has a
 * height at index 1=6: To be able to jump all the hurdles, Dan must drink 6-4=2
 * doses.
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class HurdleRace {

	static int hurdleRace(int k, int[] height) {
		int max= 0;
		for (int i = 0; i < height.length; i++) {
			if (max < height[i])
				max = height[i];
		}
		return (max < k) ? 0 : max-k;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);
        System.out.println(result);

       scanner.close();
    }
}
