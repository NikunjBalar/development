package com.java.Syncronised.deadlock.demo;

public class PrinterThrea {
	synchronized void print(ScannerThread s) {
		System.out.println(Thread.currentThread().getName()+" : start edxicution of print method");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		s.generateSoftCopy();
	}

	void fillInk() {
System.out.println(Thread.currentThread().getName()+" : start exicuting fillInk Method");
	
	}
	
}
