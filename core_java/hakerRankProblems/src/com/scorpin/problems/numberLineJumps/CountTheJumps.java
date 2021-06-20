package com.scorpin.problems.numberLineJumps;

import java.io.IOException;
import java.util.Scanner;

/**
 * Purpose : kangaroo 1 starts at x1=2 with a jump distance v1=1 and kangaroo 2
 * starts x2 = 1 at with a jump distance of v2=2. After one jump, they are both
 * at x=3,(x1+v1=2+1,x2+v2=1+2), so our answer is YES.
 * 
 * @author Mahadev
 *
 */
public class CountTheJumps {
	static String kangaroo(int x1, int v1, int x2, int v2) {
		String result = "No";
		int x1v1 = x1;
		int x2v2 = x2;
		if (v1 > v2) {
			while (x1v1 <= x2v2) {
				x1v1 += v1;
				x2v2 += v2;
				if (x1v1 == x2v2) {
					result="YES";
					break;
				}
			}
		}
		else {
			while (x1v1 >= x2v2) {
				x1v1 += v1;
				x2v2 += v2;
				if (x1v1 == x2v2) {
					result="YES";
					break;
				}
			}
		}
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		String[] x1V1X2V2 = scanner.nextLine().split(" ");

		int x1 = Integer.parseInt(x1V1X2V2[0]);

		int v1 = Integer.parseInt(x1V1X2V2[1]);

		int x2 = Integer.parseInt(x1V1X2V2[2]);

		int v2 = Integer.parseInt(x1V1X2V2[3]);

		String result = kangaroo(x1, v1, x2, v2);

		System.out.println(result);

		scanner.close();
	}

}
