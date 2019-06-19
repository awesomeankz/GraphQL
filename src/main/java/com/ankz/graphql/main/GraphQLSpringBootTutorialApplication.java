package com.ankz.graphql.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ankz.graphql.sample1.PetApplication;
import com.ankz.graphql.sample2.EmployeeApplication;

@SpringBootApplication
public class GraphQLSpringBootTutorialApplication {

	public static void main(String[] args) {
		
		Class<?> [] primarySources = {PetApplication.class, EmployeeApplication.class };
		SpringApplication.run(primarySources, args);
//		SpringApplication.run(GraphQLSpringBootTutorialApplication.class, args);

	}
	

}
