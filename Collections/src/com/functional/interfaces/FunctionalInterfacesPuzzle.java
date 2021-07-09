package com.functional.interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfacesPuzzle {

	public static void main(String[] args) {
		//Consumer<String> consumer=()->{};  // this will not compile , need atleast one input
		//Consumer<String> consumer=(str)->{System.out.println(str);};  // this will compile
		//Consumer<String> consumer=(str)-> System.out.println(str); // this would work
		Consumer<String> consumer=System.out::println; // without lambda, this will also work
		consumer.accept("Shivana");
		
		BiConsumer<Integer,String> consumer2=(str1,str2) -> System.out.println(str1);
		consumer2.accept(1, "Sandhu");
		
	//	Supplier<String> supplier=()-> "Resh"; // this will compile
		//Supplier<String> supplier=()->  {"Resh";};  // this wouldnt complile, need to explicitly give return when you use braces
		Supplier<String> supplier=()->  {return "Resh";}; 
		System.out.println(supplier.get()); 

	}

}
