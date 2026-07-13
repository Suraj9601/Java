package com.LinkedList.Singly;

class LinkedList {
	public Node head;
	public int size = 0;
	
	// Insert Operations 
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			size++;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		size++;
	} 
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			insertFirst(data);
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		size++;
	}
	
	public void insertAtIndex(int idx, int data) {
		Node newNode = new Node(data);
		if(idx < 0 || idx > size) {
			System.out.println("Invalid Position.");
			return;
		}
		if(head == null || idx == 0) {
			insertFirst(data);
			return;
		}
		Node temp = head;
		for(int i=0; i<idx-1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		size++;
	}
	
    // Delete Operations
	public void deleteFirst() {
		if(head == null) {
			System.out.println("LinkedList is Empty.");
			return;
		}
		head = head.next;
		size--;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("LinkedList is Empty.");
			return;
		}
		
		if(head.next == null) {
			deleteFirst();
			return;
		}
		
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
	}
	
	public void deleteByIndex(int idx) {
		if(idx < 0 || idx >= size) {
			System.out.println("Invalid Index.");
			return;
		}
		if(head == null) {
			System.out.println("LinkedList is Empty.");
			return;
		}
		if(idx ==0) {
			deleteFirst();
			return;
		}
		Node temp = head;
		for(int i=0; i<idx-1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size--;
	}
	
	public void deleteByData(int data) {
		if(head == null) {
			System.out.println("LinkedList is Empty.");
			return;
		}
		if(data == head.data) {
			deleteFirst();
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			
			if(data == temp.next.data ) {
				temp.next = temp.next.next;
				size--;
				return;
			} 
			temp = temp.next;
		}
		System.out.println("Invalid Data.");
		
	}
	
	public void display() {
		if(head == null) {
			System.out.println("Linked is Empty.");
			return;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");	
	}
}

public class LinkedListOperations {
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
		System.out.println("Size of LinkedList : "+list.size);

	}
}