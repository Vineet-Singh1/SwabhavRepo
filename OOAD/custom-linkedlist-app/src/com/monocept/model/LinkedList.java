package com.monocept.model;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
	Node head;

	public void add(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node nodeTraverse = head;
			while (nodeTraverse.next != null) {
				nodeTraverse = nodeTraverse.next;
			}
			nodeTraverse.next = node;
		}
	}

	public void remove(int index) {
		if (index == 0)
			head = head.next;
		else {
			Node nodeTraverse = head;

			for (int i = 0; i < index - 1; i++)
				nodeTraverse = nodeTraverse.next;
			nodeTraverse.next = nodeTraverse.next.next;
		}

	}

	public void display() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;

		}
		System.out.println(node.data);
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedListIterator();
	}

	class LinkedListIterator implements Iterator<T> {

		Node current = head;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			if (hasNext()) {
				T data = (T) current.data;
				current = current.next;
				return data;
			}
			return null;
		}
	}

}
