package com.java.javabasic.DataType;

public class DataTypeDemo {
	static char a;
	public static void main(String[] args) {
		byte bt=127;
		short s=32767;
		int i=2147483647;
		long l=9925331091l;
		float f=300.0099f;
		double d=39839.3274683287387349837;
		char c='a';
		boolean bl=true;
		
		System.out.println(bt+s);
		System.out.println(bt+f);
		System.out.println(bt+c);
		//System.out.println(bt+bl);
		System.out.println(f+d);
		System.out.println(f+c);
		System.out.println(c+f);
		//System.out.println(f+bl);
		//System.out.println(c+bl);
		System.out.println(bl);
		System.out.println(a);
		System.out.println(i+l);
		System.out.println("value="+s+bt);
		System.out.println(bt+s+"value");


	}
}
