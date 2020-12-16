package com.tavant.collection.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.tavant.collection.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private Set<Employee> employees = new TreeSet<Employee>(new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {
			// TODO Auto-generated method stub
			return emp1.getEmpId().compareTo(emp2.getEmpId());
		}
	});

	private Set<Employee> employees2 = new TreeSet<Employee>((e1, e2) -> {
		return e1.getEmpId().compareTo(e2.getEmpId());
	});

	private Set<Employee> employees3 = new TreeSet<Employee>((e1, e2) -> e1.getEmpId().compareTo(e2.getEmpId()));

	// DC ===> 10
	// parameterized ===> size
	// prameterzed another ===> will accept Collection (used to transfrom any
	// collection to list)

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean result = employees.add(employee);
		if (result) {

			return "success";
		} else {
			return "fail";
		}
		// success
		// fail

	}

	@Override
	public Optional<Employee> updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		// either we have to find index or we should get that object
		
		// index based approach 
		// do we need to traverse the collection?
		
		try {
			
//			Stream<Employee> stream = employees.stream().filter(e->(e.getEmpId().equals(empId)));
//			
//			
//			return stream.findFirst();
			
			employees = employees.stream()
					.filter(e->(e.getEmpId().equals(empId)))  // will filter the records
					.collect(Collectors.toSet()); // will collect the objects from stream and add them into set
	return "success";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return "fail";
		}
		
	
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
	public Optional<Employee> getEmployeeById(String empID) {
		// TODO Auto-generated method stub

		Stream<Employee> stream = employees.stream();

		return stream.filter(e -> e.getEmpId().equals(empID)).findFirst();

//		for (Employee employee : employees) {
//			if(employee.getEmpId().equals(empID)) {
//				return Optional.of(employee);
//			}
//		}
//		return Optional.empty();

	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		if (employees.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(new ArrayList<Employee>(employees));
		// if list is not availbale then it will return empty
		// else it will return list object

	}

	@Override
	public boolean employeeExistsById(String empId) {
		// TODO Auto-generated method stub
		return employees.contains(this.getEmployeeById(empId));
	}

}
