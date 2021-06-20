package com.java.Exception;

public class FinallyBlockDemo {
	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException n) {
			System.out.println("caught null pointer exception");
		}
		finally {
			System.out.println("Action taken on exception");
		} 
	}
}
