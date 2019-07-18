package com.sprintboot.init.testlk.testlk;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(name = "first_name")
	private String name;
    
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    private List<Pet> pets;
    
    public Person() {
    }

    /* public Integer getId() {
		return id;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<String> getPets() {
		Set<String> petNames = new HashSet<String>();
		for(Pet pet : pets)
			petNames.add(pet.getName());
		return petNames;
	}
	
}
