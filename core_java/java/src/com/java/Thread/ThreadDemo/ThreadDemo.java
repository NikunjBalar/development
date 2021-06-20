package com.java.Thread.ThreadDemo;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread demo=new MyThread();
		System.out.println("my thread name is : "+Thread.currentThread().getName());
		System.out.println("my thread priority is : "+Thread.currentThread().getPriority());

		demo.start();
		System.out.println("lol you never trace the output");
		for (int i = 0; i <7; i++) {
			System.out.println(i);
		}
		//demo.run();
		System.out.println("main method nalayak hai tu");
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		Thread.currentThread().setName("i am baby");
		System.out.println("my child thread name is : "+Thread.currentThread().getName());
		System.out.println("my child thread priority is : "+Thread.currentThread().getPriority());
		System.out.println("my child thread name is : "+Thread.currentThread().getClass());

		System.out.println("my child currentThread is : "+Thread.currentThread());
		System.out.println("childe method Started");
		for (int i = 0; i <9; i++) {
			System.out.println(i);
		}
		System.out.println("child method ended");
	}
	@Override
	public synchronized void start() {
		super.start();
	}
}