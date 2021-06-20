package com.java.javabasic.Operaters;

public class AssignmentDemo {
	
	int a=20;
	int b=10;
	int c;
	public static void main(String[] args) {
		AssignmentDemo ad=new AssignmentDemo();
		ad.equalsTo();
	/*	ad.pluseEqualsTo();
		ad.diffEqualsTo();
		ad.multiflicationEqualsTo();
		ad.divisionEqualsTo();
		ad.modulousEqualsTo();*/
		ad.leftShiftEqualsTo();
		
	}
	
	void equalsTo() {
		c=20;
		System.out.println("c : "+c); //10
	}
	
	void pluseEqualsTo() {
		byte i=10;
		byte j=20;
		i+=j;
		i=i+j; //error
	//	i=(byte) (i+j);  //type conversion
		a+=4;
		System.out.println("i : "+i);
		System.out.println("a : "+a); //24
	}
	
	void diffEqualsTo() {
		b-=4;
		System.out.println("b : "+b); // 6=10-4;
	}
	
	void multiflicationEqualsTo() {
		c*=b;
		System.out.println("c : "+c); //60=10*6;
	}
	
	void divisionEqualsTo() {
		c/=b;
		System.out.println("c : "+c); //10=60/6;
	}
	
	void modulousEqualsTo() {
		c%=b;
		System.out.println("c : "+c); //4=10/6
	}
	
	void leftShiftEqualsTo() {
		c<<=2;
		System.out.println("c : "+c);
		System.out.println("b : "+b);
	}
}
