package com.tavant.collection.service;

import java.util.List;
import java.util.Optional;

import com.tavant.collection.model.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);
	public Optional<Employee> updateEmployee(String empId, Employee employee);
	public String deleteEmployee(String empId);
	public Optional<Employee> getEmployeeById(String empID);
	public Optional<List<Employee>> getEmployees();
	public boolean employeeExistsById(String empId);
}
