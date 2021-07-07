package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Question :- accept an integer as std input and print the frequency of each digits in that number. 
//Input
// 12121123 
//Output
//1:4
//2:3
//3:1 

public class FrescoQuestion2 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		// finding length of an integer.
		
		int length=String.valueOf(number).length(); // convert to string first and find length of string
		//System.out.println(length);
		
		// converting int to int array
		
		int [] digitsArray=new int [length];
		int i=length-1;
		while(number>0) {
		//	System.out.println(number%10);
		//	System.out.println(number/=10);
			digitsArray[i]=number%10;
			number /=10;
			i--;
		}
		
		//System.out.println("Digits Array: "+Arrays.toString(digitsArray));
		int [] frequencyArray=new int[length];
		int visited=-1;
		for(int j=0;j<length;j++) {
			int count=1;
			for(int k=j+1;k<length;k++) {
				if(digitsArray[j]==digitsArray[k]) {
					count++;
					frequencyArray[k]=visited;
				}
				}
			if(frequencyArray[j]!=visited) {
				frequencyArray[j]=count;
			}
		}
		
		for(int m=0;m<length;m++) {
			if(frequencyArray[m]!=visited) {
				System.out.println(digitsArray[m]+" :"+frequencyArray[m]);
			}
		}
		
		
	}

}
