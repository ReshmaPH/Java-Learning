package com.functional.interfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class ExploringOtherFuncionalInterfaces {
	public static void main(String[] args) {
		//BiPredicate<Integer,String> bipredicate=(number,str) -> true;
		BiPredicate<Integer,String> bipredicate=(number,str) -> {    //no need to specify return type as it is boolean by default
			return number <10 && str.length()>5;
		};
		
		System.out.println(bipredicate.test(5,"Reshma"));
		
		BiFunction<Integer,String,String> biFunction=(number,str)->{  //specify return type also 
			return number +str;
		};
		System.out.println(biFunction.apply(10, "Sandhu"));
		
		BiConsumer<String,String> biConsumer=(str1,str2) ->{
			System.out.println(str1 + str2);
		};
		biConsumer.accept("Resh", "Sandhu");
	}


}
