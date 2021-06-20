package com.java.Collection.set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithNonComparableObjects {
	public static void main(String[] args) {
	/*	TreeSet<StringBuffer> tsb=new TreeSet<StringBuffer>(new MyComparator());
		tsb.add(new StringBuffer("A"));
		tsb.add(new StringBuffer("Z"));
		tsb.add(new StringBuffer("F"));
		tsb.add(new StringBuffer("R"));
		tsb.add(new StringBuffer("D"));
		
		System.out.println(tsb);*/
		
		TreeSet<StringBuilder> tsb2=new TreeSet<StringBuilder>(new MyComparator());
		tsb2.add(new StringBuilder("10"));
		tsb2.add(new StringBuilder("56"));
		tsb2.add(new StringBuilder("342"));
		tsb2.add(new StringBuilder("54"));
		tsb2.add(new StringBuilder("567"));
		
		System.out.println(tsb2);
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		System.out.println(s1+"&"+s2+"=" + s1.compareTo(s2));
		return s1.compareTo(s2);
	}
	

}


