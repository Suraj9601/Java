package com.LinkedList;

class Node {
	 int val;
	 Node next;
	
	Node head;
	Node tail;
	
	Node() {
		this.next = null;
	}
	Node(int val) {
		this.val = val;
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
			return;
		}
		newNode = head;
		head = newNode;
	}
	
	public void printLL() {
		if(head == null) {
			System.out.println("List is empty.");
		}
		if(head != null) {
			Node currNode = head;
			
			while(currNode != null) {
				System.out.println(currNode);
				currNode = currNode.next;
			}
		}
	}
	
}

public class FirstLL {

	public static void main(String[] args) {
		Node n = new Node();
		n.addFirst(10);
		n.addFirst(20);
		

	}

}
