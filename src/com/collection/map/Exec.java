package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Exec {
	
	public static void main(String[] args) {
		Student s= new Student("H113");
		Student s1= new Student("H113");
		Map<Student, ReportCard> map= new HashMap<Student,ReportCard>();
		
		map.put(s, new ReportCard());
		map.put(s1, new ReportCard());
		System.out.println(map.size());
		
		for(Map.Entry<Student,ReportCard> detail:map.entrySet()) {
			System.out.println("key:"+detail.getKey().getRegistrationNumber()+"::"+"value:"+detail.getValue().getMathScore());
			
		}
		
	}

}
