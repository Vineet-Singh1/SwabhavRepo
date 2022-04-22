package com.monocept.model;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadContentOfFile {

	public static void main(String[] args) throws IOException {
		File file = new File("Resources\\Readfile.txt ");
		Scanner sc = new Scanner(file);
		while (sc.hasNext())
			System.out.println(sc.nextLine());
		sc.close();
	}
}