package com.java.Array;

public class JaggedArrayDemo {
	public static void main(String[] args) {
		char[][] names=new char[4][];
		names[0]=new char[5];
		names[1]=new char[4];
		names[2]=new char[2];
		names[3]=new char[3];
		
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				names[i][j]= (char) (i+97);
				System.out.print(names[i][j]);

			}
			System.out.println();
		}
	}
}
