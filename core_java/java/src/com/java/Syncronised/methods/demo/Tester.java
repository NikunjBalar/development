package com.java.Syncronised.methods.demo;

public class Tester {
	public static void main(String[] args) {
		BookMyChairDemo bookMyChairDemo=new BookMyChairDemo();
		ThreadBookMyShow t1=new ThreadBookMyShow(bookMyChairDemo);
		ThreadBookMyShow t2=new ThreadBookMyShow(bookMyChairDemo);
		
		t1.start();
		t2.start();
		
	}
}
