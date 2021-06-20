package com.java.javabasic.method.Methodoverloading;

public class Demo {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.demo();
		d.demo(10);
		d.demo(10, 20);
	}
	
	void demo() {
		System.out.println("zero peram method");
	}
	void demo(int a) {
		System.err.println("one param method");
	}
	void demo(int a, int b) {
		System.err.println("two param method");
	}
}
