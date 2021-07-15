package com.functional.programming;

import java.util.ArrayList;
import java.util.List;

public class Excercises {

	public static void main(String[] args) {

		List<String> courses=new ArrayList<>();
		String [] str= {"Btech","Mtech","BCA","MCA","PlusTwo","CA"};
		for(String course:str) {
			courses.add(course);
		}
		
		System.out.println("List all courses");
		courses.stream().forEach(System.out::println);
		System.out.println("List course has the string CA");
		courses.stream()
		.filter(course -> course.contains("CA"))
		.forEach(System.out::println);
		System.out.println("Course has atleast 4 letters");
		courses.stream()
		.filter(course -> course.length()>4)
		.forEach(System.out::println);
		System.out.println("No of characters in each course name");
		courses.stream()
		.map(course ->course+" "+course.length())
		.forEach(System.out::println);
	}

}
