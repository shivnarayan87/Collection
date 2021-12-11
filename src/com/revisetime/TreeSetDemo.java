package com.revisetime;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Employee e1= new Employee(101, new String("shiv"));
		Employee e2= new Employee(102, new String("raju"));
		Employee e3= new Employee(103, new String("lalan"));
		Employee e4= new Employee(104, new String("vinki"));
		
//		TreeSet<Employee> ts= new TreeSet<Employee>();
//		
//		ts.add(e4);
//		ts.add(e3);
//		ts.add(e2);
//		ts.add(e1);
//		
//		//System.out.println(ts);
//		Iterator<Employee>  emp=ts.iterator();
//		
//		
//	while(emp.hasNext()) {
//		Employee employee=emp.next();
//		System.out.println("Empid:"+employee.getEmployeeId()+" "+"ename:"+employee.getEmployeename());
//	}
	
	TreeSet<Employee> tscomparator= new TreeSet<Employee>(new MyComparator());
	tscomparator.add(e4);
	tscomparator.add(e3);
	tscomparator.add(e2);
	tscomparator.add(e1);
	
	Iterator<Employee>  compara=tscomparator.iterator();
	
	while(compara.hasNext()) {
		Employee employee=compara.next();
		System.out.println("Ename:"+employee.getEmployeename()+"   "+"EId:"+employee.getEmployeeId());
	}
	
		
	}

}
