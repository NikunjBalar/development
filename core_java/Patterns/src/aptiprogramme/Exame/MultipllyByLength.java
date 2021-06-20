package aptiprogramme.Exame;

import java.util.Scanner;

public class MultipllyByLength {
	public static void main(String[] args) {
		MultipllyByLength mbl = new MultipllyByLength();
		mbl.arrayLength();
	}
	void arrayLength() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter length of array");
		int n = s.nextInt();
		int ar[] = new int[n];
		System.out.println("enter element of array");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = s.nextInt();
			// System.out.println(ar[i]);
		}
		int res = 1;
		System.out.println(ar[0]);
		for (int i = 1; i < ar.length; i++) {
			res = res * 2;
			ar[i] *= res;
			System.out.println(ar[i]);
		}
	}
}
