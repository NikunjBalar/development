package com.java.java8features.lymdaexpresion;

import com.java.java8features.lymdaexpresion.classes.Sayable;

public class SayableTester {
	public static void main(String[] args) {

		/*
		 * Sayable sayable=()->{System.out.println("Hi");}; sayable.say(); Sayable
		 * sayable1=()->{System.out.println("Hello");}; sayable1.say();
		 */

/*		Sayable sayable = (wish) -> {
			return wish;
		};
		System.out.println(sayable.wish("hi"));
		Sayable sayable1 = (name) -> {
			String s1="hi nikunj";
			
			return s1+name;
		};
		System.out.println(sayable1.wish("\t hello"));
*/
		
		Sayable sayable=(a,b)->{return a+b;};
		System.out.println(sayable.add(10, 20));
	}
}
