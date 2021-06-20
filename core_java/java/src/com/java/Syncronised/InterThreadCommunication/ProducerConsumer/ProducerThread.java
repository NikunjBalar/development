package com.java.Syncronised.InterThreadCommunication.ProducerConsumer;

public class ProducerThread extends Thread {
	Godown godown;

	ProducerThread(Godown godown) {
		this.godown = godown;
	}

	@Override
	public void run() {
		try {
			godown.produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
