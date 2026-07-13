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
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		newNode.prev = temp;
		temp.next = newNode;
		size++;
	}
	
	public void display() {
		if(head == null) {
			System.out.println("LL is Empty.");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data +" -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
}
