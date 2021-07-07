package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// inputs are as std input
//1st input  no of key value pairs
//2nd input key value pairs
//3rd input key to be searched for
// eg   input 
//2
//100 Resh
//101 Sandhu
//100

//output 
//Resh

//program should search for this key and print the corresponding key value pair if exists, otherwise print -1

public class FrescoQuestion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter no of key value pairs");
		int count = scanner.nextInt();
		//System.out.println("Enter key value pairs");

		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < count; i++) {

			map.put(scanner.nextInt(), scanner.next());
		}
	//	System.out.println("Enter key to be searched");
		int key = scanner.nextInt();

		/*System.out.println("number-" + count + "pair" + map + "key" + key);
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(" "+m.getKey() +" "+ m.getValue());
		}*/
		
		if(map.containsKey(key)) {
			System.out.println(map.get(key));
		}else {
			System.out.println(-1);
		}
		

	}

}
