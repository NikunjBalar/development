package com.java.Thread.usingRunnable;

public class RunnableTester {
	public static void main(String[] args) {
		System.out.println("main method Started");
		DemoRunnable demoRunnable = new DemoRunnable();
		Thread thread = new Thread(demoRunnable);
		Thread thread2 = new Thread();

		thread2.start();
		thread2.run();
		thread.start();
		thread.run();
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println("main method Ended");
	}
}