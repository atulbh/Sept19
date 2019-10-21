package com.java.algods;

public class TestStackUsingLL {

	public static void main(String[] args) {
		StackUsingLinkedList lls=new StackUsingLinkedList();
		lls.push(20);
		lls.push(50);
		lls.push(80);
		lls.push(40);
		lls.push(60);
		lls.push(75);
		System.out.println("Element removed from LinkedList: "+lls.pop());
		System.out.println("Element removed from LinkedList: "+lls.pop());
		lls.push(10);
		System.out.println("Element removed from LinkedList: "+lls.pop());
		lls.printList();
	}
}
