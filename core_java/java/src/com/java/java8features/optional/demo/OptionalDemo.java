package com.java.java8features.optional.demo;

import java.util.Optional;

public class OptionalDemo {
public static void main(String[] args) {
	String s1=null;
	String s2="lalu";
	
	Optional result=Optional.ofNullable(s1);
	if(result.isPresent()) {
		System.out.println(result.get());
	}
	Optional result2=Optional.ofNullable(s2);
	if(result2.isPresent()) {
		System.out.println(result2.get());
	}
	String res=(String) result.orElse("String 2 is null");
	System.out.println(res);
	
	//System.out.println(result);
	//System.out.println(s2.length());
}
}
