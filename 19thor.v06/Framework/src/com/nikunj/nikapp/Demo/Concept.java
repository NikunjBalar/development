package com.nikunj.nikapp.Demo;

public class Concept {
	public static void main(String[] args) {
		Leptop leptop = new Leptop();
		leptop.setBrandName("Dell");
		leptop.setModelName("inspiron");
		leptop.setPrice(25000.4523);
		
		System.out.println(leptop.getBrandName());
		System.out.println(leptop.getModelName());
		System.out.println(leptop.getPrice());
	}
	
}
