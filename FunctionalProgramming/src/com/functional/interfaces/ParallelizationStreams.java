package com.functional.interfaces;

import java.util.stream.LongStream;

public class ParallelizationStreams {

	public static void main(String[] args) {
		long time=System.currentTimeMillis();
	//	System.out.println(LongStream.range(0,1000000000).sum());  // before parallelizing it took 1181 ms to finish
		System.out.println(LongStream.range(0,1000000000).parallel().sum());  // it took 735 ms only when parallelizing
		
		System.out.println(System.currentTimeMillis()-time);

	}

}
