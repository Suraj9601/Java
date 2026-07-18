package com.linkedlist.singly.problems;

import com.linkedlist.singly.LinkedList;
import com.linkedlist.singly.Node;

public class FindNthElementFromEnd {
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
		
		int size = list.size;
		
		if(n == size) {
			System.out.println(n + "th Node from end : " + list.head.data);
			list.head = list.head.next;
			return;
		}
		int nodeIdx = (size - n)+1;
		Node temp = list.head;
		for(int i = 1; i < nodeIdx -1 ; i++) {
			temp = temp.next;
		}
		System.out.println(nodeIdx);
		System.out.println(n + "th Node from end : " + temp.next.data);
		temp.next = temp.next.next;
	}
}
