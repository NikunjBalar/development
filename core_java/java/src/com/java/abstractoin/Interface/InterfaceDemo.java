package com.java.abstractoin.Interface;

public class InterfaceDemo {
	public static void main(String[] args) {
	 System.out.println("mms");
	 Computer c=new Computer();
	 Printer s=new Sony();
	 Epson e=new Epson();
	 c.slot(s);
	 c.slot(e);
	 System.out.println("mme");
	}
}
interface Printer{
	void Print();
}
class Sony implements Printer{
	public void Print() {
		System.out.println("Printing from sony ");
	}
}
class Epson implements Printer{
	@Override
	public void Print() {
		System.out.println("printing from Epson");	
	}
}
class Computer{
	void slot(Printer p) {
		p.Print();
	}
}