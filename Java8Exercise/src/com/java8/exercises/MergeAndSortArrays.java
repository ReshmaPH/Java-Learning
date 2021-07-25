package com.java8.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Merge 2 Int Arrays also sort it and remove duplicates.

class Merge {
	public static int[] mergedSortedArray(int[] array1, int[] array2) {

		// Stream s1=Stream.of(array1);

		IntStream s1 = Arrays.stream(array1);
		IntStream s2 = Arrays.stream(array2);

		int[] out = IntStream.concat(s1, s2).sorted().distinct().toArray();

		return out;
	}
}

public class MergeAndSortArrays {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter writer=new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		System.out.println("Enter first array length : - ");
		int array1Count = Integer.parseInt(reader.readLine().trim());
		int[] array1 = new int[array1Count];
		for (int i = 0; i < array1Count; i++) {
			array1[i] = Integer.parseInt(reader.readLine().trim());
		}
		System.out.println("Enter second array length : - ");
		int array2Count = Integer.parseInt(reader.readLine().trim());
		int[] array2 = new int[array2Count];
		for (int i = 0; i < array2Count; i++) {
			array2[i] = Integer.parseInt(reader.readLine().trim());
		}

		int[] result = Merge.mergedSortedArray(array1, array2);
		for (int i = 0; i < result.length; i++) {
			System.out.println(Integer.toString(result[i]) + "\n");
		}

		reader.close();
		// writer.close();

	}

}
