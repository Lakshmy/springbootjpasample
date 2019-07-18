package com.sprintboot.init.testlk.testlk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
public class Controller {
	
	@Autowired
	PersonService service;
	
	/**
	 * REST API to get pets for a given owner_id 
	 * @param id
	 * @return Person
	 */
    @GetMapping(value = "/person/{id}/getpets")
    public Person getPetsForOwnerId(@PathVariable Long id) {
        return service.getPetsById(id);
    }

    /**
     * REST API to get the Owner details for a given pet id
     * @param id
     * @return Person
     */
    @GetMapping(value = "/pet/{id}/getowner")
    public Person getOwner(@PathVariable Long id) {
        return service.getPetsById(id);
    }
    
    /**
     * REST API to add a new pet and assign to the owner
     * @param petname
     * @param id
     * @return the new list of pets 
     */
    @PostMapping(value = "/addpet/{id}")
    public List<Pet> addPetforOwner(@RequestBody String petname,
    		@PathVariable final Long id){
    	return service.addPet(id,petname);
    }
    

}
