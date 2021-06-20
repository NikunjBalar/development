package com.nik.appti;

public class PriimeNumber {
	public static void main(String[] args) {
		System.out.println("main methos started");
		prime();
	}

	static void prime() {
		int n = 8;
		int count = 0;

		if (n != 0 && n != 1) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					count++;
					System.out.println("not prime");
				}
				
			}
			if (count == 0) {
				System.out.println(n+" is a prime number ");
			}
		} else if(count!=0){
			System.out.println("it is not a prime number");
		}

	}
}
