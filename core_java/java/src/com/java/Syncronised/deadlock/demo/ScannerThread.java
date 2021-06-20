package com.java.Syncronised.deadlock.demo;

public class ScannerThread {
	synchronized void scan(PrinterThrea printer) {
		System.out.println(Thread.currentThread().getName() + " : start Scanning ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
		printer.fillInk();
	}

	void generateSoftCopy() {
		System.out.println(Thread.currentThread().getName() + " : starting generate soft copy");
	}
}
