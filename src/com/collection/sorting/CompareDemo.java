package com.collection.sorting;

import java.util.TreeSet;

public class CompareDemo {
	public static void main(String[] args) {
		TreeSet<Employee> ts= new TreeSet<>();
		ts.add(new Employee("shiv", 100));
		ts.add(new Employee("raju", 200));
		ts.add(new Employee("ishu", 150));
		ts.add(new Employee("priya", 100));
		System.out.println(ts);
		TreeSet ts1= new TreeSet(new MyComparator()) ;
		
		ts1.add(new Employee("shiv", 100));
		ts1.add(new Employee("raju", 200));
		ts1.add(new Employee("ishu", 150));
		ts1.add(new Employee("shiv", 100));
		System.out.println(ts1);
		
	}

}
