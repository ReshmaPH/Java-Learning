package com.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int number=0;
		
		do {
			System.out.println("Enter a Number");
			number=scanner.nextInt();
			System.out.println("Cube of the number is " + (number*number*number));
			
		}while(number>0);
		
		System.out.println("Thank you , Have fun");

	}

}
