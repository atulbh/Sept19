package com.java.algods;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

	Queue<Integer> queue1;
	Queue<Integer> queue2;
	public StackUsingTwoQueues() {
		super();
		this.queue1 = new LinkedList<>();
		this.queue2 = new LinkedList<>();
	}
	
	public void push(Integer value){
		if(queue1.size()==0)
		{
			queue1.add(value);
		}else{
			int sizeOfQueue1 =  queue1.size();
			for(int i=0;i<sizeOfQueue1;i++){
				queue2.add(queue1.remove());
			}
			queue1.add(value);
			for(int j=0;j<sizeOfQueue1;j++){
				queue1.add(queue2.remove());
			}
		}
	}
	
	public int pop(){
		return queue1.size()==0?-1:queue1.remove();
	}
}
