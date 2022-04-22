package com.monocept.model;

public class File implements IStorageItem {
	private String name;
	private String size;

	public File(String name, String size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public void showHierarchy() {
		System.out.println("Movie name is :"+this.name + " " +"movie size is: "+ this.size);

	}

}
