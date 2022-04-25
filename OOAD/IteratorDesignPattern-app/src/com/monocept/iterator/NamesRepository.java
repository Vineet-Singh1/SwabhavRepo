package com.monocept.iterator;

import com.monocept.iterator.NamesRepository.NamesArrayIterator;

public class NamesRepository {
	private String[] names;

	public NamesRepository(String names) {
		this.names = names.split(",");
	}

	public NamesArrayIterator createIterator() {
		return new NamesArrayIterator(this);
	}

	class NamesArrayIterator implements Iterator {
		int index = 0;
		NamesRepository repo;

		public NamesArrayIterator(NamesRepository repo) {
			this.repo = repo;
		}

		@Override
		public boolean hasNext() {

			return index < repo.names.length;
		}

		@Override
		public Object next() {
			Object val = repo.names[index];
			index += 1;
			return val;
		}

	}

}
