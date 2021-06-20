package com.java.Collection;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Character> ts=new TreeSet<Character>();
		ts.add('n');
		ts.add('i');
		ts.add('k');
		ts.add('u');
		ts.add('n');
		ts.add('j');
	//	ts.add("nikunj");
		
		for (Character c:ts) {
			System.out.println(c);
		}
	}
}
