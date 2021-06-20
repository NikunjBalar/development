package aptiprogramme.Exame;

import java.util.*;

public class Anagramme {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter first string...");
		String line1 = s.nextLine();
		System.out.println("enter comparative string....");
		String line2 = s.nextLine();

		Anagramme ag = new Anagramme();
		ag.anagrame(line1, line2);
	}

	void anagrame(String line1, String line2) {
		char[] ch1 = line1.toCharArray();
		char[] ch2 = line2.toCharArray();
		int count = 0;
		if (ch1.length == ch2.length) {
			for (int i = 0; i < ch1.length; i++) {
				for (int j = 0; j < ch2.length; j++) {
					if (ch1[i] == ch2[i]) {
						count++;
					} else {
						System.out.print("");
					}
				}
			}
			System.out.println(count);
		}
		if (count == ch1.length) {
			System.out.println("String is ansgrame");

		} else {
			System.out.println("String is not anagramme");
		}
	}
}