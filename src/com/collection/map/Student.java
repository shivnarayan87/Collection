package com.collection.map;

public class Student {
	
	private String registrationNumber;

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Student(String registrationNumber) {
		//super();
		this.registrationNumber = registrationNumber;
	}

	public boolean equals(Object o) {
		if(o!=null && o instanceof Student) {
			String regno=((Student)o).getRegistrationNumber();
			if(regno!= null && regno.equals(this.registrationNumber)) {
				return true;
			}
		}
		return false;
	}
public int hashCode() {
	return this.registrationNumber.hashCode();
}


}
