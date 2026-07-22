package com.stack;

public class ImplementUsingLinkedList {
	static class Node {
		int val;
		Node next;
		
		Node(int val) {
			this.val = val;
			this.next = null;
		}
	}
	static class Stack {
		
		static Node head;
		
		public static boolean isEmpty() {
			return head == null;
		}
		
		public static void push(int val) {
			Node newNode = new Node(val);
			if(isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		public static int pop() {
			if(isEmpty()) return -1;
			
			int top = head.val;
			head = head.next;
			return top;	
		}
		
		public static int peek() {
			if(isEmpty()) return -1;
			return head.val;
		}
	}
	
	public static void main(String[] args) {

		Stack.push(10); 
		Stack.push(20);
		Stack.push(30);
		
		while(!Stack.isEmpty()) {
			System.out.println(Stack.peek());
			Stack.pop();
		}
	}

}
