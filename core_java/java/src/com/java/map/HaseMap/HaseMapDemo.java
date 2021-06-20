package com.java.map.HaseMap;

import java.util.HashMap;
import java.util.Map;

public class HaseMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "core java");
		map.put(2, "advanced java");
		map.put(3, "jdbc ");
		map.put(4, "jee");
		map.put(5, "SQL");
		map.put(6, "framwork");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.print(entry.getKey() + ":" + entry.getValue()+"   ");
		}
		
		System.out.println("\nkey-4:"+map.get(4));
		System.out.println("contains key 7:"+map.containsKey(7));
		System.out.println("contains value sql:"+map.containsValue("SQL"));
		System.out.println("key set :"+map.keySet());
	}
}
