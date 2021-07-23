package com.java8.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ExamPerformanceResult {
	public static ArrayList<Integer> performance(Integer[] english) {

		ArrayList<Integer> result = new ArrayList<>();

		Supplier<Stream<Integer>> streamSupplier = () -> {
			return Arrays.stream(english);
		};

		OptionalDouble avg = streamSupplier.get().mapToInt(Integer::valueOf).average();
		
		avg.ifPresent(x->result.add((int) x));
	//	double average = avg.getAsDouble();
	//	result.add((int) average);

		
		Integer maxMark = streamSupplier.get().max((x, y) -> x.compareTo(y)).get();
		result.add(maxMark);

		Integer minMark = streamSupplier.get().min((x, y) -> x.compareTo(y)).get();
		result.add(minMark);

		long failedCount = streamSupplier.get().filter(x -> x < 30).count();
		result.add((int) failedCount);
		List<Integer> list = streamSupplier.get().filter(x -> x < 30).collect(Collectors.toList());
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			result.add(itr.next());
		}

		return result;
	}
}

public class FindPerformanceOfStudents {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter total students count");
		Integer n = Integer.parseInt(br.readLine().trim());

		System.out.println("Count is : " + n);
		System.out.println("Enter marks of English for all students");

		Integer[] english = new Integer[n];
		for (int i = 0; i < n; i++) {
			english[i] = Integer.parseInt(br.readLine().trim());
		}

		br.close();

		ArrayList<Integer> solution = ExamPerformanceResult.performance(english);
		System.out.println("Avarage : " + solution.get(0));
		System.out.println("Highest : " + solution.get(1));
		System.out.println("Lowest : " + solution.get(2));
		System.out.println("Number of students failed: " + solution.get(3));
		System.out.println("Marks of failed Students.: ");
		for (int i = 4; i < solution.size(); i++) {
			System.out.println(solution.get(i));
		}

	}

}
