
package com.java.Exception;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("main method Started");
		ExceptionDemo e=new ExceptionDemo();
		e.demo();
		System.out.println("main method ended");
	}
	void demo() {
		int a=10;
		int b=0;
		//int c=a/b; its throw exception
		try{
			int c=a/b;
		}
		catch(ArithmeticException ee) {
			System.out.println("Statement to hendal an ArithmeticException");
		}
		/*finally {
			System.out.println("take action on exception");
		}*/
	}
}
