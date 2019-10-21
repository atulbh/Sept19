package com.java.algods;

public class TestStack {

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
		stack.push(5);
		stack.push(4);
		stack.push(7);
		stack.push(8);
		stack.push(4);
		stack.push(10);
		stack.printStack();
		
		stack.pop();
		stack.printStack();
		
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		System.out.println(stack.peek());
	}
}
