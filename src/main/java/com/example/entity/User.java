package com.example.entity;



public class User {
	
	@org.springframework.data.annotation.Id
	public String Id;
	public String Name ;
	public String Email;
	
	
	
	
	
	
	public User(String id, String name, String email) {
		super();
		Id = id;
		Name = name;
		Email = email;
	}
	
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", Email=" + Email + "]";
	}


	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	
	

}
