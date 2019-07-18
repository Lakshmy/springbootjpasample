package com.sprintboot.init.testlk.testlk;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
    PetRepository petRepository;
	@Autowired
    PersonRepository personRepository;
	
	/**
	 * getPetsById
	 * @param id
	 * @return Person
	 * @throws PersonNotFoundException
	 */
	public Person getPetsById(final Long id) throws PersonNotFoundException{
        Optional<Person> optional = personRepository.findById(id);
        if(optional.isPresent()) {
        	Person person = (Person)optional.get();
        	return person;
        }
        throw new PersonNotFoundException(id);
        
    }
	
	/**
	 * addPet
	 * @param personId
	 * @param petName
	 * @return list of pets
	 * @throws PersonNotFoundException
	 */
    public List<Pet> addPet(Long personId, String petName) throws PersonNotFoundException{
    	Optional<Person> optional = personRepository.findById(personId);
    	if(optional.isPresent()) {
        	Person person = (Person)optional.get();
        	Pet pet = new Pet();
        	pet.setName(petName);
        	pet.setOwner(person);
        	petRepository.save(pet);
        	petRepository.flush();
            return petRepository.findAll();
        }
        throw new PersonNotFoundException(personId);
    }
    
    
    // test functions
    public List<Person> getPerson() {
        return personRepository.findAll();
    }
    
	public List<Pet> getAllPets() {
		return petRepository.findAll();
	}

	public Person getPetsByName(final String name) throws PersonNotFoundException{
    	Person person = personRepository.findByName(name);
        if( person == null)  throw new PersonNotFoundException(name);
        return person;
    }
    
    public String getOwnerById(final Long id) {
        Optional<Pet> optional = petRepository.findById(id);
        Pet pet = (Pet)optional.get();
        return pet.getOwnerName();
    }
    
    public List<Pet> getPets() {
        return petRepository.findAll();
    }
    
    public String getOwnerByName(final String name) {
        Pet pet = petRepository.findByName(name);
        return pet.getOwnerName();
    }
    



}
