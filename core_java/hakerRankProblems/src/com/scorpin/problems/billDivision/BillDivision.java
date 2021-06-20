package com.scorpin.problems.billDivision;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/**
 * Purpose : assume the bill has the following prices: bill=[2,4,6]. Anna
 * declines to eat item k=bill[2] which costs 6. If Brian calculates the bill
 * correctly, Anna will pay (2+4)/2=3. If he includes the cost of bill[2], he
 * will calculate (2+4+6)/2=6. In the second case, he should refund 3 to Anna.
 * 
 * @author Nikunj Balar
 *
 */
public class BillDivision {
	static void bonAppetit(List<Integer> bill, int k, int b) {
		int total=0;
		for (int i = 0; i < bill.size(); i++) {
			if (i != k) {
				total+=bill.get(i);
			}
		}
		total=total/2;
		if (b - total == 0) {
			System.out.println("Bon Appetit");
		}
		else {
			System.out.println(b-total);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int b = Integer.parseInt(bufferedReader.readLine().trim());

		bonAppetit(bill, k, b);

		bufferedReader.close();
	}
}
