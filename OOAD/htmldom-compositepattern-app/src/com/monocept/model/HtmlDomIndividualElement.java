package com.monocept.model;

public class HtmlDomIndividualElement implements IStorageElements {
	private String input;
	private String type;
	private String text;

	public HtmlDomIndividualElement(String input, String type, String text) {
		this.input = input;
		this.type = type;
		this.text = text;
	}

	@Override
	public String render() {
		return " <" + input + " type=" + '"' + type + '"' + " value=" + '"' + text + '"' + "/>\n";

	}

}
