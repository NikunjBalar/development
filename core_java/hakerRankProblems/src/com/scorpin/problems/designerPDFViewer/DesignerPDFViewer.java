package com.scorpin.problems.designerPDFViewer;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Purpose :
 * 
 * Input :
 * 
 * 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
 * 
 * abc
 * 
 * Output : 9
 * 
 * Explanation:
 * 
 * We are highlighting the word abc:
 * 
 * Letter heights are a=1, b=3 and c=1. The tallest letter, b, is 3mm high. The
 * selection area for this word is 3* 1mm*3mm=9mm.
 * 
 * Note: Recall that the width of each character is 1mm.
 * 
 * @author Nikunj Balar
 *
 */
public class DesignerPDFViewer {

	static char[] CHARACTER = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	static int designerPdfViewer(int[] h, String word) {
		HashMap<Character, Integer> hights = new HashMap<>();
		for (int i = 0; i < h.length; i++) {
			hights.put(CHARACTER[i], h[i]);
		}
		int tallest = 0;
		char[] arr = word.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (tallest < hights.get(arr[i])) {
				tallest = hights.get(arr[i]);
			}
		}

		return arr.length * 1 * tallest;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] h = new int[26];

		String[] hItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 26; i++) {
			int hItem = Integer.parseInt(hItems[i]);
			h[i] = hItem;
		}

		String word = scanner.nextLine();

		int result = designerPdfViewer(h, word);

		System.out.println(result);
		scanner.close();
	}
}