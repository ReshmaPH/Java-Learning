package com.functional.programming.collection.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorForSorting {

	public static void main(String[] args) {
		String [] str= {"Resh","Sandhu","Lohi","Sarath","Shivana","Renju"};
		List<String> names=new ArrayList<>();
		for(String name:str) {
			names.add(name);
		}
		//names.stream().sorted().forEach(System.out::println);
		//names.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		//names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		names.stream().sorted((Comparator.comparing(name->name.length()))).forEach(System.out::println);;

	}

}
