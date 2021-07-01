package com.conditions.loops;

public class IfStatementRunner {

	public static void main(String[] args) {
		int i=28;
		if(i==25) {
			System.out.println("i = 25");
		}else if(i==24){
			System.out.println("i = 24");
		}else {
			System.out.println("i is neither 24 or 25");
		}
		
		puzzle3();
		puzzle1();
		

	}
	
	private static void puzzle1() {
		int k=15;
		if(k>20) {
			System.out.println(1);
		} else if(k>10) {
			System.out.println(2);
		} else if(k<20) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
	}
	
	private static void puzzle3() {
		int i=25;
		if(i>20) {
			if(i==25) {
				System.out.println("i=25");
			}
			else {
				System.out.println("i !=25");
			}
		}
	}

}
