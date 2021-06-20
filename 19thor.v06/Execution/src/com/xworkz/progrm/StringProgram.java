package com.xworkz.progrm;

public class StringProgram {
	public static void main(String[] args) {
		int count=0;
		String str="This This is a a java program program";
		char[] ch=str.toCharArray();
		
		for (int i = 0; i < ch.length-1; i++) {
			for (int j =i+1; j < ch.length-1; j++) {
				if(ch[i]==ch[j]) {
					count++;

					System.out.println("This"+ch[i]);
					
				}
			}
		}
	}
}
