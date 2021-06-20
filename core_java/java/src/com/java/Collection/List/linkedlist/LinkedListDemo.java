package com.java.Collection.List.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add(null);
		
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.remove(2);
		ll.addFirst("nik");
		ll.addLast("kunj");
		System.out.println("first object :"+ll.getFirst());
		ll.offer("p");


		Iterator<String> i=ll.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
			i.remove();
			System.out.println();
		}
	}
}
