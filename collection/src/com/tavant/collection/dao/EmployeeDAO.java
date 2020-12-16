package com.tavant.collection.dao;

import java.util.List;
import java.util.Optional;

import com.tavant.collection.model.Employee;

public interface EmployeeDAO {

	public String addEmployee(Employee employee);

	public Optional<Employee> updateEmployee(String empId, Employee employee);

	public Optional<Employee> getEmployeeById(String empID);

	public Optional<List<Employee>> getEmployees();

	public String deleteEmployee(String empId);

	public boolean employeeExistsById(String empId);

// to handle the NPE we can use Optional class.

}
