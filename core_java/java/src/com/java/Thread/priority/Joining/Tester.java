package com.java.Thread.priority.Joining;


public class Tester {
	public static void main(String[] args) {
		JoinDemo joinDemo1=new JoinDemo();
		JoinDemo joinDemo2=new JoinDemo();
		JoinDemo joinDemo3=new JoinDemo();

		joinDemo1.start();
		try {
			joinDemo1.join();
		} catch (InterruptedException e) {
			System.err.println(e);
		}
		joinDemo2.start();
		joinDemo3.start();
		
	}
}
