package com.scorpin.problems.breakingTheRecord;

import java.util.Scanner;

/**
 * Purpose : 
 * 
 * 
 * input
 * array lenth:9 
 * 
 * array elements: 10 5 20 20 4 5 2 25 1
 * 
 * output : 2 4
 * 
 * Explanation : She broke her best record twice (after games 2 and 7) and her
 * worst record four times (after games 1, 4, 6, and 8), so we print 2 4 as our
 * answer. Note that she did not break her record for best score during game 3,
 * as her score during that game was not strictly greater than her best record
 * at the time.
 * 
 * @author Nikunj Balar
 *
 */
public class BreakingTheRecord {

	static int[] breakingRecords(int[] scores) {
		int result[] = new int[2];
		int highest=scores[0];
		int lowest=scores[0];
		int most=0;
		int least=0;
		
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > highest) {
				highest=scores[i];
				most++;
			}else if(scores[i]<lowest){
				lowest=scores[i];
				least++;
			}
		}
		result[0] = most;
		result[1] = least;
		return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
        System.out.println(result[0] +" "+ result[1]);
        scanner.close();
    }
}
