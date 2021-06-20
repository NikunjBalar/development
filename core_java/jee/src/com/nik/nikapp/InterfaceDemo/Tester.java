package com.nik.nikapp.InterfaceDemo;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the light");
		String type=sc.next();
		// consumer utilisation logic
		ISwitch iswitch=LightFactory.getLight(type);
		if(iswitch != null) {
			iswitch.sOn();
			iswitch.sOff();
		}
	}
}
