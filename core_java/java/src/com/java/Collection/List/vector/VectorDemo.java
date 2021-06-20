package com.java.Collection.List.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		VectorDemo v=new VectorDemo();
		v.demo();
	}
	
	void demo() {
		Vector v=new Vector();
		v.addElement("nik");
		v.addElement("ushafan");
		v.addElement("bajajfan");
		v.addElement("orientfan");

		
		v.add("nik");
		System.out.println("get method ="+v.get(1));
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ,");
		}
		
		System.out.println("\n capacity ="+v.capacity());
		System.out.println("first elements :"+ v.firstElement());
		v.insertElementAt("fan", 2);
		System.out.println(v);
	}
}
