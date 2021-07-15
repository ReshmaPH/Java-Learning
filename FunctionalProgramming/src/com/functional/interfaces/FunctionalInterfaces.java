package com.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		int [] list= {1,2,3,4,5,6,7,8,9,0};
		for(int num:list) {
			numbers.add(num);
		}
		
		int sum=sum(numbers);
		System.out.println("sum is "+sum);
		
		Predicate<Integer> isEvenpredicate = x->x%2==0;
		//to find the implementation create a predicate ,and ctrl+1 click on unimplemented methods
		Predicate<Integer> isEvenpredicate2= new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {  //test is a function descriptor here
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		
		
		Function<Integer,Integer> Squaremapper = x->x*x;
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		numbers.stream()
		.filter(isEvenpredicate)
		.map(Squaremapper)
		.forEach(sysoutConsumer);
	
		
		

	}

	private static int sum(List<Integer> numbers) {
		
		BinaryOperator<Integer> sumaccumulator = Integer::sum;
		BinaryOperator<Integer> sumaccumulator2 =new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {   // apply is a function descriptor here
				// TODO Auto-generated method stub
				return t+u;
			}
			
		};
		
		
		return numbers.stream()
				.reduce(0,sumaccumulator);
		
	}

}
