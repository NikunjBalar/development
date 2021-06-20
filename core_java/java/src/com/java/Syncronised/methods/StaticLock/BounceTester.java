package com.java.Syncronised.methods.StaticLock;

public class BounceTester {
	public static void main(String[] args) {
		BounceDemo bounceDemo=new BounceDemo();
		BounceThread bounceThread1=new BounceThread(bounceDemo);
		BounceThread bounceThread2=new BounceThread(bounceDemo);
		
		bounceThread1.setName("siddu");
		bounceThread2.setName("smile");
		
		bounceThread1.start();
		bounceThread2.start();

	}
}
