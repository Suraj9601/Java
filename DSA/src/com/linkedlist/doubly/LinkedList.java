package com.linkedlist.doubly;

public class LinkedList {
	public Node head;
	public Node tail;
	public int size = 0;
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			size++;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
		size++;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			insertFirst(data);
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		size++;
	}
	
	public void insertAtIndex(int idx, int data) {
		Node newNode = new Node(data);
		
		if(head == null || idx == 0) {
			insertFirst(data);
			return;
		}

		Node temp = head;
		for(int i = 0; i < idx-1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next.prev = newNode.next;
		temp.next = newNode;
		newNode.prev = temp.next;
		size++;
	}
	
	public void display() {
		if(head == null) {
			System.out.println("LL is Empty.");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" <-> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void reverseDisplay() {
		Node temp = tail;

		while (temp != null) {
		    System.out.print(temp.data + " <-> ");
		    temp = temp.prev;
		}
		System.out.println("null");
	}
}
