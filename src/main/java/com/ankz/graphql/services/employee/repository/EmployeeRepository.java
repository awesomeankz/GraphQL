package com.ankz.graphql.services.employee.repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ankz.graphql.services.employee.model.Employee;
public class EmployeeRepository {
	

	private List<Employee> employees = new ArrayList<>();
	
	public Employee add(Employee employee) {
		employee.setId((long) (employees.size()+1));
		employees.add(employee);
		return employee;
	}
	
	public Employee findById(Long id) {
		Optional<Employee> employee = employees.stream().filter(a -> a.getId().equals(id)).findFirst();
		if (employee.isPresent())
			return employee.get();
		else
			return null;
	}
	
	public List<Employee> findAll() {
		return employees;
	}
	
	public List<Employee> findByDepartment(Long departmentId) {
		return employees.stream().filter(a -> a.getDepartmentId().equals(departmentId)).collect(Collectors.toList());
	}
	
	public List<Employee> findByOrganization(Long organizationId) {
		return employees.stream().filter(a -> a.getOrganizationId().equals(organizationId)).collect(Collectors.toList());
	}
	
	public boolean delete(Long id) {
		return employees.removeIf(it -> it.getId() == id.longValue());
	}
	
	public Employee update(Long id, Employee employee) {
		employee.setId(id);
		int index = employees.indexOf(employee);
		employees.set(index, employee);
		return employee;
	}

}
