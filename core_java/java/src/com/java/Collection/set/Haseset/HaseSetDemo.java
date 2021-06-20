package com.java.Collection.set.Haseset;

import java.util.HashSet;

public class HaseSetDemo {
	public static void main(String[] args) {
		Demo hsd=new Demo();
		hsd.emailIds();
	}
}

class Demo{
	void emailIds() {
		HashSet<String> setOfEmailIds=new HashSet<String>();
		setOfEmailIds.add("error123@gmail.com");
		setOfEmailIds.add("exception34@gmail.com");
		setOfEmailIds.add("collection34@gmail.com");
		setOfEmailIds.add("jee34@gmail.com");
		setOfEmailIds.add("error123@gmail.com");
		setOfEmailIds.add("sql34@gmail.com");

		java.util.Iterator<String> itr=setOfEmailIds.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}