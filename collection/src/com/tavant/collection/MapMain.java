package com.tavant.collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapMain {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> hashMap = new TreeMap<Integer, String>();
		
		// to add the data in map 
		hashMap.put(1, "abhinandan");
		hashMap.put(-2, "abhi");
		hashMap.put(1000, null);
		hashMap.put(123, "ajitkumar");
		
		//System.out.println(hashMap.descendingMap());
		System.out.println(hashMap.descendingKeySet());
		System.out.println(hashMap.higherKey(58));
		
		hashMap.
//		
//		String data = hashMap.get(100);
//		boolean  b  = hashMap.containsKey(100);
//		System.out.println(b);
//		b = hashMap.containsValue("Abhinandan");
//		System.out.println(b);
//		
//		System.out.println(data);
////		hashMap.forEach((k,v)->{
////			System.out.println(k+"value "+v);
////		});
////		
////		for (Entry<Integer, String> string : hashMap.entrySet()) {
////			System.out.println(string.getKey()+ "value"+string.getValue());
////		}
//		hashMap.put(10,"abhi");
//		System.out.println(hashMap);
//		
		
		
		
	}
}
