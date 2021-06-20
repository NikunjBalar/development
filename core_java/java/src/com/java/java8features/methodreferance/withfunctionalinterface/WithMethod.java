package com.java.java8features.methodreferance.withfunctionalinterface;

import com.java.java8features.methodreferance.intrface.Whatsapp;

public class WithMethod {
	public static void main(String[] args) {
		//Chat chat=new Chat();
		
		Whatsapp w=WithMethod::sendMessage;
		w.sendMessage();
		//Whatsapp w=chat::sendMessage;
		//w.sendMessage();
	}
	static void sendMessage() {
		System.out.println("guys tommorow we dont have class");
	}
}
