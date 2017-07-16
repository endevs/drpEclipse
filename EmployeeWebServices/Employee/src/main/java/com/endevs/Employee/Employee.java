package com.endevs.Employee;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	private String empName;
	private int empId;
	
	
	public Employee() {
		
	}
	
	
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	

}
