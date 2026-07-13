package com.linkedlist.singly.problems;

import com.linkedlist.singly.LinkedList;
import com.linkedlist.singly.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		
		list.display();
		reverseLL(list);
		list.display();
	}
	
	public static void reverseLL(LinkedList list) {
		Node prevNode = null;
		Node currNode = list.head;
		Node nextNode;
		
		while(currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		list.head = prevNode;
	}

}
