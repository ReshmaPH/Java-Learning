package com.into.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book art = new Book(100);
		Book java = new Book(1000);
		Book cleanCode = new Book(2);
		
		System.out.println(art.getNoOfCopies());

		art.setnoOfCopies(2);
		java.setnoOfCopies(5);
		cleanCode.setnoOfCopies(7);
		
		art.increaseNoOfCopies(10);
		System.out.println(art.getNoOfCopies());
		
		art.decreaseNoOfCopies(20);
		System.out.println(art.getNoOfCopies());
	}

}
