package com.tavant.collection.service;

import java.util.List;

import com.tavant.collection.model.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);
	public Employee updateEmployee(String empId, Employee employee);
	public String deleteEmployee(String empId);
	public Employee getEmployeeById(String empID);
	public List<Employee> getEmployees();
	public boolean employeeExistsById(String empId);
}
