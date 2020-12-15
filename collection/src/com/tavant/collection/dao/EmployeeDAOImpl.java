package com.tavant.collection.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.tavant.collection.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	
	private Set<Employee> employees = new TreeSet<Employee>(new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {
			// TODO Auto-generated method stub
			return emp1.getEmpId().compareTo(emp2.getEmpId());
		}
	});
	
	private Set<Employee> employees2 = new TreeSet<Employee>((e1,e2)->{return  e1.getEmpId().compareTo(e2.getEmpId());});
	
	private Set<Employee> employees3 = new TreeSet<Employee>((e1,e2)-> e1.getEmpId().compareTo(e2.getEmpId())
			);
	
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
		return new ArrayList<Employee>(employees);
	}

	@Override
	public boolean employeeExistsById(String empId) {
		// TODO Auto-generated method stub
		return employees.contains(this.getEmployeeById(empId));
	}

}
