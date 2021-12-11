package com.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueDemo {
	public static void main(String[] args) {
//		PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
		Integer i1= new Integer(101);
		Integer i2= new Integer(80);
		Integer i3= new Integer(90);
		Integer i4= new Integer(200);
		Integer i5= new Integer(101);
//		
//		pq.add(i1);
//		pq.add(i2);
//		pq.add(i3);
//		pq.add(i4);
//		pq.add(i5);
//	
//		System.out.println(pq);
		
		PriorityQueue<Integer> comprtr = new PriorityQueue<Integer>(new MyComparator());
		comprtr.add(i5);
		comprtr.add(i4);
		comprtr.add(i3);
		comprtr.add(i2);
		comprtr.add(i1);
		System.out.println(comprtr);
		
		Iterator<Integer> i=comprtr.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+"  ");
			comprtr.add(new Integer(20));
			
		}
		
	}

}
