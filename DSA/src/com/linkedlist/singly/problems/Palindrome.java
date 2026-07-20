package com.linkedlist.singly.problems;
import com.linkedlist.singly.*;

public class Palindrome {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(2);
		list.insertLast(1);
		
		list.display();
		
		System.out.println("LL is Palindrome : "+ isPalindrome(list.head));

	}
	
	public static boolean isPalindrome(Node head) {
		if(head == null || head.next == null) return true;
		
		Node slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node midNode = slow;
		
		Node prev = null;
		Node curr = midNode;
		Node next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		Node right = prev;
		Node left = head;
		
		while(right != null) {
			if(left.data != right.data ) {
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;
	}

}
