package com.java.Collection.set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>(new MyComparator());
		ts.add(50);
		ts.add(23);
		ts.add(56);
		ts.add(43);
		/*ts.add(78);
		ts.add(32);*/
		
		System.out.println(ts);
/*		System.out.println(10.compareTo("S"));
		System.out.println(Object 01.compareTo(Object 02));
		
		for (Character c : ts) {
			System.out.println(c);
		}*/
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1>i2) {
			return +1;
		}
		else if(i1<i2) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}