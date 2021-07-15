package com.functional.interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		//binary operators operate on 2 operands but unary on just one.
		UnaryOperator<Integer> multiply=(x)->3*x;
		System.out.println(multiply.apply(10));
		

	}

}
