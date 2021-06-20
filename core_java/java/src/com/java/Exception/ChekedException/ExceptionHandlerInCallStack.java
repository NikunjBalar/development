package com.java.Exception.ChekedException;

public class ExceptionHandlerInCallStack {
	public static void main(String[] args) {
		try{
			computeDivision(3,0);
		}
		catch(ArithmeticException e) {
			System.out.println("i am exception........... you are lol.......");
		}
	}
	private static  int computeDivision(int a,int b) {
		try{
			return divideByZero(a,b);
		}
		catch(NumberFormatException e) {
			return 0;
		}
	}
	private static int divideByZero (int a,int b) {
		return a/b;
	}
}
