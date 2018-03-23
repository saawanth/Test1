/**
 * 
 */
package com.seti.service.impl;
import com.seti.dto.UserDTO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seti.model.User;
import com.seti.repo.UserRepo;
import com.seti.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo userRepo;

	public User getUserDetails(Long id) {
		return userRepo.findOne(id);

	}

	@Override
	public void saveUser(UserDTO userDTO) {
		User user = new User();
		user.setDob(userDTO.getDob());
		user.setEmail(userDTO.getEmail());
		user.setLocale(userDTO.getLocale());
		user.setName(userDTO.getName());
		user.setPhoneNumber(userDTO.getPhoneNumber());
		userRepo.save(user);
	}
	
	
}
