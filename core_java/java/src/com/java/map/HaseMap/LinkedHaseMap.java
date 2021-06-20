package com.java.map.HaseMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHaseMap {
	public static void main(String[] args) {
		LinkedHashMap<Character,String> lhp=new LinkedHashMap<Character,String>();
		lhp.put('a',"apple");
		lhp.put('b',"Bada apple");
		lhp.put('c',"Chota apple");
		lhp.put('d',"Dusra apple");
		lhp.put('e',"ek apple");
		lhp.put('f',"funny apple");
		lhp.put('g',"gole apple");
		lhp.put(null,null);
		lhp.put(null,null);
		//System.out.println(lhp);
		
		for(Map.Entry<Character,String> entry: lhp.entrySet()){
			System.out.println(entry.getKey()+" for "+entry.getValue());
		}
	}
}
