package com.java.abstractoin;
import java.util.Scanner;
import java.util.scanner;
public class Table {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the table");
		int n=s.nextInt();
		int res=0;
		for (int i = 1; i <=10; i++) {
			res=n*i;
			System.out.println(n+" * "+i+" = "+res);
		}
		
		System.out.println("main method ended..");
	}
}
