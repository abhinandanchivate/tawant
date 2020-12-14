package com.tavant.collection.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.tavant.collection.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	
	private List<Employee> employees = new ArrayList<Employee>();
	// DC ===> 10
	// parameterized ===> size
	// prameterzed another ===> will accept Collection (used to transfrom any collection to list)
	
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean result =employees.add(employee);
		if(result) {
			return "success";
		}
		else {
			return "fail";
		}
		// success
		// fail
		
		
	}

	@Override
	public Employee updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		// either we have to find index or we should get that object
		
		// index based approach 
		// do we need to traverse the collection?
		
		boolean  result = employees.remove(this.getEmployeeById(empId));
		if (result ) return "success";
		else return "fail";
//		int index = -1;
//	Iterator<Employee> iterator = employees.iterator();
//	while (iterator.hasNext()) {
//		Employee employee = (Employee) iterator.next();
//		index++;
//		if(empId.equals(employee.getEmpId())) {
//			break;
//		}
//		
//	}
//	
//	employees.remove(index);
//	
	
	}

	@Override
	public Employee getEmployeeById(String empID) {
		// TODO Auto-generated method stub
		
		for (Employee employee : employees) {
			if(employee.getEmpId().equals(empID)) {
				return employee;
			}
		}
		return null;
		
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public boolean employeeExistsById(String empId) {
		// TODO Auto-generated method stub
		return employees.contains(this.getEmployeeById(empId));
	}

}
