package com.java.Thread.priority.SleepMethod;

public class MyThread extends Thread{
	public void run() {
	
		for (int i = 0; i <10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("good morning smily");
		}
	}
}
