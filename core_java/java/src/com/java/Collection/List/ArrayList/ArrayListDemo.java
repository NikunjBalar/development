package com.java.Collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> veg = new ArrayList<String>();
		veg.add("Dhokla");
		veg.add("Khakhra");
		veg.add("bhajiya");
		veg.add("bateta bhungla");

		ArrayList<Object> foodItem = new ArrayList<Object>();
		foodItem.add("tea");
		foodItem.add("milk");
		foodItem.add("jalebi");
		foodItem.addAll(veg);

		System.out.println(foodItem.retainAll(veg));
		System.out.println(foodItem.size());
		System.out.println(foodItem.set(3, 5));

		System.out.println(foodItem.contains("bateta bhungla"));
		System.out.println(foodItem.get(3));
		System.out.println(foodItem.getClass());
		System.out.println(foodItem.isEmpty());
		System.out.println(foodItem.subList(2, 5));
		System.out.println(foodItem.remove(1));
		System.out.println(foodItem.hashCode());
		System.out.println(foodItem);
		foodItem.clear();

		System.out.println(foodItem);

	}
}
