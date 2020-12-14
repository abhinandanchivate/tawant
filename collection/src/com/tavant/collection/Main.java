package com.tavant.collection;

import com.tavant.collection.model.Employee;

public class Main {

	
	public static void main(String[] args) {
		
		Employee employee[] = new Employee[5];
		
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setEmpFirstName("employee"+i);
			
		}
		
		for (Employee employee2 : employee) {
			
			
			System.out.println(employee2);
		}
		
		Employee[] temp = new Employee[employee.length + 5];
		
	System.arraycopy(employee, 0, temp, 0, employee.length);
	//src : src array to copy the contents
	// src pos : start position from src array
	// des array 
	// dest source 
	// no of elements to be copy from src to destn.
	
		System.out.println(temp.length);
	employee = temp;
	
	System.out.println("copied contents");
	
	for (Employee employee2 : employee) {
		System.out.println(employee2);
	}
	}
}
