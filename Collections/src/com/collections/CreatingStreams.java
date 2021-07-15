package com.collections;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreatingStreams {

	public static void main(String[] args) {
		Stream.of(12,34,45,67,89,90); // creating a stream using stream method.
		System.out.println(Stream.of(12,34,45,67,89,90).count()); // will produce count
		System.out.println(Stream.of(12,34,45,67,89,90).reduce(0,Integer::sum));
		System.out.println(Stream.of(12,34,45,67,89,90)); // o/p  java.util.stream.ReferencePipeline$Head@404b9385
		int [] numberArray= {12,45,67,89,90};
		System.out.println(Arrays.stream(numberArray)); //o/p java.util.stream.IntPipeline$Head@6d311334
		
		// first is refernce pipeline and second is intpipeline..autoboxing and unboxing happens for first case,sec is of primitive type stream.
		System.out.println(Arrays.stream(numberArray).sum()); // if it is primitive stream, operations can be used directly.
		System.out.println(Arrays.stream(numberArray).min());
		System.out.println(Arrays.stream(numberArray).max());
		//more dynamic way of creatin streams..
		
		System.out.println(IntStream.range(1,10)); // range excludes the upper limit
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println(IntStream.rangeClosed(1, 10).sum()); //includes 10
		System.out.println(IntStream.iterate(1, e ->e+2).limit(10));
		//stem.out.println(IntStream.iterate(1, e ->e+2).limit(10).sum());
		IntStream.iterate(1, e ->e+2).limit(10).peek(System.out::println).sum();
		// to store the primitive stream into a list used boxed first and then collect
		System.out.println(IntStream.iterate(1, e ->e+2).limit(10).boxed().collect(Collectors.toList()));
		
		// if bignumbers are involved in calculations use BigNumber
		System.out.println(LongStream.rangeClosed(1,50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply));
		
	}

}
