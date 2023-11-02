package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

	Users findByEmail(String email);

}
