package com.functional.programming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalApproachtoPrintaList {

	public static void main(String[] args) {
		int [] numbers= {1,2,3,4};
		List <Integer> list=new ArrayList<>();
		for(int num:numbers) {
			list.add(num);
		}
		printList(list);
		System.out.println("print odd");
		printOddNumbers(list);
		System.out.println("Print Squares");
		printSquaresofNumbers(list);
		System.out.println("cubes of odd numbers");
		printCubesOfOddNumbers(list);
		
		int sum=sum(list);
		System.out.println("sum of numbers in the list : " +sum);
	}
	
	public static int sum(int a, int b) {  // the parameters is actually aggregate and next number
		return a+b;
	}
	
	private static int sum(List<Integer> list) {
		return list.stream()
		//.reduce(0,FunctionalApproachtoPrintaList::sum); // 0 is initial value 
		  //.reduce(0, (x,y)-> x+y);  // in this case separate/custom sum fn is not needed
			.reduce(0,Integer::sum);  // here sum is from the Integer class, method reference
		//.reduce(0,(x,y)->x);// output will be zero 
		//.reduce(0,(x,y)->y) // return max
		//.reduce(0,(x,y)-> x>y ? x:y) //max if numbers are positive
		
		
		
	}

	private static void printOddNumbers(List<Integer> list) {
		list.stream()
		.filter(num -> num%2!=0)
		.forEach(System.out::println);
		
	}
	public static void printCubesOfOddNumbers(List<Integer> list) {
		list.stream()
		.filter(number ->number%2!=0)
		.map(number ->number*number*number)
		.forEach(System.out::println);
	}
	public static void printSquaresofNumbers(List<Integer> list) {
		list.stream()
		.map(number -> number*number)
		.forEach(System.out::println);
	}

	public static void print(int number) {
		System.out.println(number);
	}
	public static boolean isEven(int number) {
		return number%2==0;
	}
	private static void printList(List<Integer> list) {
		//12,34,56,78,90,32,54,67
		//convert to stream
		//12
		//34
		//56...
		//list.stream().forEach(FunctionalApproachtoPrintaList::print); //classname::methodname  - This approach is called method reference
		list.stream().forEach(System.out::println); // system.out is  a class and it has println static method
		//list.stream().forEach(num ->print(num)); // this also works.
		System.out.println("print even");
		list.stream()
		//.filter(FunctionalApproachtoPrintaList::isEven)  // method reference
		.filter(number -> number%2==0)  // using lambda expression - is a simplified representation of a method
		.forEach(System.out::println);
		
	}
	
	

}
