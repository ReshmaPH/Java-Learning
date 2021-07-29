package com.java8.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Program to create functional interfaces to read and filter data and implement it using method references.

@FunctionalInterface
interface ReadInput {
	List<Integer> readInput();
	
}

@FunctionalInterface
interface FilterData {
	List<Integer> filterData(List<Integer> li);
}

class MyOperations {

	private static int n;

	public static List<Integer> readList() {
		List<Integer> li = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Enter the length of main list which also /nconsidered to be the tailing number to filter data");
		MyOperations.n = scanner.nextInt();
		System.out.println("Enter list of integers");
		for (int i = 0; i < n; i++) {
			li.add(scanner.nextInt());
		}
		return li;
	}

	public static List<Integer> DataFilter(List<Integer> li) {
		List<Integer> collect = li.stream().filter(x -> x != n).collect(Collectors.toList());
		return collect;
	}
	
}

public class FilterListUsingCustomFunctionalInterface {

	public static void main(String[] args) {
		ReadInput input = MyOperations::readList; // ReadInput is a functional interface and readInput is the abstract
													// fn in it
		List<Integer> li = input.readInput();
		System.out.println("Entered List: -"+li);

		FilterData datafilter = MyOperations::DataFilter;
		li = datafilter.filterData(li);
		System.out.println("Filtered List after removing the number you have enetered first if exists: "+li);

		for (Integer i : li) {
			System.out.println(i);
		}

	}

}
