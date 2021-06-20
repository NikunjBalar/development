package com.scorpin.problems.sumOfIntArrayInLong;

import java.io.IOException;
import java.util.Scanner;

public class SumOfIntStoredInLong {
	
	static long aVeryBigSum(long[] arr) {
		long sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		return sum;
    }
	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	  //      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int arCount = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        long[] ar = new long[arCount];

	        String[] arItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < arCount; i++) {
	            long arItem = Long.parseLong(arItems[i]);
	            ar[i] = arItem;
	        }

	        long result = aVeryBigSum(ar);
	        System.out.println(result);

	    //    bufferedWriter.write(String.valueOf(result));
	      //  bufferedWriter.newLine();

	        //bufferedWriter.close();

	        scanner.close();
	    }
}