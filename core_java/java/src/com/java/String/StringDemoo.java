package com.java.String;

public class StringDemoo {
	public static void main(String[] args) {
		
		String str1="java";
		String str2=new String("sql");
		String str3="java";
		String str4=new String("sql");
		String str5=str1;
		String str6=str4;
		
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str1==str3);
		System.out.println(str1==str2);
		System.out.println(str2==str4);
		
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str4));
		
	}
}
