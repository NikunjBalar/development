package com.java.Exception.WithMethodOverriding;

import java.io.IOException;

public class SecondRuleWithMethodOverriding {
	public static void main(String[] args) throws IOException{
		Leptop c=new Leptop();
		c.hardDiskSize();
		System.out.println("50");
	}
}
class Computer{
	int hardDiskSize() {
		return 100;
	}
}

class Leptop extends Computer{
	int hardDiskSize()  throws ArithmeticException {
		return 50;
	}
}