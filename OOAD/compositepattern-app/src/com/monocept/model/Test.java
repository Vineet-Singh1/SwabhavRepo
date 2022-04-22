package com.monocept.model;

public class Test {

	public static void main(String[] args) {
		Folder root = new Folder("Movies");
		Folder subfolder = new Folder("Bollywood");
		root.addChild(subfolder);
		File movie1 = new File("krish","45");
		subfolder.addChild(movie1);
		
		
		Folder subfolder2 = new Folder("Hollywood");
		root.addChild(subfolder2);
		root.showHierarchy();
		
		

	}

}
