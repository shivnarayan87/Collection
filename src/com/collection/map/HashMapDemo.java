package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		map.put("aa",new Integer(10));
		map.put("bb",new Integer(12));
		map.put("cc",new Integer(14));
		map.put("dd",new Integer(118));
		map.put("dd",new Integer(119));
		map.put("a1",new Integer(10));
		map.put("b2",new Integer(12));
		map.put("c3",new Integer(14));
		map.put("d4",new Integer(118));
		map.put("d6",new Integer(119));
	//	map.put(null,null);
		
//		System.out.println(map);
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			System.out.println("keys:"+entry.getKey()+"::"+"value:"+entry.getValue());
			
		}
		
	}

}
