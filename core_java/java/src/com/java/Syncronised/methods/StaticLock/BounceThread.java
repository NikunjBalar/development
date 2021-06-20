package com.java.Syncronised.methods.StaticLock;

public class BounceThread extends Thread{
BounceDemo bounceDemo;
public BounceThread(BounceDemo bounceDemo) {
	this.bounceDemo=bounceDemo;
}
@Override
	public void run() {
	BounceDemo.bookBounceBike();
	BounceDemo.startide();
	bounceDemo.endRide();
	BounceDemo.unlockedBike();
	}
}
