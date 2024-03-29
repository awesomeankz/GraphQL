package com.ankz.graphql.services.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ankz.graphql.services.employee.model.Employee;
import com.ankz.graphql.services.employee.repository.EmployeeRepository;


@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	
	
	@Bean
	EmployeeRepository repository() {
		EmployeeRepository repository = new EmployeeRepository();
		repository.add(new Employee(1L, 1L, "John Smith", 34, "Analyst", 3000));
		repository.add(new Employee(1L, 1L, "Darren Hamilton", 37, "Manager", 5000));
		repository.add(new Employee(1L, 1L, "Tom Scott", 26, "Developer", 4500));
		repository.add(new Employee(1L, 2L, "Anna London", 39, "Analyst", 2500));		
		repository.add(new Employee(1L, 2L, "Patrick Dempsey", 27, "Developer", 5000));
		repository.add(new Employee(2L, 3L, "Kevin Price", 38, "Developer", 6000));		
		repository.add(new Employee(2L, 3L, "Ian Scott", 34, "Developer", 4500));
		repository.add(new Employee(2L, 3L, "Andrew Campton", 30, "Manager", 8000));
		repository.add(new Employee(2L, 4L, "Steve Franklin", 25, "Developer", 4000));
		repository.add(new Employee(2L, 4L, "Elisabeth Smith", 30, "Developer", 4000));
		return repository;
	}
	

}
