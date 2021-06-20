package bridglabs.appti.day5;

import java.util.Scanner;

public class MathFunction {

	static boolean isPrime(int n) {
		boolean prime = false;
		int count = 0;

		if (n > 2 && n % 2 == 0) {
			prime = false;
		} else if (n != 0 && n != 1) {
			for (int i = 3; i < n; i++) {
				if (n % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				prime = true;
			}
		}
		return prime;
	}

	private static long factorial(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;

		// System.out.println(fact);
		return fact;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = s.nextInt();
		int n1 = Integer.parseInt(args[0]);
		System.out.println("prime number " + isPrime(n));

		System.out.println("factorial " + factorial(n1));
	}

}
