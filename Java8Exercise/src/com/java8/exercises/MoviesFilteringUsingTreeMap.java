package com.java8.exercises;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

class WebSeries{
	
	private static Object key;
	private int rating;
	private String status;
	private  String genre;
	
	public WebSeries(int rating, String status, String genre) {
		super();
		if(rating <=1 || rating >=10){
			throw new IllegalArgumentException("Rating should be between 1 and 10");
		}
		this.rating = rating;
		
		if(status.equals("Completed") || status.equals("Ongoing")) {
			this.status = status;
		}else {	
			throw new IllegalArgumentException("Status must be either Completed or Ongoing");
		}
		
		if(genre.equals("Drama") || genre.equals("Fantacy") || genre.equals("Romance") || genre.equals("Sports") || genre.equals("Mistery") || genre.equals("Kids")  ) {
			this.genre = genre;
		}else {
			throw new IllegalArgumentException("Genre must be any of this - Drama,Fantacy,Romance,Sports,Mistery,kids");
		}
		
	}
	public WebSeries() {
		
	}
	
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		if(rating <=1 || rating >=10){
			throw new IllegalArgumentException("Rating should be between 1 and 10");
		}
		this.rating = rating;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public  String getGenre() {
	//	if(genre !=Drama )
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "WebSeries [rating=" + rating + ", status=" + status + ", genre=" + genre + "]";
	}

	public static TreeMap<String,WebSeries> filterByRatings(TreeMap<String,WebSeries>tmap,int ratings) {
		
		TreeMap<String, WebSeries> result = tmap.entrySet()
				.stream()
				.filter(x->(x.getValue().rating)>=ratings)
				.collect(Collectors.toMap(entry->entry.getKey(),entry->entry.getValue() //this will return Map<Object,Object>
						,(oldValue,newValue)->newValue,TreeMap::new)); // this will return tree map
				
		return result;
	}
	public static TreeMap<String, Integer> filterByGenreAndStatus(TreeMap<String, WebSeries> tmap, String genre,
			String status) {
		
		
		 TreeMap<String, Integer> result = tmap.entrySet().stream()
				 .filter(entry->entry.getValue().getGenre().equals(genre))
				 .filter(entry->entry.getValue().status.equals(status))
				 .collect(Collectors.toMap(entry->entry.getKey(),entry->entry.getValue().getRating()
						 ,(oldValue,newValue)->newValue,TreeMap::new));	
		 
		return result;
	}
	public static TreeMap<String, String> mostPopularGenre(TreeMap<String, WebSeries> tmap) {
		
		TreeMap<String, String> result=new TreeMap<>();
		
		String genreValue="";
		Optional<Object> popularGenre = tmap.values()
				.stream()
				.map(x->x.genre)
				.collect(Collectors.groupingBy(x->x,Collectors.counting()))
				.entrySet()
				.stream()
				.max(Entry.comparingByValue())
				.map(Map.Entry::getValue);
				
		if(popularGenre.isPresent()) {
			genreValue=popularGenre.get().toString();
		}
		
		
		Map<String, Long> collect = tmap.values()
		.stream()
		.map(x->x.genre)
		.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		for(Entry<String,Long> entry:collect.entrySet()) {

			if(entry.getValue().toString().equals(genreValue)) {
				result.put(entry.getKey(),genreValue);
				//System.out.println(entry.getKey()+""+genreValue);
			}
		}

		
		return result;
	}
	
	
}

public class MoviesFilteringUsingTreeMap {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		TreeMap<String,WebSeries> tmap=new TreeMap<>();
		System.out.println("Please enter no of movies you are going to input");
		int n=scanner.nextInt();
		scanner.skip(System.lineSeparator());
		String[] movies=new String [n];
		System.out.println("Enter the Movie Name,Rating,Status and Genre separated by '-'");
		for(int i=0;i<n;i++) {
			 movies[i]=scanner.nextLine();
		}
		
		for(int i=0;i<movies.length;i++){
			String[] movie = movies[i].split("-");
			tmap.put(movie[0], new WebSeries((Integer.parseInt(movie[1])),movie[2],movie[3]));
		}
		System.out.println("------Filter------\n1 - To get the webseries of the ratings you provided\n2 - "
				+ "To get the webseries and the ratings of the genre and status you provide \n3 - "
				+ "To get the most popular genre series \nPlease provide input in any of the below"
				+ " format\n1,rating\n2,genre,status\n3");
		
		String filterInput= scanner.nextLine();
		String[] input=filterInput.split(",");
		int filterNo=Integer.parseInt(input[0]);
		
		scanner.close();
		
		if(filterNo==1) {
			
			int rating=Integer.parseInt(input[1]);
			
			TreeMap<String, WebSeries> result=WebSeries.filterByRatings(tmap,rating);
			
			result.entrySet().stream().forEach(entry->
			System.out.println(entry.getKey()+"-"+
					entry.getValue().getGenre()+"-"+
					entry.getValue().getRating()+"-"+
					entry.getValue().getStatus()));
			
		}else if(filterNo==2) {
			String genre=input[1];
			String status=input[2];
			TreeMap<String,Integer> result=WebSeries.filterByGenreAndStatus(tmap,genre,status);
			result.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+"-"+entry.getValue()));
		}else if(filterNo==3) {
			TreeMap<String,String> result=WebSeries.mostPopularGenre(tmap);
			System.out.println("The most popular genres");
			result.entrySet()
			.stream()
			.forEach(entry->System.out.println(entry.getKey()+" - "+entry.getValue()+"(No of webseries)"));
			
			
		}
		

		
	}

}
