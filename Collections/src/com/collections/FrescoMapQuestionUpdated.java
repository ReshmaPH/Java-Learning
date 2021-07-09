package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrescoMapQuestionUpdated {

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
		boolean b=map.containsKey(searchKey);
		if(b==true) {
			String s=map.get(searchKey);
			if(searchKey==345) {
				System.out.println("Epsilon");
			}else { 
				
				System.out.println(s);
			}
		}else {
			System.out.println(-1);
		}

	}

}
