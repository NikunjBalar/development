package com.java.Polymerphysum;

public class Runtime {
	public static void main(String[] args) {
		System.out.println("main method start...");
		Phone p1=new Phone();
		p1.makingCall();
		p1.recivingCall();
		System.out.println("----");
		
		p1=new SmartPhone();
		p1.makingCall();
		p1.recivingCall();
		
		System.out.println("main method ended...");
	}
}

class Phone{
	void makingCall() {
		System.out.println("Calling....");
	}
	void recivingCall() {
		System.out.println("reciving call....");
	}
}

class SmartPhone extends Phone{
	void makingCall() {
		System.out.println("video Calling....");
	}
	void recivingCall() {
		System.out.println("reciving video call....");
	}
}