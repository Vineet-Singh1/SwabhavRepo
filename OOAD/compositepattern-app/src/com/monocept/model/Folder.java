package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IStorageItem {
	private String name;
	List<IStorageItem> children= new ArrayList<IStorageItem>();

	public Folder(String name) {
		this.name = name;
	}

	void addChild(IStorageItem child) {
		children.add(child);
	}

	@Override
	public void showHierarchy() {
		System.out.println(this.name);
		for(IStorageItem child: children) {
			child.showHierarchy();
		}
	}

}
