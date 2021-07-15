
package com.collections;

import java.util.Arrays;
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

public class FrescoQuestionMap {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();


		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < count; i++) {
			int key=scanner.nextInt();
			String value=scanner.nextLine();
			map.put(key, value);

		}

		int searchKey = scanner.nextInt();
		if(map.get(searchKey)==null) {
			System.out.println(-1);
		}else {
			System.out.println(map.get(searchKey).trim());
		}
		
	}

}
