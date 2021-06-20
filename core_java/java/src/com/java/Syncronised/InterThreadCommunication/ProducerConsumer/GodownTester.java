package com.java.Syncronised.InterThreadCommunication.ProducerConsumer;

public class GodownTester {
	public static void main(String[] args) throws InterruptedException {
		Godown godown=new Godown();
		ProducerThread pt=new ProducerThread(godown);
		ConsumerThread ct=new ConsumerThread(godown);
		
		pt.start();
		ct.start();
		
		//pt.join();
		//ct.join();
	}
}
