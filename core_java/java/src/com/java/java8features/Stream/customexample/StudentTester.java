package com.java.java8features.Stream.customexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTester {
	public static void main(String[] args) {
		Student s1=new Student("nik",13);
		Student s2=new Student("mannu",35);
		Student s3=new Student("vijay",45);
		Student s4=new Student("paras",40);
		Student s5=new Student("nikunj",16);
		
		ArrayList<Student> students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		System.out.println("list of object");
		students.forEach(System.out::println);
		
		System.out.println("faild student");
		students.stream()
		.filter(student->student.marks<18)
		.forEach(System.out::println);
		
		System.out.println("passed student");
		students.stream()
		.filter(student->student.marks>18)
		.forEach(System.out::println);
		
		
		System.out.println("ggracing with my way");
		students.stream()
		.map(student->{
			if(student.marks>18) {
				return student;
			}
			else {
				int charectersToAppend=18-student.marks;
				for (int i = 1; i <=charectersToAppend; i++) {
					student.marks=student.marks+i;
				}
				return student;
			}
		}).collect(Collectors.toList());
		System.out.println("");
		students.forEach(System.out::println);
		
		System.out.println("gracing with meam method");
		List<Student> mStudents=students.stream()
		//.filter(student->student.marks<18)
		.map(student->{
			if(student.marks>18) {
				return student;
			}
			else {
				int requiredMarks=18-student.marks;
				student.marks=student.marks+requiredMarks;
				return student;
			}
		}).collect(Collectors.toList());
		System.out.println("");
		mStudents.forEach(System.out::println);
		
		
		System.out.println("sorting");
		mStudents.stream()
		.sorted().forEach(System.out::println);
		
		//disting method in 
	}
}
