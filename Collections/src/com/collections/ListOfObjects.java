package com.collections;
import java.util.*;

class Book{
	
	int id;
	String name;
	String author;
	
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public String toString() {
		return id+" "+name+" "+author;
	}

	
}
public class ListOfObjects {

	public static void main(String[] args) {
		List<Book> bookList=new ArrayList<>();
		Book b1=new Book(1,"Twilight","Resh");
		Book b2=new Book(2,"NewMoon","Resh");
		Book b3=new Book(3,"Hero","Sandhu");
		bookList.add(b1);
		bookList.add(b2);
		bookList.set(1, b3);
		for(Book book:bookList) {
			System.out.println(book);	
		}

	}

}
