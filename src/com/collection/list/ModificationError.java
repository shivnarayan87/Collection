package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ModificationError {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("first");
		al.add("second");
		al.add("third");
		
		Iterator<String> list=al.iterator();
		while (list.hasNext()) {
			String type = list.next();
			System.out.println(type.toString());
			al.add("four");
			
		}
		
	}
	
	
	
	

}
