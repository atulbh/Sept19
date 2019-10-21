package com.java.algods;

public class StackUsingLinkedList {

	Node head;
	private class Node{
		int val;
		Node next;
	}
	
	public StackUsingLinkedList(){
		head = null;
	}
	
	public int pop(){
		int value = head.val;
		head=head.next;
		return isEmpty()?-1:value;
	}
	
	public void push(int value){
		Node oldHead = head;
		head = new Node();
		head.val=value;
		head.next=oldHead;
	}
	
	private boolean isEmpty(){
		return head==null?true:false;
	}
	
	public  void printList(){
		while(head!=null){
			System.out.println(head.val+" ");
			head=head.next;
		}
	}
}
