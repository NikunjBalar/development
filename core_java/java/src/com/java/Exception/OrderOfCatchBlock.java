package com.java.Exception;

public class OrderOfCatchBlock {
	public static void main(String[] args) {
		OrderOfCatchBlock cb = new OrderOfCatchBlock();
		cb.orderOfBlock();
	}

	void orderOfBlock() {
		try {
			int[] arr = new int[1];
			System.out.println(arr[1]);

		}/*catch (Exception a) {
			System.out.println("Exception");
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(" ArrayIndexOutOfBoundsException");
		} */catch (RuntimeException a) {
			System.out.println("RunTimeException");
		} 
	}
}
