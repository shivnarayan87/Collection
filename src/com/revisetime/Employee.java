package com.revisetime;

public class Employee implements Comparable{
	int employeeId;
	String employeename;

	
	public int compareTo(Object o) {
		
		Employee e=(Employee)o;
		int e1=e.employeeId;
		String name=e.employeename;
		int e2=this.employeeId;
		
		if(e1>e2) {
			return -1;
			
		}else if (e1<e2) {
			return +1;
		}else {
		
		return 0;
		}
	}


	public Employee(int employeeId, String employeename) {
		//super();
		this.employeeId = employeeId;
		this.employeename = employeename;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeename() {
		return employeename;
	}


	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	
	
	
	

}
