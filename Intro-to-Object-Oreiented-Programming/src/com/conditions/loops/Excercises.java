package com.conditions.loops;

public class Excercises {

	public static void main(String[] args) {

		System.out.println(determinNameOfDay(9));
		System.out.println(isWeekDay(4));
	}

	/*public static String determinNameOfDay(int dayNumber) {
		String result = "";
		switch (dayNumber) {
		case 0:
			result = "Sunday";   
			break;
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;
		default:
			result = "Invalid Number";
			break;

		}

		return result;
	} */
	
	public static String determinNameOfDay(int dayNumber) {

	switch (dayNumber) {
	case 0:
		return "Sunday";   
		
	case 1:
		return "Monday";
		
	case 2:
		return "Tuesday";
		
	case 3:
		return "Wednesday";
		
	case 4:
		return "Thursday";
		
	case 5:
		return "Friday";
		
	case 6:
		return "Saturday";
		
	default:
		return "Invalid Number";
		}
	}
	
	public static boolean isWeekDay(int dayNumber) {    // return false for week ends and true for week days
		switch(dayNumber) {
		//case 0:
		//case 6:return false;
		case 1:
		case 2:  //  fall through
		case 3:
		case 4:
		case 5:return true;
		}
		
		return false;
		
	}

}
