package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class HtmlDomGrpElement implements IStorageElements {
	private String div;
	List<IStorageElements> children = new ArrayList<IStorageElements>();

	public HtmlDomGrpElement(String div) {
		this.div = div;
	}

	void addChild(IStorageElements elem) {
		children.add(elem);
	}

	@Override
	public String render() {
		String html = "<" + div + ">\n";
		for (IStorageElements elem : children) {
			html += elem.render();
		}
		html += "</" + div + ">\n";
		return html;

	}
}
