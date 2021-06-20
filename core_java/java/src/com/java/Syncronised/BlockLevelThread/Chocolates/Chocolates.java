package com.java.Syncronised.BlockLevelThread.Chocolates;

public class Chocolates {
	public void eat() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+" : Remove cover..");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+" : Throw cover..");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+" : feel the test....");
		}
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				System.out.println(Thread.currentThread().getName()+" : swello");
			}
		}
	}
}
