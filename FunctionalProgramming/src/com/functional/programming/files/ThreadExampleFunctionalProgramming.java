package com.functional.programming.files;

import java.util.stream.IntStream;

public class ThreadExampleFunctionalProgramming {

	public static void main(String[] args) {
		/*Runnable runnable=() ->{
			for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId()+":"+i);	
			}
			*/
			Runnable runnable=()->IntStream.rangeClosed(1,10).forEach(i->System.out.println(Thread.currentThread().getId()+":"+i));
			
			Thread thread=new Thread(runnable);
			thread.start();
			Thread thread1=new Thread(runnable);
			thread1.start();
		};
		

		

}
