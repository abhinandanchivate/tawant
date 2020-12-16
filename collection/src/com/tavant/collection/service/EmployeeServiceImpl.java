package com.tavant.collection.service;

import java.util.List;
import java.util.Optional;

import com.tavant.collection.dao.EmployeeDAO;
import com.tavant.collection.dao.EmployeeDAOImpl;
import com.tavant.collection.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employee);
	}

	@Override
	public Optional<Employee> updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(empId, employee);
	}

	@Override
	public String deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return employeeDAO.deleteEmployee(empId);
	}

	@Override
	public Optional<Employee> getEmployeeById(String empID) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(empID);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployees();
	}

	@Override
	public boolean employeeExistsById(String empId) {
		// TODO Auto-generated method stub
		return employeeDAO.employeeExistsById(empId);
	}

}
