package com.java.Syncronised.methods.StaticLock;

public class BounceDemo {
	public static void bookBounceBike() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " : bike book successfuly");
		}
	}

	public static void unlockedBike() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " : unlocked the bike ");
		}
	}

	public static synchronized void startide() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " : start your ride");
		}
	}

	public synchronized void endRide() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " : ride ended");
		}

	}
}
