package com.java.java8features.methodreferance.withfunctionalinterface;

import com.java.java8features.methodreferance.intrface.Whatsapp;

public class WithCounstructor {
	WithCounstructor() {
		System.out.println("calling counstructor");
	}
	public static void main(String[] args) {
		Whatsapp chat=WithCounstructor::new;
		chat.sendMessage();
	}
}
