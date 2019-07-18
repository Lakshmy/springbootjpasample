package com.sprintboot.init.testlk.testlk;

public class PersonNotFoundException extends RuntimeException {
	 
    private static final long serialVersionUID = 1L;
 
    public PersonNotFoundException(Long id) {
        super("Invalid Owner id " + id);
    }
    public PersonNotFoundException(String name) {
        super("Invalid Owner Name " + name);
    }
}
