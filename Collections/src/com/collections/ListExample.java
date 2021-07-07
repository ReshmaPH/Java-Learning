package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListExample {

	public static void main(String[] args) {
		//List can be array list or linked list
		
		List<String> words=new ArrayList<String>();  // List should be imported from java.util.list
		words.add("Corona");
		words.add("Life threatening");
		words.add("Pandemic");
		
		System.out.println(words);
		Collections.sort(words); // sort has no affect since it is string list
		
		
		List<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(9);
		numbers.add(3);
		Collections.sort(numbers);
		System.out.println("reversing list");
		Collections.reverse(numbers);
		System.out.println(numbers); 
		System.out.println("Shuffling");
		
		Collections.shuffle(numbers);
		System.out.println(numbers); 
		System.out.println(numbers);  // sort happens 
		
		for(Integer num:numbers) {
			System.out.println(num);  // traversing through the list
		}
		 
		System.out.println(words);
		
		String [] str= {"one","two","three"};
		arrayToList(str);
		
		List<String> fruitList=new ArrayList<>();
		fruitList.add("Mango");
		fruitList.add("apple");
		fruitList.add("Grape");
		ListToArray(fruitList);
		
		getListItem(fruitList,1);
		
		setListItem(fruitList,2,"Anar");  
		ListToArray(fruitList);
		
	}
	
//Converting array to a List
	
public static void arrayToList(String [] str) {
	List numberList=new ArrayList();
	for(String number:str) {
		numberList.add(number);
	}
	System.out.println(numberList);
}

//Converting list to an Array

public static void ListToArray(List <String>list) {
	String [] fruitArray=list.toArray(new String[list.size()]); 
	System.out.println(fruitArray); // this will print the reference 
	System.out.println(Arrays.toString(fruitArray));
	
}

// getting an element from list

public static void getListItem(List<String> list,int i) {
	System.out.println(list.get(i));	
}

//setting an element to a list

public static void setListItem(List<String> list,int i,String str) {
	System.out.println(list.set(i,str));	  // this is only replacin existing one, couldnt add new by set
}

}

