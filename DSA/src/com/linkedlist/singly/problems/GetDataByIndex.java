package com.linkedlist.singly.problems;

import java.util.Scanner;

import com.linkedlist.singly.LinkedList;
import com.linkedlist.singly.Node;

public class GetDataByIndex {
	static LinkedList list = new LinkedList();
	
	public static void getData(int idx) {
		if(idx < 0 || idx > list.size) {
			System.out.println("Invalid Index.");
			return;
		}
		if(list.head == null) {
			System.out.println("LinkedList is Empty.");
			return;
		}
		if(idx == 0) {
			System.out.println("Data : "+list.head);
			return;
		}
		Node temp = list.head;
		for(int i=0; i < idx; i++ ) {
				temp = temp.next;
			}
		System.out.println("Data :  "+ temp.data);
		}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		list.insertLast(10);
		list.insertLast(20);
		list.insertLast(30);
		list.insertLast(40);
		list.insertLast(50);
		list.display();
		System.out.print("Enter the index to get data : ");
		getData(sc.nextInt());
		sc.close();
	}
}
