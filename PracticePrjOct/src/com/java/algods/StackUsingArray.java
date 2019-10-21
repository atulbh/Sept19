package com.java.algods;

import java.util.Arrays;

public class StackUsingArray {

	private int top = -1;
	private int[] arr = new int[5];
	
	public boolean push(int i){
		if(isFull()){
			return false;
		}else{
			arr[++top] = i;
			//top++;
			return true;
		}
	}
	
	public boolean pop(){
		if(isEmpty()){
			return false;
		}else{
			arr[top]=0;
			top--;
			return true;
		}
	}

	private boolean isFull() {
		return top==arr.length-1?true:false;
	}
	
	public void printStack(){
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println();
	}
	
	private boolean isEmpty(){
		return top==-1?true:false;
	}
	
	public int peek(){
		return isEmpty()?-1:arr[top];
	}
	
}
