package com.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterization {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>() ;
		int [] list= {1,2,3,4,5,6,7,8};
		for(int num:list) {
			numbers.add(num);
		}
		
		//Predicate<? super Integer> isEvenpredicate = n->n%2==0;
		
		filterAndPrint(numbers, n->n%2==0); // passing code as parameter, this is called behaviour parameterization
		
		//Predicate<? super Integer> isOddpredicate = n->n%2!=0;
		filterAndPrint(numbers, n->n%2!=0);  
		filterAndPrint(numbers, n->n%2==0);
		
		
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}

}
