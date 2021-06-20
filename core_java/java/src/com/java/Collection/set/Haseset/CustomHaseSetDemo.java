package com.java.Collection.set.Haseset;

import java.util.HashSet;

public class CustomHaseSetDemo {
	public static void main(String[] args) {
		HashSet<Aadhar> setDetails=new HashSet<Aadhar>();
		Aadhar ad1=new Aadhar(10009898093840983l,"nikunj","surat");
		Aadhar ad2=new Aadhar(10009898093840983l,"kunj","surat");
		Aadhar ad3=new Aadhar(10009898093840983l,"nik","surat");
		Aadhar ad4=new Aadhar(10009898093840983l,"niku","surat");
		Aadhar ad5=new Aadhar(10009898093840983l,"nikunj","surat");

		setDetails.add(ad1);
		setDetails.add(ad2);
		setDetails.add(ad3);
		setDetails.add(ad4);
		setDetails.add(ad5);

	}
}

class Aadhar{
	long number;
	String name;
	String add;
	
	Aadhar(long number,String name,String add){
		this.number=number;
		this.name=name;
		this.add=add;
		
	}
}