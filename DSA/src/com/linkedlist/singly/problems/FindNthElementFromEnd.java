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
		
		
	}
	
	// 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> null
	public static void find(LinkedList list, int n) {
		int size = list.size;
		int nodeIdx = size - n;
		Node temp = list.head;
		for(int i = 1; i < nodeIdx ; i++) {
			temp = temp.next;
		}
		System.out.println(n + " Node from end : " + temp.data);
	}
}
