package com.example.pallavee.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.pallavee.springcrud.models.Characters;

@Component
public interface SuperheroCharacterRepository extends JpaRepository<Characters,Integer> {

}
