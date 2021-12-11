package com.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
//		TreeSet<Integer> ts= new TreeSet<Integer>();
//		ts.add(1);
//		ts.add(3);
//		ts.add(2);
//		ts.add(Integer.parseInt("10"));
//		System.out.println(ts);
		
		TreeSet ts= new TreeSet();
		
		ts.add(new String("A"));
		ts.add(new String("B"));
		ts.add(new String("E"));
		ts.add(new String("C"));
		ts.add(new String("D"));
		
		System.out.println(ts);
		System.out.println(ts);
	}

}
