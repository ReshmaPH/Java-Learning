package com.conditions.loops;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Number 1..");
		int number1=scanner.nextInt();
		
		System.out.println("Enter Number 2..");
		int number2=scanner.nextInt();
		
		System.out.println("Available operations");
		System.out.println("1-Add");
		System.out.println("2-Subtract");
		System.out.println("3-Divide");
		System.out.println("4.Multiply");
		System.out.println("Choose Operation..");
		
		int choice=scanner.nextInt();
		System.out.println("Your choices are. ");
		System.out.println("Number 1 =" + number1);
		System.out.println("Number 2 =" + number2);
		System.out.println("Operation :" + choice);
		
		performOperationusingIfblock(number1, number2, choice);
		
		performOperationusingSwitch(number1, number2, choice);
		
	

	}

	private static void performOperationusingIfblock(int number1, int number2, int choice) {
		if(choice==1) {
			System.out.println("Result is - " + (number1+number2));
		}else if(choice==2) {
			System.out.println("Result is -" + (number1 - number2));
		}else if(choice==3) {
			System.out.println("Result is -" + (number1/number2));
		}else if(choice==4) {
			System.out.println("Result is -"+(number1*number2));
		}else {
			System.out.println("Invalid Operation");
		}
	}

	private static void performOperationusingSwitch(int number1, int number2, int choice) {
		switch(choice) {
		case 1:System.out.println("Result is - " + (number1+number2));
				break;
		case 2:System.out.println("Result is -" + (number1 - number2));
				break;
		case 3:System.out.println("Result is -" + (number1/number2));
				break;
		case 4:System.out.println("Result is -"+(number1*number2));
				break;
		default:System.out.println("Invalid Operation");
		}
	}
	

}
