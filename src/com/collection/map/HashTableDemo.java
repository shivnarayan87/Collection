package com.collection.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
Hashtable<String,Integer> map= new Hashtable<String,Integer>();
		map.put("aa",new Integer(10));
		map.put("bb",new Integer(12));
		map.put("cc",new Integer(14));
		map.put("dd",new Integer(118));
		map.put("dd",new Integer(119));
		
		System.out.println(map);
	}

}
