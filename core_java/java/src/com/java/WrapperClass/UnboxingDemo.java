package com.java.WrapperClass;

public class UnboxingDemo {
	public static void main(String[] args) {
		UnboxingDemo ubd=new UnboxingDemo();
		ubd.autoUnboxing();
		ubd.manualUnboxing();
	}
	void autoUnboxing() {
		Integer i=10;
		int j=i;
		System.out.println("i : "+i);
		System.out.println("j : "+j);
	}
	void manualUnboxing() {
		Integer a=200;
		int b=a.intValue(); 
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}
