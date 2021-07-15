package com.functional.programming.files;

import java.io.IOException;

import java.nio.file.Paths;
import java.util.Arrays;
import java.nio.file.Files;

public class FilesExample {

	public static void main(String[] args) throws IOException  {
		Files.lines(Paths.get("Files.text")).forEach(System.out::println);  // Reading a file and then printing it out.
		Files.lines(Paths.get("Files.text")).map(str->str.split(" ")).flatMap(Arrays::stream).distinct().sorted().forEach(System.out::println);//print unique words in asc order from the file
		Files.list(Paths.get(".")).forEach(System.out::println); // print files in root ,Files.list returns a stream
		Files.list(Paths.get("."))
		.filter(Files::isDirectory)
		.forEach(System.out::println);  // printing only directories
	}

}
