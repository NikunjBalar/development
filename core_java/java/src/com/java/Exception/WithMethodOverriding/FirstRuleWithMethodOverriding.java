package com.java.Exception.WithMethodOverriding;

import java.io.IOException;

public class FirstRuleWithMethodOverriding {
	public static void main(String[] args) throws IOException {
		Child c=new Child();
		c.m1();
	}
}

class Parent{
	void m1() throws IOException{
		System.out.println("perent method");
	}
}

class Child extends Parent {
	void m1() {
		System.out.println("Child method");
	}
}
