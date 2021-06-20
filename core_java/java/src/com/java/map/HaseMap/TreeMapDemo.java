package com.java.map.HaseMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.put("India", "Delhi");
		tm.put("Nepal","kathmandu");
		tm.put("Rashya","moscow");
		tm.put("Japan","tokyo");
		tm.put("USA","washington dc");
		
		for(Map.Entry<String,String> entry :tm.entrySet()) {
			System.out.println(entry.getKey()+" for "+entry.getValue());
		}
	}
}
