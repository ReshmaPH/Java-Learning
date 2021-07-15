package com.functional.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningElementsInStream {

	public static void main(String[] args) {
		List<String> courses =new ArrayList<>();
		String [] list= {"B-tech","Bca","B-Farm","Bsc"};
		for(String course:list) {
			courses.add(course);
		}
		System.out.println(courses.stream().collect(Collectors.joining(" ")));  //joining stream elements , delimiter is space here
		System.out.println(courses.stream().map(course->course.split("")).flatMap(Arrays::stream).collect(Collectors.toList())); //flatMAp convert array of streams into single stream
		System.out.println(courses.stream().map(course->course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())); // print only disntict characters this time.
	}
	

}
