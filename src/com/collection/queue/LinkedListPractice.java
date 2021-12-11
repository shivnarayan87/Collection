package com.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListPractice {
	public static void main(String[] args) {
		Queue<Integer> queue= new LinkedList<Integer>();
		queue.add(2);
		queue.add(10);
		queue.add(5);
		queue.add(90);
		queue.add(1);
		
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		
	}

}
