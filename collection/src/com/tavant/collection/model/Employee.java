package com.tavant.collection.model;

import com.tavant.collection.exceptions.InvalidSalaryException;

public class Employee //implements Comparable<Employee>
{
	
	
	private String empId;
	public Employee(String empId, String empFirstName, String empLastName, float empSalary) throws InvalidSalaryException {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.setEmpSalary(empSalary);
	}
	private String empFirstName;
	private String empLastName;
	private float empSalary;
	public String getEmpId() {
		return empId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empSalary=" + empSalary + "]";
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) throws InvalidSalaryException {
		if(empSalary<0) {
			throw new InvalidSalaryException("salary should not be negative");
		}
		this.empSalary = empSalary;
	}
//	@Override
//	public int compareTo(Employee arg0) {
//		//comparison based on id
//		// TODO Auto-generated method stub
//		return arg0.getEmpId().compareTo(this.getEmpId());
//	}

}
