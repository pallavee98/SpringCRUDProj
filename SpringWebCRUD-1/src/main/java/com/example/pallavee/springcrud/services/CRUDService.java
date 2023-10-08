package com.example.pallavee.springcrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pallavee.springcrud.models.Characters;
import com.example.pallavee.springcrud.repositories.SuperheroCharacterRepository;

@Service
public class CRUDService {
	@Autowired
	SuperheroCharacterRepository superheroCharacterRepository;
	public void createSuperhero(Characters character) {
		superheroCharacterRepository.save(character);
	}
    
	
	public Characters readSuperHeroById(int val) {
		return superheroCharacterRepository.findById(val).get();
	}
}
