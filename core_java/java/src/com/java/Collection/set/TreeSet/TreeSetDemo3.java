package com.java.Collection.set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new MyComparator3());
		ts.add("sunil");
		ts.add("paras");
		ts.add("rakesh");
		ts.add("nikunj");
		ts.add("manu");
		ts.add("sangmesh");
		System.out.println(ts);
	}
}

class MyComparator3 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		if(s1.length() < s2.length()) {
			return +1;
		}
		else if(s1.length() > s2.length()) {
			return -1;
		}
		else {
			return s1.compareTo(s2);
		}
	}
}