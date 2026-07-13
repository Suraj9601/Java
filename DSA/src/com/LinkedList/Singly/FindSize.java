package com.LinkedList.Singly;

public class FindSize {
	
	
	public static int getSize(LinkedList list) {
		int size = 0;
		Node temp = list.head;
		
		while(temp != null)  {
			temp = temp.next;
			size++;
		}
		return size;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertFirst(30);
		list.insertLast(69);
		list.insertLast(30);
		list.insertFirst(70);
		
		int size = getSize(list);
		
		if(size == 0) {
			System.out.println("LinkedList is Empty.");
		} 
		else {
			System.out.println("Size of LinkedList : "+size);
		}
	}
}
