package com.monocept.steams.test;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStreamTest {

	public static void main(String[] args) throws IOException {
//    	caseStudy1();
//		caseStudy2();
		caseStudy3();
	}

	private static void caseStudy1() throws IOException {
		Path filePath = Paths.get("resources//names.txt");
		Files.lines(filePath).forEach(FileStreamTest::printDetails);
	}

	private static void printDetails(String line) {
		System.out.println(line.toUpperCase());
	}

	private static void caseStudy2() throws IOException {
		Path filePath = Paths.get("resources//names.txt");
		Files.lines(filePath).distinct().forEach(FileStreamTest::printDetails);
	}

	private static void caseStudy3() throws IOException {
		Path filePath = Paths.get("resources//names.txt");
		Files.lines(filePath).filter(FileStreamTest::allowString).distinct().forEach(FileStreamTest::printDetails);
	}

	private static boolean allowString(String name) {
		String regex = "[0-9]+";
		if (name.matches(regex))
			return false;
		return true;

	}
}
