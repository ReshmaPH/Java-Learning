package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class SetOperations {

	public static void main(String[] args) {
		Set <Integer> set1=new HashSet<Integer>();
		Set <Integer> set2=new HashSet<Integer>();
		Set <Integer> set3=new HashSet<Integer>();
		Set <Integer> set4=new HashSet<Integer>();
 		
		Integer [] C= {34,56,78,02,43};
		Integer [] D= {45,67,23,45,89,89};
		
		 set3.addAll(Arrays.asList(C));  // create  a set using array
		 set4.addAll(Arrays.asList(D));  
		 System.out.println("set3 ->"+set3);
		 System.out.println("set4->"+set4);
		 
		 System.out.println("set3 contains 23 -"+set3.contains(23));
		 System.out.println("set3 contains all set4?  -"+set3.contains(set4));
		 System.out.println("has code value of  set4?  -"+set4.hashCode());
		 System.out.println("Remove 45 from set4  -"+set4.remove(45));  // if 45 doesnt exists, it returns false
		 
		 set4.addAll(set3);
		 System.out.println("Adding set3 to set4 -> "+set4); // addAll adds a collection data to a set
		 set3.clear() ; // removes all elements from set3
		 System.out.println("After clearing set3 - " + set3);
		 System.out.println("Is seset4t3 empty? - " + set3.isEmpty());
		 System.out.println("Iterating set4..");
		 System.out.println("size of set4=" +set4.size());
		 Iterator itr=set4.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
 		
		set1.add(34);
		set1.add(4);
		set1.add(56);
		set1.add(90);
		
		
		set2.add(4);
		set2.add(4);  // this wouldn't be added as set doesn't allow duplicates.
		set2.add(50);
		set2.add(70);
		
		
		//finding union of set 1 and 2
		
		Set union=new HashSet(set1);
		union.addAll(set2);
		System.out.println("Union ->"+set1+"+"+set2+"="+union);
		
		//finding intersection of set1 and 2
		
		Set common=new HashSet(set1);
		common.retainAll(set2);
		System.out.println("Intersection - > "+set1+"&&"+set2+"="+common);

	}

}
