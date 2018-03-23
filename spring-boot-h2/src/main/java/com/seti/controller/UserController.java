package com.seti.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.seti.model.User;
import com.seti.dto.UserDTO;
import com.seti.service.UserService;

@Controller
@Validated
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
	public ResponseEntity<User> userDetails(@PathVariable Long userId) {
        
		User user = userService.getUserDetails(userId);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ResponseEntity<User> saveUser(@Valid @RequestBody UserDTO userDetails) {
        
		userService.saveUser(userDetails);
		return new ResponseEntity<User>(HttpStatus.CREATED);
	}
}
