package com.java.WrapperClass;

public class ParsingDemo {
	public static void main(String[] args) {
		ParsingDemo pd=new ParsingDemo();
		pd.intParsing();
		pd.booleanParsing();
		
	}
	void intParsing(){
		String s1="10";
		String s2="20";
		System.out.println("Befor parsingb :"+(s1+s2));
		
		Integer i1=Integer.parseInt(s1);
		Integer i2=Integer.parseInt(s2);

		System.out.println("After parsing :"+(i1+i2));
	}
	void booleanParsing() {
		String s1="book";
		String s2="false";
		System.out.println("Befor parsingb :"+(s1+s2));

		Boolean b1=Boolean.parseBoolean(s1);
		Boolean b2=Boolean.parseBoolean(s2);
		System.out.println("After parsing :"+b1+b2);
	}
}
