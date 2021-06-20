package com.java.Static;

public class StaticDemo {
	public static void main(String[] args) {
		Shape s=null;
		static int i=11;
		System.out.println(s.i);
	}
}
class Shape{
	static int i=10;
}
