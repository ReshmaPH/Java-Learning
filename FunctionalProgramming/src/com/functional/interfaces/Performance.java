package com.functional.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Performance {

	public static void main(String[] args) {
		String [] str= {"Resh","Sandhu","Lohi","Sarath","Shivana","Renju"};
		List<String> names=new ArrayList<>();
		for(String name:str) {
			names.add(name);
		}
	
		//names.stream().filter(x->x.length()>3).forEach(System.out::println);
		
		names.stream().peek(System.out::println).filter(x->x.length()>3).peek(System.out::println).map(String::toUpperCase).peek(System.out::println);
		// intermediate operation executes only when terminal operator is set.
		names.stream().peek(System.out::println).filter(x->x.length()>3).peek(System.out::println).map(String::toUpperCase).peek(System.out::println).findFirst();
	}

}
