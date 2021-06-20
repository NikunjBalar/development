package com.java.Polymerphysum;

public class Compiletime {
	public static void main(String[] args) {
		System.out.println("main method started...\n");
		Animal.sleep();
		Animal.sleep(8);
		System.out.println("\n main method ended...");
	}
}

class Animal{
	void makeNoise() {
		System.out.println("Animal is making noise");
	}
	void makenoise(String type) {
		System.out.println("Making noise...");
	}
	static void sleep() {
		System.out.println("Animal is sleeping");
	}
	static void sleep(int hr) {
		System.out.println("Animal is sleeping "+hr+" hours");
	}
}