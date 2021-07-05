package com.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	String name;
	//int[] marks;
	ArrayList<Integer> marks=new ArrayList<Integer>();

	public Student(String name, int... marks) { // use variable arguments here
		super();
		this.name = name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
		
	}

	public int getNumberOfMarks() {

		//return marks.length;  -- length is for array
		return marks.size();  // --size() is for ArrayList
	}

	public int totalMarks() {
	
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}
		return sum; 
		
	}

	public int getMaximumMark() {
	/*	int maximum = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > maximum) {
				maximum = mark;
			}
		}
		return maximum; */
		return Collections.max(marks);
		
	}

	public int getMinimumMark() {
		/*int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (minimum > mark) {
				minimum = mark;
			}
		}
		return minimum; */
		return Collections.min(marks);
	}

	public BigDecimal getAverage() {

		int sum = totalMarks();
		int number = getNumberOfMarks();
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

		return average;
	}
	
	public String toString() {
		return name+marks;
	}

	public void addNewMark(int newMark) {
		marks.add(newMark);
		
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
		
	}

}
