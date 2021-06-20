package bridglabs.appti.day4;

import java.util.Scanner;

public class StringFunction {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter String1 ");
		String s1 = s.nextLine();
		// System.out.println("enter String2 ");
		// String s2=s.nextLine();
		// anagram(s1,s2);
		pelindrom(s1);
	}

	private static boolean pelindrom(String s1) {
		boolean valid = true;
		char[] ch1 = s1.toCharArray();
		char[] ch2 = new char[ch1.length];
		int j = ch1.length - 1;
		System.out.println(ch2.length);
		for (int i = 0; i < ch1.length; i++) {
			ch2[j--] = ch1[i];

		}
		for (int i = 0; i < ch2.length; i++) {
			if (ch1[i] == ch2[i]) {
				valid = true;
			} else {
				valid = false;
			}
		}
		if (valid) {
			System.out.println("String is pelindrom");
		} else {
			System.out.println("String is not pelindrom");
		}

		return valid;
	}

	private static boolean anagram(String s1, String s2) {
		boolean valid = false;
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		char temp;
		int n = ch1.length;

		if (ch1.length == ch2.length) {
			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch2.length - 1; j++) {
					if (ch1[j] > ch1[j + 1]) {
						temp = ch1[j];
						ch1[j] = ch1[j + 1];
						ch1[j + 1] = temp;
					}
					if (ch2[j] > ch2[j + 1]) {
						temp = ch2[j];
						ch2[j] = ch2[j + 1];
						ch2[j + 1] = temp;
					}
				}
			}
		}
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == ch2[i]) {
				valid = true;
			} else {
				valid = false;
			}
		}
		if (valid) {
			System.out.println("\nboth the String are anagrame");
		}
		return valid;
	}

}