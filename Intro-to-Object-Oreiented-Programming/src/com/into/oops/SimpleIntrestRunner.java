package com.into.oops;

import java.math.BigDecimal;

public class SimpleIntrestRunner {

	public static void main(String[] args) {

		SimpleIntrest calculator=new SimpleIntrest("4500.00","7.5");
		BigDecimal totalValue=calculator.calculateTotalValue(5);
		System.out.println(totalValue);

	}

}
