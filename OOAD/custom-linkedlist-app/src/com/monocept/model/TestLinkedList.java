package com.monocept.model;

public class TestLinkedList {
	public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(18);
    list.add(45);
    list.add(12);
//    list.display();
   
    list.remove(18);
    list.display();
    
//    for(Integer item: list) {
//    	System.out.println(item);
//    }
	}
}
