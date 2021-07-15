package com.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HigherOrderFunction {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		int [] list= {1,2,3,4,5,6,7,8,9,0};
		for(int num:list) {
			numbers.add(num);
		}
		
		int mode=0;
	//	Predicate<Integer> isEvenpredicate = x->x%2!=mode; //  before creating predicateMethod , from this line of code extract to method and you will get higher order function
		
		Predicate<Integer> isEvenpredicate = predicateMethod(mode); 
		Predicate<Integer> isEvenpredicate2 = predicateMethod(2); // other predicate using higher order function 
		
		//findAndPrintNumbers(numbers, isEvenpredicate);
		findAndPrintNumbers(numbers, isEvenpredicate2);
		
		
	}

	private static Predicate<Integer> predicateMethod(int mode) {    // higher order function which returns a function, predicate here
		Predicate<Integer> isEvenpredicate = x->x%2!=mode;
		return isEvenpredicate;
	}

	private static void findAndPrintNumbers(List<Integer> numbers, Predicate<Integer> isEvenpredicate) {
		numbers.stream().filter(isEvenpredicate).forEach(System.out::println);
	}

}
