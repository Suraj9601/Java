package com.linkedlist.singly.problems;
import com.linkedlist.singly.Node;

public class RemoveCycle {

	public static void main(String[] args) {
		Node head = new Node(7);
		Node sec = new Node(2);
		Node third = new Node(1);
		Node fourth = new Node(4);
		
		head.next = sec;
		sec.next = third;
		third.next = fourth;
		fourth.next = sec;
		
		removeCycle(head);  

	}
	
	public static void removeCycle(Node head) {
		Node slow = head;
		Node fast = head;
		boolean cycle = false;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				cycle = true;
				break;
			}
		}
		if(!cycle) {
			System.out.println("Cycle doesn't exist.");
			return;
		}
		
		slow = head;
		Node prev = null;
		while(slow != fast) {
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}
		prev.next = null;
		System.out.println("Cycle removed successfully.");
	}
}
