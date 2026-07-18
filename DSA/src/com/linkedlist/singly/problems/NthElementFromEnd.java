package com.linkedlist.singly.problems;

import com.linkedlist.singly.LinkedList;
import com.linkedlist.singly.Node;

public class NthElementFromEnd {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insertFirst(10);
		list.insertFirst(30);
		list.insertLast(40);;
		list.insertFirst(50);
		list.insertFirst(80);
		list.insertLast(60);
		
		list.display();
		
		find(list, 4);
		
		list.display();
		
	}

	public static void find(LinkedList list, int n) {
		if(list.head == null) {
			System.out.println("LinkedList is empty");
			return;
		}
		
		if(n == list.size) {
			System.out.println(n + "th Node from end : " + list.head.data);
			list.head = list.head.next;
			return;
		}
		int i =1;
		int target = list.size - n;
		Node prev = list.head;
		while(i < target) {
			prev = prev.next;
			i++;
		}
		System.out.println(n + "th Node from end : " + prev.next.data);
		
		prev.next = prev.next.next;
		
	}
}
