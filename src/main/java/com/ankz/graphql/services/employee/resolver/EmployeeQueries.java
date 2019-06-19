package com.ankz.graphql.services.employee.resolver;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ankz.graphql.services.employee.model.Employee;
import com.ankz.graphql.services.employee.repository.EmployeeRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;



@Component
public class EmployeeQueries implements GraphQLQueryResolver {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeQueries.class);

	@Autowired
	EmployeeRepository repository;

	public List<Employee> employees() {
		LOGGER.info("Employees find");
		return repository.findAll();
	}

	public List<Employee> employeesByOrganization(Long organizationId) {
		LOGGER.info("Employees find: organizationId={}", organizationId);
		return repository.findByOrganization(organizationId);
	}

	public List<Employee> employeesByDepartment(Long departmentId) {
		LOGGER.info("Employees find: departmentId={}", departmentId);
		return repository.findByDepartment(departmentId);
	}

	public Employee employee(Long id) {
		LOGGER.info("Employee find: id={}", id);
		return repository.findById(id);
	}
}
