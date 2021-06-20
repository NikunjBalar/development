package com.java.Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new MyComparator234 ());
		pq.offer(40);
		pq.offer(30);
		pq.offer(20);
		pq.offer(45);
		pq.offer(23);
		pq.offer(45);
		pq.offer(20);
		
		System.out.println(pq);

		pq.size();
		pq.remove();
		System.out.println(pq.size());
		System.out.println(pq);

	}
}

class MyComparator234 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1= (Integer) o1;
		Integer i2= (Integer) o2;
		if (i1<i2) {
			return +1;
		}	
		else if (i1>i2) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
