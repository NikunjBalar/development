package com.java.Thread.priority.ThreadInterrupDemo;

public class InterruptDemo extends Thread{
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("shuprabhat");
		}
		
		for (int i = 0; i <5; i++) {
			System.out.println("Shubh savar");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("i am interrupted ");
			}
		
		}
	}
}
