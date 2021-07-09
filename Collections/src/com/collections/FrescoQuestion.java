
package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// inputs are as std input
//1st input  no of key value pairs
//2nd input key value pairs
//3rd input key to be searched for
// eg   input 
//2
//100 Resh
//101 Sandhu
//100

//output 
//Resh

//program should search for this key and print the corresponding key value pair if exists, otherwise print -1

public class FrescoQuestion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		int length=String.valueOf(number).length(); // convert to string first and find length of string

		int [] digitsArray=new int [length];
		int i=length-1;
		
		while(number>0) {
			digitsArray[i]=number%10;
			number /=10;
			i--;
		}
		
		boolean[] visited=new boolean[length];
		Arrays.fill(visited, false);
		
		for(int j=0;j<length;j++) {
			if(visited[j]==true) {
				continue;
			}
			
			int count=1;
			for(int k=j+1;k<length;k++) {
				if(digitsArray[j]==digitsArray[k]) {
					count++;
					visited[k]=true;
				}
			}
			System.out.println(digitsArray[j]+" :"+count);
		}
		
		

		

	}

}
