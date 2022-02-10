package com.fund_for_change.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund_for_change.domain.Account;
import com.fund_for_change.domain.User;
import com.fund_for_change.dto.UserDTO;
import com.fund_for_change.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public User saveUser(UserDTO userDto) {
		User user = convertToUser(userDto);
		return repository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return repository.findAll(); 
	}

	@Override
	public User getUserById(String id) {
		return repository.findById(id).get();
	}

	@Override
	public User updateUser(User user) {
		
		return repository.save(user);
	}

	@Override
	public void deleteUser(User user) {
		repository.delete(user);

	}

	private User convertToUser(UserDTO userDTO) {
		return  new User("usr1", userDTO.getUserName(), userDTO.getFullName(), userDTO.getUserEmail(), userDTO.getUserPhone(), userDTO.getRole(), userDTO.getPassword(),null,null);
	}
}
