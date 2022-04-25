package com.monocept.iterator.test;

import com.monocept.iterator.Iterator;
import com.monocept.iterator.NamesRepository;

public class IteratorTest {

	public static void main(String[] args) {
		NamesRepository repo = new NamesRepository("abc,mno,pqr");
		Iterator itr = repo.createIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
