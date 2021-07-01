package com.arrays;

public class DaysOfWeekRunner {

	public static void main(String[] args) {
		
		String [] daysOfWeek= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println(longestString(daysOfWeek));  
		printDaysBackwards(daysOfWeek);
	}
	
	//Method to print the Longest string
	public static String longestString(String [] weekDays) {
		String Longest="";
		for(String day:weekDays) {
			if(day.length()>Longest.length()) {
				Longest=day;
			}
		}
		return Longest;
	}
	
	//Method to print the days in backwards
	public static void printDaysBackwards(String [] weekDays) {
		for(int i=weekDays.length-1;i>=0;i--) {
			System.out.println(weekDays[i]);
		}
	}

}
