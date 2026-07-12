package com.LinkedList.Singly;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertFirst(10);
		list.insertLast(40);
		list.insertAtIndex(1, 30);
		list.insertFirst(50);
		list.insertLast(80);
		
		list.display();
		System.out.println();
		list.deleteByData(40);
		
		
		list.display();

	}

}
