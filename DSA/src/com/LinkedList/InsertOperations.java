package com.LinkedList;

class LL {
	public  Node head;
	public int size = 0;
	
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
	
	public void insertPosition(int idx, int data) {
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
		System.out.println("Size of LinkedList : "+size);
		
	}
}

public class InsertOperations {
	
	public static void main(String[] args) {
		LL ll = new LL();
		ll.insertFirst(10);
		ll.insertFirst(30);
		ll.insertFirst(60);
		ll.insertFirst(40);
		ll.insertLast(90);
		ll.insertPosition(3, 100);
		ll.insertPosition(4, 155);
		
		ll.display();
		
		
	}

}
