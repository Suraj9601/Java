package com.linkedlist.singly.problems;

import java.util.Scanner;
import com.linkedlist.singly.LinkedList;
import com.linkedlist.singly.Node;

public class SearchElement {
	static LinkedList list = new LinkedList();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		list.display();
		System.out.print("Enter the element to search : ");
		searchElement(sc.nextInt());
		sc.close();
		
	}
	public static void searchElement(int data) {
		if(list.head == null) {
			System.out.println("LinkedList is Empty.");
		}
		if(list.head.data == data) {
			System.out.println(data + " is found at idx 0");
			return;
		}
		Node temp = list.head;
		int idx = 0;
		
		while(temp != null) {
			if(temp.data == data) {
				System.out.println(data + " is found at idx "+idx);
				return;
			}
			temp = temp.next;
			idx++;
		}
		System.out.println("Element Not Found.");
	}
}
