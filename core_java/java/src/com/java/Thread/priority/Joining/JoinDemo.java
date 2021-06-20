package com.java.Thread.priority.Joining;

public class JoinDemo extends Thread {
	public void run() {
		for (int j = 0; j < 6; j++) {

			try {
				Thread.ysleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(j);
		}

	}
}
