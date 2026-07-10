package com.LinkedList;

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class CreateLL {
	public static void main(String[] args) {
		Node fNode = new Node(10);
		Node sNode = new Node(20);
		Node tNode = new Node(30);
		
		fNode.next = sNode;
		sNode.next = tNode;
	
		Node temp = fNode;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
		
	}
}