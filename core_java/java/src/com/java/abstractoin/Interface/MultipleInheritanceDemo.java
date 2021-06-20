package com.java.abstractoin.Interface;

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		System.out.println("mms");
		TaxCalculator t=new TaxCalculator();
		t.fuelTax();
		t.raodTax();
		System.out.println("mme");
	}
}
interface CentralTax{
	void raodTax();
}
interface StateTax{
	void fuelTax();
}
class TaxCalculator implements CentralTax,StateTax{
	public void fuelTax() {
		System.out.println("Calculator state tax");	
	}
	public void raodTax() {
		System.out.println("Calculated central tax");	
	}
}
