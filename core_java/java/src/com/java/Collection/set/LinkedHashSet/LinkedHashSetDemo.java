package com.java.Collection.set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> swapid=new LinkedHashSet<Integer>();
		swapid.add(110);
		swapid.add(111);
		swapid.add(106);
		swapid.add(10);
		swapid.add(0110);
		swapid.add(109);
		swapid.add(111);
		swapid.add(1107);

		for(Integer i: swapid) {
			System.out.println(i);
		}
	}
}
