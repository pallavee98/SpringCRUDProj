package com.example.pallavee.springcrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pallavee.springcrud.models.Characters;
import com.example.pallavee.springcrud.services.CRUDService;

@RestController
public class MarvelCrudController {
	//crud
	@Autowired
	CRUDService crudservice;
	//create api endpoint - POST
	@PostMapping(path="create")
	public void createSuperHero(@RequestBody Characters superhero) {
		crudservice.createSuperhero(superhero);
		
	}
	//read
	//localhost://8080/read?id=1
	public void readSuperHeroById(@RequestParam(name="id")int value) {
		crudservice.readSuperHeroById(value);
	}
	

}
