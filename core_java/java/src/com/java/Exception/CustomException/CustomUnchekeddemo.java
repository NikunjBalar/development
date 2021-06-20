package com.java.Exception.CustomException;

public class CustomUnchekeddemo {
	public static void main(String[] args) {
		Bank b= new Bank();
		try {
			b.meetManager();
		}
		catch(BankExp be) {
			System.out.println(be);
		}
	}
}

class BankExp extends RuntimeException{
	public String toString() {
		return "manager not found";
	}
}

class Bank{
	boolean isManagerPresent = false;
	void meetManager() {
		if(isManagerPresent) {
			System.out.println("hello Manager..");
		}
		else {
			BankExp b=new BankExp();
			throw b;
		}
	}
}