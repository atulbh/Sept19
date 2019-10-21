package com.java.algods;

public class StackUsingTwoQueuesTest {

	public static void main(String[] args) {
		StackUsingTwoQueues stack = new StackUsingTwoQueues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		System.out.println("Removed element : "+ stack.pop());
		stack.push(8);
		System.out.println("Removed element : "+ stack.pop());
	}
}
