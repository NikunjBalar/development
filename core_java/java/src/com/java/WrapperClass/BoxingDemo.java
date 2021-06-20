package com.java.WrapperClass;

public class BoxingDemo {
	public static void main(String[] args) {
		BoxingDemo bd=new BoxingDemo();
		bd.autoBoxing();
		bd.manualBoxing();
	}
	void autoBoxing() {
		int i=10;
		Integer j=i;
		System.out.println("i : "+i);
		System.out.println("j : "+j);
	}
	void manualBoxing() {
		int a=20;
		Integer j=new Integer(a);
		System.out.println("a : "+a);
		System.out.println("j : "+j);
	}
}
