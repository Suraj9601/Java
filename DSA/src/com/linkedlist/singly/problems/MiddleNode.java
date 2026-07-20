package com.linkedlist.singly.problems;
import com.linkedlist.singly.*;

public class MiddleNode {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		
		list.display();
		
		Node midNode = middleNode(list.head);
		System.out.println("Middle Node : " + midNode.data);
	}
	
	public static Node middleNode(Node head) {
	    Node slow = head;
	    Node fast = head;

	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }

	    return slow;
	}
}
