package com.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BehaviorParameterizationExcercise {
	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList<>();
		int [] list= {1,2,3,4,5,6,7,8} ;
		for(int num:list) {
			numbers.add(num);
		}
		
		Function< Integer,Integer> mapper = x->x*x;
		List squaresList=mapAndPrint(numbers, mapper);
		
		System.out.println(squaresList);
		System.out.println(mapAndPrint(numbers, x->x*x*x));
		System.out.println(mapAndPrint(numbers, x->x*x*x*x));
	}

	private static List<Integer> mapAndPrint(List<Integer> numbers, Function<Integer, Integer> mapper) {
		return numbers.stream()
				.map(mapper)
				.collect(Collectors.toList());
	}

		
	


	
}
