package com.sprintboot.init.testlk.testlk;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{
	Pet findByName(String name);
}
