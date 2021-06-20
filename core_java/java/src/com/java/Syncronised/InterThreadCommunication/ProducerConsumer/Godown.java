package com.java.Syncronised.InterThreadCommunication.ProducerConsumer;

import java.util.LinkedList;

public class Godown {

	LinkedList<Integer> godown = new LinkedList<>();
	int capacity = 2;

	public void produce() throws InterruptedException {
		Integer item = 0;
		while (true) {

			synchronized (this) {
				while (godown.size() == capacity)
					wait();

				System.out.println("Producer is producing product : "+item);
				godown.add(item++);

				notify();
				Thread.sleep(3000);
			}
		}
	}

	public void Consumer() throws InterruptedException {
		while (true) {
			synchronized(this) {
				
			
			while (godown.size() == 0)
				wait();

			System.out.println("Producer is producing product");
			Integer item=godown.removeFirst();
			System.out.println("Consumer conssumr item : "+item);
			notify();
			Thread.sleep(3000);
		}

	}}
}
