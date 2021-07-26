package com.java8.exercises;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Search a name from the list.

public class FindNameUsingWithPrefix {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Resh",
				"Risha",
				"Rahul",
				"Sandhu",
				"Renju",
				"Sarath",
				"Ammu",
				"Achu",
				"MayaA");
		System.out.println("Please enter the search letters ..");
		
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		
		List<String> collect = names.stream()
				.map(x->x.toLowerCase())
				.filter(x->x.contains(str))
				.collect(Collectors.toList());
		
		System.out.println("Matching names .."+collect);
		

		Iterator itr=collect.iterator();
		
		while(itr.hasNext()) {
			String str1=(String) itr.next();
			String [] str2=str1.split("");
			long count2=Stream.of(str2).map(x->x.toLowerCase()).distinct().count();
			System.out.println("Name :"+str1+" --No of distinct characters in the name :"+ count2);		
			
		}
		
		//below code will flatten the array of streams into a single stream and then find the distinct and count
		long count = names.stream()
				.filter(x->x.contains(str))
				.map(x->x.toLowerCase())
				.map(x->x.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.count(); 
		System.out.println("Count of distinct characters in totalr "+count);
	}

}
