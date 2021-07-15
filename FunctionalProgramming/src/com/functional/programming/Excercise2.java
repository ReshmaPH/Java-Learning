package com.functional.programming;

import java.util.ArrayList;
import java.util.List;

public class Excercise2 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		int [] numbers= {1,2,3,4,5,6,7,8};
		for(int num:numbers) {
			list.add(num);
		}
		
		
		int sumOfSquares= list.stream()
		.map(num ->num*num)
		.reduce(0,(x,y)->x+y);
		System.out.println("sum of squares of each number in list : "+sumOfSquares);
		
		int sumOfOddNumbers = list.stream()
				.filter(num ->num%2 !=0)
				.reduce(0, (x,y)->x+y);
		
		System.out.println("sum of odd numbers : "+sumOfOddNumbers);
		
		
		

	}

}
