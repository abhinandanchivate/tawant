package com.tavant.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	employee.setEmpId("AB002");
	String result = employeeService.addEmployee(employee);
	System.out.println(result);
	Employee employee2 = new Employee();
	employee2.setEmpFirstName("abhi");
	employee2.setEmpLastName("chivate");
	employee2.setEmpSalary(100);
	employee2.setEmpId("AB001");
	result = employeeService.addEmployee(employee2);
	System.out.println(result);
	
	for (Employee empl : employeeService.getEmployees()) {
		System.out.println(empl);
	}
	
	
	
	}
	
	
}



// Department
// string deptId
// string deptname
// string locationid

// Location
// string locationid
// string locationname



