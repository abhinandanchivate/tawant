package com.tavant.collection;

import java.util.ArrayList;

import com.tavant.collection.model.Employee;
import com.tavant.collection.service.EmployeeService;
import com.tavant.collection.service.EmployeeServiceImpl;

public class Main {

	
	public static void main(String[] args) {
		
		
	EmployeeService employeeService = new EmployeeServiceImpl();
	
	Employee employee = new Employee();
	employee.setEmpFirstName("abhi");
	employee.setEmpLastName("chivate");
	employee.setEmpSalary(100);
	employee.setEmpId("AB001");
	String result = employeeService.addEmployee(employee);
	System.out.println(result);
	}
}
