package com.into.oops;

public class Book {

	int noOfCopies;
	
	Book(int copies){
		this.noOfCopies=copies;
	}

	void setnoOfCopies(int copies) {
		if(copies >0)
		this.noOfCopies = copies;
	}
	
	
	public int getNoOfCopies() {
		return noOfCopies;
	}


	void increaseNoOfCopies(int howmuch) {
		setnoOfCopies(this.noOfCopies+howmuch);
	}
	
	void decreaseNoOfCopies(int howmuch) {
		setnoOfCopies(this.noOfCopies-howmuch);
	}
}
