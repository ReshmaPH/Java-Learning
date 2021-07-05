package oops.object.composition;

import java.util.ArrayList;

public class Book {
	private int id;
	private String discription;
	private String author;
	private ArrayList<Review> reviews=new ArrayList<>();
	
	public Book(int id, String discription, String author) {
		super();
		this.id = id;
		this.discription = discription;
		this.author = author;
	}
	
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	public String toString(){
		return String.format("id - %d discription - %s Author - %s Reviews -%s", id,discription,author,reviews);
	}
	
}
