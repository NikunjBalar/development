package com.java.Syncronised.deadlock.demo;

public class DeadLockThread extends Thread{
	PrinterThrea printerThrea;
	ScannerThread scannerThread;
	
	public DeadLockThread(	PrinterThrea printerThrea,	ScannerThread scannerThread) {
		this.printerThrea=printerThrea;
		this.scannerThread=scannerThread;
	
	}
	
	
	@Override
	public void run() {
	scannerThread.scan(printerThrea);
	
	}
}
