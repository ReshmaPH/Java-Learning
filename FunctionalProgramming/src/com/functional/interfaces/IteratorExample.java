package com.functional.interfaces;
import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		
	//ArrayList<String> words=new ArrayList<String>();
		
	ArrayList words=new ArrayList();
	words.add("Hai");
	words.add("resh");
	Iterator i=words.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	};
	
	ArrayList flowers=new ArrayList();
	flowers.add("rose");
	flowers.add("Orchid");
	
	ListIterator j=flowers.listIterator();
	
	while(j.hasNext()) {
		System.out.println(j.next());
		System.out.println(j.hashCode());
		System.out.println(j.nextIndex());
		//System.out.println(j.previous());  it goes to infinite loop then
	
	}
	
	
	
	}


}
