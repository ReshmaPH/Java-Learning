package oops.object.composition;

public class BookRunner {
	
	// to understand object composition.

	public static void main(String[] args) {
		Book book =new Book(1,"Twilight","Resh");
		book.addReview(new Review(10,"Good Read",5));
		System.out.println(book);
		
	}

}
