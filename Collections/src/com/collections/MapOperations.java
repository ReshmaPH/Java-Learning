package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Resh");
		map.put(2, "Shivana");
		map.put(3, "Sandhu");
		
		Map<Integer,String> map2=new HashMap<>();
		map2.put(4, "Lotus");
		
		System.out.println(map);
		map.put(1, "Risha"); // trying duplicate key, it replaces the old one
		System.out.println(map);
		map.putAll(map2); // add another map
		map.remove(3); // removing elements by key

		System.out.println(map);
		System.out.println(map.entrySet()); // array representation
		
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println("Key - "+m.getKey() + " Value -"+m.getValue());
		}
		

	}

}
