package com.java8.exercises;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Find the Most occurring character in a given string */

class Result {
	public static char getMaxOccurredCharacter(String str) {

		Optional<Object> result = str.chars()
				.filter(ch -> !Character.isWhitespace(ch))
				.map(ch -> Character.toLowerCase(ch))
				.mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
				.entrySet().stream()
				.max(Entry.comparingByValue())
				.map(Map.Entry::getKey);
		

		// result.ifPresent(r->System.out.println(r)); // can not return value from here

		if (result.isPresent()) {
			char ch = (char) result.get();
			return ch;
		} else {
			return 0;
		}

	}
}

public class FindMaxOccuranceOfCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.nextLine().trim();
		char result = Result.getMaxOccurredCharacter(input);
		System.out.println("Character which has the maximum occurrance in the given String : "+result);

	}

}
