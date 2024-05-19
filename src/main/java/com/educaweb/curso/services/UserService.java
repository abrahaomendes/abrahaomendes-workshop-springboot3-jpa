package com.educaweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.educaweb.curso.entities.User;
import com.educaweb.curso.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
		
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
}
