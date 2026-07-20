package com.linkedlist.singly.problems;
import com.linkedlist.singly.*;

public class DetectCycle {

	public static void main(String[] args) {
		Node head = new Node(2);
		head.next = new Node(5);
		head.next.next = new Node(7);
		head.next.next.next = new Node(3);
		head.next.next.next.next = head;
		
		System.out.println("Cycle exist : " + isCycle(head));
	}
	
	public static boolean isCycle(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
}
