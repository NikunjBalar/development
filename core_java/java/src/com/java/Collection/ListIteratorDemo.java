package com.java.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		ListIteratorDemo lid=new ListIteratorDemo();
		lid.demo();
	}
	
	void demo() {
		ArrayList<String> metal=new ArrayList<String>();
		metal.add("mercurey");
		metal.add("gold");
		metal.add("silver");
		metal.add("platinum");
		metal.add("iron");
		
		ListIterator<String> li=metal.listIterator();
		while(li.hasNext()) {
			if (li.nextIndex()==3) {
				li.add("rose gold");
			}
			else if(li.next().equals("silver")) {
				li.set("silver man");
			}
			else if(li.next().equals("iron")) {
				li.remove();
			}
		}
		
		System.out.println(metal);
	}
}
