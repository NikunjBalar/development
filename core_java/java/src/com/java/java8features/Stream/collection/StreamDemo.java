package com.java.java8features.Stream.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		ArrayList<String> listOfPassword=new ArrayList<>();
		listOfPassword.add("xworkodc@9898");
		listOfPassword.add("password98");
		listOfPassword.add("mypassword");
		listOfPassword.add("se@1509");
		listOfPassword.add("lebhikhari");
		System.out.println("list of passwords");
		listOfPassword.forEach(System.out::println);
System.out.println("---------");
		
		
		System.out.println("list of week passwords");
		/*List<String> listOfWeeekPassword=listOfPassword
				.stream().
				filter(password->password.length()<8)
				.collect(Collectors.toList());
		System.out.println(listOfWeeekPassword);
		
		------------------------or-----------------
		
		*/
		listOfPassword
				.stream().
				filter(password->password.length()<8)
				.forEach(System.out::println);
		System.out.println("----------------");
		
		System.out.println("list of strong password");
		
		List<String> listOfStrongPassword=listOfPassword
		.stream()
		.map(password->{
			if(password.length()>=8)
				return password;
			else {
				int charectersToAppend=8-password.length();
				for (int i = 1; i <=charectersToAppend; i++) {
					password +=i;
				}
				return password;
			}
		})
		.collect(Collectors.toList());
		System.out.println("");
		listOfStrongPassword.forEach(System.out::println);
	}
}
