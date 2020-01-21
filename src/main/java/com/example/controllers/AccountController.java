package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repositary.AccountRepositary;

@RestController
public class AccountController {
	
	@Autowired
	private AccountRepositary repo ;
	
	
	@GetMapping(value="/getbyid/{id}")
	Optional<User> getuserbyid(@PathVariable String  id) {
		System.out.println( "id "+ id);
		return repo.findById(id);
	}
	
	@GetMapping(value="/getbyname/{Name}")
	List<User> getuserbyname(@PathVariable String  Name) {
		
		return repo.findByName(Name);
	}
	
	
	@GetMapping(value="/temp")
	void saveUser() {
		repo.save(new User("1", "parosh", "p@gmail.com"));
		repo.save(new User("2", "rahulk", "p@gmail.com"));
		repo.save(new User("3", "cewvcew", "p@gmail.com"));
		repo.save(new User("4", "pgggg", "p@gmail.com"));
		repo.save(new User("5", "kkkkk", "p@gmail.com"));
	}
	
	
	
	

}
