package com.ankz.graphql.sample1.entities;


public class Pet {

	private Long id;
	private String name;
	private Animal type;
	private int age;
	
	
	

	public Pet(long id, String name, Animal type, int age) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getType() {
		return type;
	}

	public void setType(Animal type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}
