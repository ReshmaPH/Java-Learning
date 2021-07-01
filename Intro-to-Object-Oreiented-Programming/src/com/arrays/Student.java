package com.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	String name;
	int[] marks;

	public Student(String name, int... marks) { // use variable arguments here
		super();
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {

		return marks.length;
	}

	public int totalMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int maximum = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum;
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (minimum > mark) {
				minimum = mark;
			}
		}
		return minimum;
	}

	public BigDecimal getAverage() {

		int sum = totalMarks();
		int number = getNumberOfMarks();
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

		return average;
	}

}
