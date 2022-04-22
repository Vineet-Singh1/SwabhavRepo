package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws IOException {
		HtmlDomGrpElement root = new HtmlDomGrpElement("div");
		System.out.println(root.render());
		HtmlDomIndividualElement userName = new HtmlDomIndividualElement("input", "text", "","User-Name");
		HtmlDomIndividualElement password = new HtmlDomIndividualElement("input", "password", "","Password");
		HtmlDomIndividualElement email = new HtmlDomIndividualElement("input", "email", "","E-mail");
		HtmlDomIndividualElement checkbox = new HtmlDomIndividualElement("input", "checkbox", "","I agree with T&C");
		HtmlDomIndividualElement btn = new HtmlDomIndividualElement("input", "button", "Login","");
		root.addChild(userName);
		root.addChild(password);
		root.addChild(email);
		root.addChild(checkbox);
		root.addChild(btn);
		System.out.println(root.render());
		generateHtmlFile(root.render());

	}

	private static void generateHtmlFile(String data) throws IOException {
		File file = new File("resources//login.html");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("<html>\r\n" + " <head></head>\r\n" + "<body> \r\n" + data + "</body\r\n" + "</html>");
		fw.close();

	}

}
