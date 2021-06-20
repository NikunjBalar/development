package com.java.ObjectClass;

public class HashcodeDemo {
	public static void main(String[] args) {
		Leptop laptop=new Leptop();
		Leptop laptop1=new Leptop();
		Leptop laptop2=laptop;
		System.out.println(laptop.hashCode());
		System.out.println(laptop1.hashCode());
		System.out.println(laptop2.hashCode());
		System.out.println(laptop.equals(laptop1));
	}
}

class Leptop{
	int x=10;
	public int hashCode() {
		return 10;
	}
}
