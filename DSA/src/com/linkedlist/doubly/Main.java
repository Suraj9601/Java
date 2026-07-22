package com.linkedlist.doubly;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertFirst(20);
		list.insertFirst(40);
		list.insertFirst(50);
		
		list.insertLast(10);
		list.insertLast(90);
		
		list.insertAtIndex(1, 30);

		list.removeFirst();

		list.display();
		System.out.println(list.tail.data);

	}

}
