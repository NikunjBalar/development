package com.java.javabasic.method.Demo;

public class ByUsingObject {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		ByUsingObject md=new ByUsingObject();
		
		int c=md.minimum(a,b);
		System.out.println("minimum of them = "+ c);
	}
	
	public  int minimum(int a, int b) {
		int min;
		
		if(a>b)
			min=b;
		else
			min=a;
		
		return min;
	}
}