package com.monocept.model;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {
   protected Node<T> head;
   protected Node<T> currentNode;
   
   public void add(T data) {
	   Node<T> newNode = new Node<T>(data);
	   if(head== null) {
		   head = newNode;
	   }else {
		   currentNode = head;
		   while(currentNode.getNext()!=null) {
			   currentNode = currentNode.getNext();
		   }
		   currentNode.setNext(newNode);
	   }
   }
   
	
	
	@Override
	public Iterator<T> iterator() {
		
		return null;
	}

}
