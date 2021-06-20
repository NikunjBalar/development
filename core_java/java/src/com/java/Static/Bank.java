package com.java.Static;

public class Bank {
	public static void main(String[] args) {
		Bank.creatAccount();
		Sbi.creatAccount();
		
	}
	
	static String name;
	static String ifccode;
	
	static public void creatAccount() {
		System.out.println("creating account");
	}
	
	static {
		System.out.println("thank you visit again");
	}
}

class Sbi extends Bank{
	static public void creatAccount() {
		System.out.println("creating  new account");
	}
}