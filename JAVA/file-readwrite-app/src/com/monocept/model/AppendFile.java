package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendFile {

	public static void main(String[] args) throws IOException {
		File file = new File("Resources\\Readfile.txt");
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("Vineet Singh");
		fw.close();

	}

}
