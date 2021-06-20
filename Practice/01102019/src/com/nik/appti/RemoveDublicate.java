package com.nik.appti;

public class RemoveDublicate {
	public static void main(String[] args) {
		System.out.println("main method started ");
		dublicate();
	}

	static void dublicate() {
		String s = "nikunj";
		char[] ch = s.toCharArray();
		char temp;

		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] > ch[i + 1]) {
				temp = ch[i];
				ch[i] = ch[i + 1];
				ch[i + 1] = temp;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==ch[i+1]) {
				break;
			}
			else {
				System.out.print(ch[i]);
			}
		}
	}
}
