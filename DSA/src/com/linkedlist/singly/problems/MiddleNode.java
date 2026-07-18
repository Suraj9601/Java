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
		
		int result = middleNode(list);
		
		if(result == 0) {
			System.out.println("LinkedList is empty.");
		} else {
			System.out.println("Middle element : "+result);
		}
		
	}
	
	public static int middleNode(LinkedList list) {
	    if (list.head == null) {
	        return 0;
	    }

	    Node slow = list.head;
	    Node fast = list.head;

	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }

	    return slow.data;
	}

}
