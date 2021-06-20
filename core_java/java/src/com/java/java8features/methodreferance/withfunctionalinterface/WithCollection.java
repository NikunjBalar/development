package com.java.java8features.methodreferance.withfunctionalinterface;

import java.util.ArrayList;

public class WithCollection {
	public static void main(String[] args) {
		ArrayList<String> hindiMovie = new ArrayList<>();
		hindiMovie.add("hum sath sath hai");
		hindiMovie.add("vivah");
		hindiMovie.add("marjavvan");
		hindiMovie.add("housfull");

		ArrayList<String> englishMovie = new ArrayList<>();
		englishMovie.add("jocker");
		englishMovie.add("avanger");
		englishMovie.add("annabell");
		englishMovie.add("");

		ArrayList<String> listofMovie = new ArrayList<>();
		hindiMovie.forEach(listofMovie::add);
		englishMovie.forEach(listofMovie::add);
		//listofMovie.forEach(System.out::println);
		listofMovie.forEach(MethodReferenceDemo::print);


		static void print(String obj){
			System.out.println(obj);
		}
	}
}
