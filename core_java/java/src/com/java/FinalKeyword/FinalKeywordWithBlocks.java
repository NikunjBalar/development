package com.java.FinalKeyword;

public class FinalKeywordWithBlocks {
	final int I;
	static final int J;
	{
		I=10;
		
	}
	static {
		J=20;
	}
	
	public static void main(String[] args) {
		FinalKeywordWithBlocks fb=new FinalKeywordWithBlocks();
		System.out.println(" I : "+fb.I);
		System.out.println(" J : "+fb.J);
	}
}

