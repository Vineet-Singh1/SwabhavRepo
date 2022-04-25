package com.monocept.model;

import java.io.File;
import java.util.Comparator;

public class SortByLength implements Comparator<File> {

	@Override
	public int compare(File o1, File o2) {
		if (o1.length() == o2.length())
			return 0;
		if (o1.length() > o2.length())
			return 1;
		return -1;
	}

}
