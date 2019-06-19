package com.ankz.graphql.sample1.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ankz.graphql.sample1.entities.Animal;
import com.ankz.graphql.sample1.entities.Pet;


public class PetRepository {
	
	List<Pet> pets = new ArrayList<>();
	
	
	public Pet add(Pet pet) {
		pet.setId((long) (pets.size()+1));
		pets.add(pet);
		return pet;
	}
	
	public Pet findById(Long id) {
		Optional<Pet> pet = pets.stream().filter(a -> a.getId().equals(id)).findFirst();
		if (pet.isPresent())
			return pet.get();
		else
			return null;
	}
	
	public List<Pet> findAll() {
		return pets;
	}
	
	public List<Pet> petsByType(Animal animal) {
		return pets.stream().filter(s -> s.getType().equals(animal)).collect(Collectors.toList());
	}
	
	

}
