package com.linkedlist.singly.problems;
import com.linkedlist.singly.*;

// Zigzag / Reorder Linked List

public class ReorderLinkedList {

	public static void main(String[] args) {
		

	}
	
	public static void reOrder(Node head) {
		Node slow = head;
		Node fast = head.next;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node mid = slow;
		
		
		
		Node curr = mid.next;
		mid.next = null;
		
		Node prev = null;
		Node next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node left = prev;
		Node right = head;
		
		while(left != null && right != null) {
			
		}
	}

}
