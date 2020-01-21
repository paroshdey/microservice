package com.example.repositary;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.User;
import java.lang.String;
import java.util.List;



public interface AccountRepositary extends  MongoRepository<User, String>{
	
	
	public Optional<User> findById(String id);
	
	List<User> findByName(String Name);
	
 
}
