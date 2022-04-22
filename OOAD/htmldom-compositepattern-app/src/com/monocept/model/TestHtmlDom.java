package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestHtmlDom {

	public static void main(String[] args) throws IOException {
		HtmlDomGrpElement root = new HtmlDomGrpElement("div");
		System.out.println(root.render());
		HtmlDomIndividualElement input = new HtmlDomIndividualElement("input", "text", "Hello World!");
		HtmlDomIndividualElement btn = new HtmlDomIndividualElement("input", "button", "Click Me!");
		root.addChild(input);
		root.addChild(btn);
		System.out.println(root.render());
		generateHtmlFile(root.render());

	}

	private static void generateHtmlFile(String data) throws IOException {
		File file = new File("resources//controls.html");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("<html>\r\n" + " <head></head>\r\n" + "<body> \r\n" + data + "</body\r\n" + "</html>");
		fw.close();

	}

}
