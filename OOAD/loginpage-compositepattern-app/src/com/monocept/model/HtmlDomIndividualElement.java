package com.monocept.model;

public class HtmlDomIndividualElement implements IStorageElements {
	private String input;
	private String type;
	private String text;
	private String label;

	public HtmlDomIndividualElement(String input, String type, String text,String label) {
		this.input = input;
		this.type = type;
		this.text = text;
		this.label = label;
	}

	@Override
	public String render() {
		return "<label for="+'"'+label+'"'+">"+label+"</label>"+ " <" + input + " type=" + '"' + type + '"' + " value=" + '"' + text + '"' + "/>\n"+"<br>";

	}

}

