package com.functional.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToListUsingCollect {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		int [] numbersArray= {1,2,3,4,5};
		for(int num:numbersArray) {
			numbers.add(num);
		}
		
		List<String> courses=new ArrayList<>();
		String [] coursesList= {"Spring","Cloud","DB","Servers","Java"};
		for(String course:coursesList) {
			courses.add(course);
		}
		List<Integer> lengthofCourses=findCourseLength(courses);
	System.out.println("Course Length List"+lengthofCourses);
	System.out.println("Original Numbers List: "+numbers);
	List<Integer> doubleNum=doubleNumbers(numbers);
	System.out.println("double the numbers list:" + doubleNum);
	List<Integer> evenNum=evenNumbers(numbers);
	System.out.println("Even numbers list:" + evenNum);
	}

	private static List<Integer> findCourseLength(List<String> courses) {
		return courses.stream()
		.map(course->course.length())
		.collect(Collectors.toList());

	}

	private static List<Integer> evenNumbers(List<Integer> numbers) {
		return numbers.stream()
				.filter(num->num%2==0)
				.collect(Collectors.toList());
	}

	private static List<Integer> doubleNumbers(List<Integer> numbers) {
		return numbers.stream()
		.map(num->num*2)
		.collect(Collectors.toList());
	}

}
