package com.functional.interfaces.customclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
	private String name;
	private String cateory;
	private int reviewScore;
	private int noOfStudents;
	public Course(String name, String cateory, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.cateory = cateory;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCateory() {
		return cateory;
	}
	public void setCateory(String cateory) {
		this.cateory = cateory;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	public  String toString() {
		return name+":"+noOfStudents+":"+reviewScore;
	}
}
public class CustomClass {

	public static void main(String[] args) {
		List<Course> courses=new ArrayList<>();
		Course [] list= {new Course("Spring","Framework",5,100),
				new Course("SpringBoot","Framework",6,300),
				new Course("AWS","Cloud",9,432),
				new Course("Java","Language",9,390),
				new Course("JS","Script",5,400),
				new Course("SQL","DB",7,400),
				new Course("ORacle","DB",3,300),
				};
		for(Course course:list) {
			courses.add(course);
		}
//allMatch,noneMatch,anyMatch
		Predicate<Course> reviewpredicate = course->course.getReviewScore()>5;
		
		System.out.println(courses.stream().allMatch(reviewpredicate)); // return true or false
		System.out.println(courses.stream().noneMatch(reviewpredicate)); 
		System.out.println(courses.stream().anyMatch(reviewpredicate)); 
		//Sorting
		Comparator<Course> comparingByNoOfStudentsIncreaingOrder=Comparator.comparing(Course::getNoOfStudents);
		Comparator<Course> comparingByNoOfStudentsDecreasingOrder=Comparator.comparing(Course::getNoOfStudents).reversed();
		Comparator<Course> comparingByNoOfStudentsandReviews=Comparator.comparing(Course::getNoOfStudents)
				.thenComparing(Course::getReviewScore).reversed();
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsIncreaingOrder)  // increasing order
				.collect(Collectors.toList()) ); 
		
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsDecreasingOrder) // decreasing 
				.collect(Collectors.toList()) );  
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsandReviews) // combining two criteria
				.collect(Collectors.toList()) );   
		

		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsandReviews)
				.limit(2) //  limiting the output
				.collect(Collectors.toList()) );
		
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsandReviews)
				.skip(2) //  skip top two results from the output
				.collect(Collectors.toList()) );
		//skip first 2 results and then limit the remaining to 1
		
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsandReviews)
				.skip(2) //  skip top two results from the output
				.limit(1)
				.collect(Collectors.toList()) );
		
		//return elements until it finds a particular one  takeWhile and dropWhile ara java9 streams
		//System.out.println( 
		//courses.stream().dropWhile(course -> course.getReviewScore()>5)
		//.collect(Collectors.toList()) );
		
		//find max based on the criteria
		System.out.println(
		courses.stream()
		.max(comparingByNoOfStudentsandReviews) ); // return last element in the list
		
		//min
		System.out.println(
		courses.stream()
		.min(comparingByNoOfStudentsandReviews) ); // return first element in the list
		
		System.out.println(
				courses.stream()
				.filter(reviewpredicate)  // no output for this as reviewpredicate = course->course.getReviewScore()>10;
				.min(comparingByNoOfStudentsandReviews) // return optional empty  -- this way it can get rid of null pointer exceptions
				.orElse(new Course("Mongo","DB",3,5000) ));
		
		//findFirst returns first value from the results 
		
		System.out.println(
				courses.stream()
				.filter(reviewpredicate) 
				.findFirst() );  // return optional empty if no results/
		
		//findAny returns any value from the reults
		System.out.println(
				courses.stream()
				.filter(reviewpredicate) 
				.findAny() );  //
		
		//finding sum of students
		
		System.out.println(
				courses.stream()
				.filter(reviewpredicate)
				.mapToInt(Course::getNoOfStudents)
				.sum());
		//finding average
		System.out.println(
				courses.stream()
				.filter(reviewpredicate)
				.mapToInt(Course::getNoOfStudents)
				.average());
		//count , here no of courses
		//finding average
		System.out.println(
				courses.stream()
				.filter(reviewpredicate)
				.mapToInt(Course::getNoOfStudents)
				.count());
		//grouping courses
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCateory)));
		
		//group courses and find count of courses in each group
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCateory,Collectors.counting())));
		
		//group courses and find the course which has max review
		
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCateory
						,Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
		//group the courses and collect the names into a list
		System.out.println(
				
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCateory,
						Collectors.mapping(Course::getName, Collectors.toList()))));
		
	}
	

}
