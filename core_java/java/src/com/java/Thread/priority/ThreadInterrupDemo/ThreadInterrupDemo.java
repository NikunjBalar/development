package com.java.Thread.priority.ThreadInterrupDemo;

public class ThreadInterrupDemo {
	public static void main(String[] args) {
		InterruptDemo interruptDemo=new InterruptDemo();
		interruptDemo.start();
		interruptDemo.interrupt();
	}
}
