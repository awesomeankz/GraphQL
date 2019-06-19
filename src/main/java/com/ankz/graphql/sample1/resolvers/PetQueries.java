package com.ankz.graphql.sample1.resolvers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ankz.graphql.sample1.entities.Animal;
import com.ankz.graphql.sample1.entities.Pet;
import com.ankz.graphql.sample1.repositories.PetRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class PetQueries implements GraphQLQueryResolver {
	private static final Logger LOGGER = LoggerFactory.getLogger(PetQueries.class);

	@Autowired
	PetRepository petRepository;


	public List<Pet> pets() {
		LOGGER.info("pets find");
		return petRepository.findAll();
	}
	
	public Pet pet(Long id) {
		LOGGER.info("pets findById");
		return petRepository.findById(id);
	}
	
	public List<Pet> petByType(Animal animal){
		LOGGER.info("pets findByType");
		return petRepository.petsByType(animal);
	}
	
}
