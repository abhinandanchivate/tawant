package com.tavant.collection;

import java.util.List;
import java.util.Optional;

import com.tavant.collection.exceptions.InvalidSalaryException;
import com.tavant.collection.model.Employee;
import com.tavant.collection.service.EmployeeService;
import com.tavant.collection.service.EmployeeServiceImpl;

public class MainOptional {

	
	public static void main(String[] args) {
		EmployeeService employeeService  = new EmployeeServiceImpl();
		
		try {
			Employee employee = new Employee("AB001", "abhi", "chivate", 123.0f);
			String result = employeeService.addEmployee(employee);
			Optional<Employee> optional  = employeeService.getEmployeeById("AB002");
			
			if(optional.isPresent()) {
				System.out.println(optional.get());
			}
			else {
				System.out.println("record not found");
			}
			
			Optional<List<Employee>> optionalEmployees = employeeService.getEmployees();
			
			if(optionalEmployees.isPresent()) {
				List<Employee> employees = optionalEmployees.get();
				employees.forEach(System.out::println);
			}
			else {
				System.out.println("list is empty");
			}
			
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
