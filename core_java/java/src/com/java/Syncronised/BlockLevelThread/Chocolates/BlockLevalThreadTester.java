package com.java.Syncronised.BlockLevelThread.Chocolates;

public class BlockLevalThreadTester {
	public static void main(String[] args) {
		Chocolates chocolates=new Chocolates();
		ChocolateThread chocolateThread1=new ChocolateThread(chocolates);
		ChocolateThread chocolateThread2=new ChocolateThread(chocolates);

		chocolateThread1.setName("ladu");
		chocolateThread2.setName("lalu");
		
		chocolateThread1.start();
		chocolateThread2.start();
	}
}
