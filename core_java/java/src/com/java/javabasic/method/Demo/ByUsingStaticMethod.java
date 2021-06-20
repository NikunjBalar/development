package com.java.javabasic.method.Demo;

public class ByUsingStaticMethod {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=minimum(a,b);
		System.out.println("minimun of them is = "+c);
	}
	
	public static int minimum(int a,int b) {
		int min;
		
		if(a>b)
			min=b;
		else
			min=a;
		
		return min;
	}
}
