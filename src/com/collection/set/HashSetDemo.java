package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		
	
//HashSet<Integer> hs= new HashSet<Integer>();

//	   hs.add(10);
//		hs.add(13);
//		hs.add(17);
//		hs.add(19);
//		hs.add(11);
//		hs.add(12);
//		hs.add(16);
//		hs.add(20);
//		hs.add(21);
//		hs.add(22);
//		hs.add(23);
//		hs.add(24);
//		hs.add(125);
//		hs.add(34);
//		hs.add(56);
//		
//		System.out.println(hs);
		
LinkedHashSet<Integer>		hs= new LinkedHashSet<Integer>();

hs.add(10);
hs.add(13);
hs.add(8);
hs.add(5);
hs.add(null);
hs.add(null);
System.out.println(hs);
System.out.println(hs);
		
		Iterator<Integer> i=hs.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

}
