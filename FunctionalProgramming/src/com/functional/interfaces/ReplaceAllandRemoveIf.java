package com.functional.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAllandRemoveIf {

	public static void main(String[] args) {
		String [] str= {"Resh","Sandhu","Lohi","Sarath","Shivana","Renju"};
		List<String> names=new ArrayList<>();
		for(String name:str) {
			names.add(name);
		}
		
		names.replaceAll(str1->str1.toUpperCase());
		System.out.println(names);  // new List replaced by caps
		
		names.removeIf(str1 -> str1.length()>5); // removing strings with length >5
		System.out.println(names);
		


	}

}
