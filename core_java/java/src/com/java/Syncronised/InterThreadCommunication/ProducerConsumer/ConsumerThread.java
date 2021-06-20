package com.java.Syncronised.InterThreadCommunication.ProducerConsumer;

public class ConsumerThread extends Thread {
	Godown godown;

	ConsumerThread(Godown godown) {
		this.godown = godown;
	}

	@Override
	public void run() {

		try {
			godown.Consumer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
