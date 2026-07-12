package com.LinkedList;

public class InsertOperations {
	LinkedList list = new LinkedList();
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		
		if(list.head == null) {
			list.head = newNode;
			list.size++;
			return;
		}
		
		newNode.next = list.head;
		list.head = newNode;
		list.size++;
	} 
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		
		if(list.head == null) {
			insertFirst(data);
			return;
		}
		
		Node temp = list.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		list.size++;
	}
	
	public void insertPosition(int idx, int data) {
		Node newNode = new Node(data);
		if(idx < 0 || idx > list.size) {
			System.out.println("Invalid Position.");
			return;
		}
		if(list.head == null || idx == 0) {
			insertFirst(data);
			return;
		}
		Node temp = list.head;
		for(int i=0; i<idx-1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		list.size++;
	}
	public void display() {
		if(list.head == null) {
			System.out.println("Linked is Empty.");
			return;
		}
		
		Node temp = list.head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
		System.out.println("Size of LinkedList : "+list.size);
		
	}
}
