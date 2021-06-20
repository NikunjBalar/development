package com.java.java8features.Stream.customexample;

public  class Student implements Comparable<Student>{
	String name;
	int marks;

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public Student(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}

	public int compareTo(Student o) {
		int mark1=this.marks;
		int mark2=o.marks;
		
		if(mark1>mark2) 
			return -1;
		
		else if(mark1<mark2)
			return +1;
		else
			return 0;	
	}
}
