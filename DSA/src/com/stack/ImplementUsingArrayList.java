package com.stack;
import java.util.ArrayList;

public class ImplementUsingArrayList {
	
	static class Stack {
		static ArrayList<Integer> list = new ArrayList<>();
		
		public static boolean isEmpty() {
			return list.size() == 0;
		}
		
		public static void push(int val) {
			list.add(val);
		}
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = list.get(list.size()-1) ;
			list.remove(list.size()-1);
			return top;
		}
		
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}
	
	public static void main(String[] args) {
			
			Stack.push(10);
			Stack.push(20);
			Stack.push(30);
			Stack.push(40);
			Stack.push(50);
			
			while(!Stack.isEmpty()) {
				System.out.println(Stack.peek());
				Stack.pop();
			}
		}	
}
