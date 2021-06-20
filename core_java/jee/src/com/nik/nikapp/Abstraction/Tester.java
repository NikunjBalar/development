package com.nik.nikapp.Abstraction;

public class Tester {
	public static void main(String[] args) {
		IRemote imp=Factory.getAc1("LG");
		imp.turnOn();
		imp.turnOff();
		IRemote imp1=Factory.getAc1("Samsung");
		imp1.turnOn();
		imp1.turnOff();
		
	}
}

interface IRemote{
	void turnOn();
	abstract void turnOff();
}

class LGIMP implements IRemote{
	public void turnOn() {
		System.out.println("lg ac on");
	}

	public void turnOff() {
		System.out.println("lg ac off");
	}
}

class SamsungIMP implements IRemote{
	public void turnOn() {	
		System.out.println("samsung ac on");
	}
	public void turnOff() {	
		System.out.println("Samsung ac off");
	}
}

class Factory {
	// implimentation object
	public static IRemote getAc1(String type) {
		if(type.equalsIgnoreCase("LG")) {
			return new LGIMP();
		}
		if(type.equalsIgnoreCase("Samsung")) {
			return new SamsungIMP();
		}
		else {
			return null;
		}
	}
}