package com.java.Collection.List.Stack;

import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		StackDemo sd=new StackDemo();
		sd.demo();
	}

	void demo() {
		Stack s=new Stack();
		s.push("surat");
		s.push("ahemadabad");
		s.push("amreli");
		s.push("bhavnager");
		s.push("bengalor");
		s.push("goa");
		s.push("mathura");
		s.push("Dwarka");
		s.push("Bilimora");
		s.push("Junagadh");
		s.push("abu");
		
			
		
		ListIterator<String> l=s.listIterator();
		while(l.hasNext()) {
			System.out.print(l.next()+"  ");
		}
		System.out.println("\n growth ratio. current capacity is 10 :- "+s.capacity());
		System.out.println(" calling pop method "+s.pop());
		System.out.println(s);
		System.out.println(s.push("lathi"));

		System.out.println(s.peek());
		System.out.println(s);
		System.out.println("serching a object = " +s.search("ahemadabad"));
		System.out.println("serching a object = " +s.search("bengalor "));

		

	}
}
