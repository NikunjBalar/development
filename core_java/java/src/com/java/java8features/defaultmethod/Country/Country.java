package com.java.java8features.defaultmethod.Country;

public interface Country {
	default void citizenship() {
		System.out.println("from defolt method");
	}
	static void population() {
		System.out.println("130 lakes");
	}
}
