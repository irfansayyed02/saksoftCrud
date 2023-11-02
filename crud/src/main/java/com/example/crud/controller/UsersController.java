package com.example.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Users;
import com.example.crud.service.UsersService;

@RestController
public class UsersController {

	private UsersService userService;
	
	@PostMapping("/AddUser")
	public Users addUser(@RequestBody Users user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/getUser")
	public List<Users> getAllUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/getUser/{id}")
	public Users getUserbyId(@PathVariable int id ) {
		return userService.getUserbyId(id);
	}
	
	@GetMapping("/getUser/{email}")
	public Users getUserbyEmail(@PathVariable String email ) {
		return userService.getUserbyEmail(email);
	}
	
	@PutMapping("/UpdateUser")
	public Users updateUser(@RequestBody Users user) {
		return userService.updateUser(user);
	}
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}
	

	
	
}
