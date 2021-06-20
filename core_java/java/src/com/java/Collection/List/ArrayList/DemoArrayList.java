package com.java.Collection.List.ArrayList;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("pawan");
		arraylist1.add("charanjeet");
		arraylist1.add("rachana");
		arraylist1.add("rohit");

		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.addAll(arraylist1);
		arrayList2.add("nikunj");
		arrayList2.add("shahzad");

		System.out.println(arraylist1);
		System.out.println("---------");
		System.out.println(arrayList2);

		System.out.println(arrayList2.set(1, "nikunj"));
		System.out.println(arrayList2);
	}
}