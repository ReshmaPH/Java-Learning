package com.functional.interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		//supplier takes no input but returns something 
		Supplier<Integer> numberSupplier=() -> 2;
		System.out.println(numberSupplier.get());
		
		Supplier<String> flowersSupplier=()->{
			return "Rose";   // if you intruduce {} then you must write return explicitly.
		};
		System.out.println(flowersSupplier.get());
		
		Supplier<Integer> randomNumberSupply=()->{
			Random random=new Random();
			return random.nextInt(1000);
		};
		System.out.println(randomNumberSupply.get());
		
		//binary operators operate on 2 operands but unary on just one.

	}

}
