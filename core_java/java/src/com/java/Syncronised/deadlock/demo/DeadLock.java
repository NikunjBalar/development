package com.java.Syncronised.deadlock.demo;

public class DeadLock {
public static void main(String[] args) {
	Thread.currentThread().setName("main");
	PrinterThrea printerThrea=new PrinterThrea();
	ScannerThread scannerThread=new ScannerThread();
	DeadLockThread deadLockThread=new DeadLockThread(printerThrea ,scannerThread);

	deadLockThread.setName("child");
	deadLockThread.start();
	printerThrea.print(scannerThread);
}
}
