package com.LinkedList;

public class Test {
	public static void main(String[] args) {
		InsertOperations list = new InsertOperations();
		list.insertFirst(10);
		list.insertLast(98);
		list.insertPosition(1, 99);
		
		list.display();
	}

}
