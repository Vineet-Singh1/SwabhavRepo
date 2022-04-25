package com.monocept.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReadingTest {
	public static void main(String[] args) throws IOException {
		listFiles("C:\\Windows\\System32");
	}

	public static void listFiles(String dir) throws IOException {
		Path path = Paths.get(dir);
		List<File> file = (List<File>) Files.list(path).map(x -> new File(x.toString()))
				.sorted((n1, n2) -> (int) (n2.length() - n1.length())).limit(5).collect(Collectors.toList());
		for (File f : file) {
			System.out.println("File name: " + f + "  File Size: " + f.length());
		}

	}
}
