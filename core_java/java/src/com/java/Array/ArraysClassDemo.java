package com.java.Array;

import java.util.Arrays;

public class ArraysClassDemo {
	public static void main(String[] args) {
		ArraysClassDemo acd=new ArraysClassDemo();
		acd.arrInt();
		acd.arrChar();
	}
	void arrInt() {
		int[] arr= {3,7,9,1,10,3234,544,231};
		System.out.println("The array befor sorting..");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The array after sorting..");
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	void arrChar() {
		char[] arr1= {'2','d','g','a','r','3','$'};
		System.out.println("the array after sorting");
		
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}
}
