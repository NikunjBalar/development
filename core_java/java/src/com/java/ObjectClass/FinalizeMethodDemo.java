package com.java.ObjectClass;

public class FinalizeMethodDemo {
	public static void main(String[] args) {
		Airplane a = new Airplane();
		a = null;

		System.gc();
		System.out.println("main complated");
	}

}

class Airplane {
	int i = 10;

	protected void finalize() {
		System.out.println("finalize method get called..");
	}
}