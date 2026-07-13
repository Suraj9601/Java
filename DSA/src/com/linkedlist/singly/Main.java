package com.linkedlist.singly;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// Insert Operations
		list.insertFirst(10);
		list.insertFirst(20);
		list.insertLast(40);
		list.insertLast(90);
		list.insertAtIndex(1, 50);
		
		list.display();
		
		// Delete Operations
		list.deleteFirst();
		list.deleteLast();
		list.deleteByIndex(2);
		list.deleteByData(10);
		
		list.display();
	}
}
