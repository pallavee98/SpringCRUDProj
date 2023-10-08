package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
//@ComponentScan(basePackages= {"com.example.pallavee.springcrud.controllers"})
//@ComponentScan(basePackages= {"com.example.pallavee.springcrud.services"})
//@ComponentScan(basePackages= {"com.example.pallavee.springcrud.repositories"})
//@ComponentScan(basePackages= {"com.example.pallavee.springcrud.models"})
//@EnableAutoConfiguration



public class SpringWebCrud1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebCrud1Application.class, args);
	}

}
