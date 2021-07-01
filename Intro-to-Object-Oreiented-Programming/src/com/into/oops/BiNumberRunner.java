package com.into.oops;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber numbers=new BiNumber(2,3);
		
		System.out.println(numbers.getNum1());
		System.out.println(numbers.getNum2());
		System.out.println(numbers.add());
		numbers.doubleValue();
		System.out.println(numbers.getNum1());
		System.out.println(numbers.getNum2());
		
	}

}

