package oops.object.composition;

public class Review {
	private int id;
	private String discription;
	private int rating;
	
	public Review(int id, String discription, int rating) {
		super();
		this.id = id;
		this.discription = discription;
		this.rating = rating;
	}
	
	public String toString() {
		return String.format("id - %d discription - %s rating - %d", id,discription,rating);
	}
	
	
}
