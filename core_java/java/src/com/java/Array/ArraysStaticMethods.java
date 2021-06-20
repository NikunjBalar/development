package com.java.Array;

import java.util.Arrays;

public class ArraysStaticMethods {
	public static void main(String[] args) {
		ArraysStaticMethods ae=new ArraysStaticMethods();
		ae.arrayEqualse();
	}
	void arrayEqualse() {
		int[] a1= {1,2,3,4,5};
		int[] a2= {1,3,4,5};
		
		Arrays.fill(a1, 3);
		
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(Arrays.binarySearch(a2, 4));
		System.out.print(Arrays.toString(a1));
	}
}
