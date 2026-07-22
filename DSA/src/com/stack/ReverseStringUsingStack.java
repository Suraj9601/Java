package com.stack;
import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String str = "suraj";
		reverseString(str);

	}
	
	public static void reverseString(String str) {
		Stack<Character> s = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			s.push(ch);
		}
		while(!s.isEmpty()) {
			System.out.print(s.peek());
			s.pop();
		}
	}

}
