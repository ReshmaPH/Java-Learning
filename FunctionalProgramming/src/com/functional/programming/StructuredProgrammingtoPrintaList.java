package com.functional.programming;

import java.util.ArrayList;
import java.util.List;

public class StructuredProgrammingtoPrintaList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		printList(list);
		printEvenNumbers(list);
		sum(list);

	}

	private static void sum(List<Integer> list) {
		int sum=0;
		for(int num:list){
			sum+=num;
		}
		System.out.println(sum);
	}

	private static void printEvenNumbers(List<Integer> list) {
		for(int num:list) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
		
	}

	private static void printList(List<Integer> list) {
		for(int number:list) {
			System.out.println(number);
		}
		
	}

}
