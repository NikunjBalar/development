package com.java.abstractoin;

public class AbstractDemo {
	public static void main(String[] args) {
		System.out.println("mms");
		Pen p=new cello();
		Pen p1=new Flair();
		System.out.println("The color of cello pen..:");
		p.ink();
		System.out.println("The color of Flair Pen..:");
		p1.ink();		
		System.out.println("mme");
	}
}
abstract class Pen{
	void writing() {
		System.out.println("Writing ...");
	}
	abstract void ink();
}
class cello extends Pen{
	void ink() {
		System.out.println("blue ");
	}
}
class Flair extends Pen{
	void ink() {
		System.out.println("black");
	}
	
}