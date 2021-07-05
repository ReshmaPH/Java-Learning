package com.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// int [] marks= {40,49,45};
		Student student = new Student("Resh", 34, 57, 89, 78); // variable arguments
		// Student student1=new Student("Resh",34,57,89,56,89,90) ;

		int number = student.getNumberOfMarks();
		int sum = student.totalMarks();
		int maxMark = student.getMaximumMark();
		int minMark = student.getMinimumMark();
		BigDecimal average = student.getAverage();
		System.out.println(student);

		System.out.println("number of marks " + number);
		System.out.println("Sum is " + sum);
		System.out.println("Maximum mark is " + maxMark);
		System.out.println("Minimum mark is " + minMark);
		System.out.println("Average  is " + average);
		
		student.addNewMark(50);
		System.out.println(student);
		student.removeMarkAtIndex(1);
		System.out.println(student);

	}

}
