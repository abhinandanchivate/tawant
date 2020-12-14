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
	Scanner scanner = new Scanner(System.in);
	int choice = 0;
	while (true) {
		System.out.println("enter ur choice");
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			Employee employee = new Employee();
			employee.setEmpFirstName("abhi");
			employee.setEmpLastName("chivate");
			employee.setEmpSalary(100);
			employee.setEmpId("AB001");
			String result = employeeService.addEmployee(employee);
			System.out.println(result);
			break;
		case 2 : 
			
			break;
		case 3:
			
			String employees2 = employeeService.deleteEmployee("AB001");
			break;
			
		case 4 : 
			// retrieval case
			break;
		case 5: 
			// retrieve all
			break;
		case 6: 
			// exists method call
			break;
		case 7: 
			// exit;
			System.exit(0);
			
			
		default:
			break;
		}
	}
	
	
	
	List<Employee> employees = employeeService.getEmployees();
	
	for (Employee employee2 : employees) {
		System.out.println(employee2);
	}
	
	
	
	}
	
	
}
