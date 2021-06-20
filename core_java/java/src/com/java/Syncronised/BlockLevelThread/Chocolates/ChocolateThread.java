package com.java.Syncronised.BlockLevelThread.Chocolates;

public class ChocolateThread extends Thread{

	Chocolates chocolates;
	
	public ChocolateThread(Chocolates chocolates) {
		this.chocolates=chocolates;
	}
	@Override
	public void run() {
		chocolates.eat();
	}
}
