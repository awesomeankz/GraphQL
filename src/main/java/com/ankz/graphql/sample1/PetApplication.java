package com.ankz.graphql.sample1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ankz.graphql.sample1.entities.Animal;
import com.ankz.graphql.sample1.entities.Pet;
import com.ankz.graphql.sample1.repositories.PetRepository;

@SpringBootApplication
public class PetApplication {

/*	String schemaFile = "graphql/pet.graphqls" ;
	
	public PetApplication() {
		SchemaParser.newParser().files(schemaFile).build().makeExecutableSchema();
	}*/

	@Bean
	PetRepository repository2() {
		PetRepository repository = new PetRepository();
		repository.add(new Pet(1, "pet1", Animal.CAT, 5));
		repository.add(new Pet(2, "pet2", Animal.DOG, 15));
		repository.add(new Pet(3, "pet3", Animal.MAMMOTH, 52));
		repository.add(new Pet(4, "pet4", Animal.BADGER, 5));
		repository.add(new Pet(5, "pet5", Animal.CAT, 6));
		repository.add(new Pet(6, "pet6", Animal.DOG, 16));
		repository.add(new Pet(7, "pet7", Animal.MAMMOTH, 62));
		repository.add(new Pet(8, "pet8", Animal.BADGER, 6));
		return repository;
	}

}
