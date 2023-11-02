package com.example.crud.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Users;
import com.example.crud.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository repository;
	
	public Users saveUser(Users user) {
		return repository.save(user);	
	}
	
	public List<Users> getUsers(){
		return repository.findAll();
	}
	
	public Users getUserbyId(int id){
		return repository.findById(id).get();
	}
	
	public Users getUserbyEmail(String email){
		return repository.findByEmail(email);
	}
	
	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User Deleted ID : " + id;
	}
	
	public Users updateUser(Users user) {
		Users userPresent = repository.findById(user.getId()).orElse(null);
		userPresent.setFirstname(userPresent.getFirstname());
		userPresent.setLastname(userPresent.getLastname());
		userPresent.setEmail(userPresent.getEmail());
		userPresent.setAge(userPresent.getAge());
		
		return repository.save(userPresent);		
	}
	
}
