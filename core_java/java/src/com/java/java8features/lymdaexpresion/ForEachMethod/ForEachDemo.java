package com.java.java8features.lymdaexpresion.ForEachMethod;

import java.util.ArrayList;

public class ForEachDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Desi katta");
		list.add("sniper");
		list.add("AK47");
		list.add("rocket");
		list.add("pistol");
		list.forEach((w)->{
			System.out.println(w);
		});
		
	}
}
