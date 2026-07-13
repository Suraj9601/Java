package com.linkedlist.doubly;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertFirst(20);
//		list.insertFirst(40);
//		
//		list.insertLast(10);
		
		System.out.println(list.tail);
		

		list.display();

	}

}
