package com.java.Array;

public class CustomArryDemo {
	public static void main(String[] args) {
		Sada sada =new Sada();
		Chetan chetan =new Chetan();
		Siddhu siddhu=new Siddhu();
		Object[] transformer=new Object[3];
		transformer[0]=sada;
		transformer[1]=chetan;
		transformer[2]=siddhu;
		Chetan c= (Chetan) transformer[1];
		System.out.println(c.name);
	}
}
class Sada{
	String name = "Leader";
	String status = "unmerrid";
	
}
class Chetan{
	String name = "lalu";
	String ststus= "unmerid";
}
class Siddhu{

	String name = "siddhu";
	String ststus= "unmerid";

}