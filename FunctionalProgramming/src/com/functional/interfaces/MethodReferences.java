package com.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferences {
	
	public static void print (String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		List<String> courses =new ArrayList<>();
		String [] list= {"B-tech","Bca","B-Farm","Bsc"};
		for(String course:list) {
			courses.add(course);
		}
		
		courses.stream()
		//.map(x->x.toUpperCase()) // usin lambda
		.map(String::toUpperCase)  // method reference
		//.forEach(x->System.out.println(x))  -- using lambda
		//.forEach(System.out::println); // method reference using static method provided by java
		.forEach(MethodReferences::print); // method reference using custom static method
		
		Supplier<String> supplier=() -> new String();
		System.out.println(supplier.get());
		Supplier<String> supplier1=String::new ; // creating object using constructor
		System.out.println(supplier1.get());

	}

}
