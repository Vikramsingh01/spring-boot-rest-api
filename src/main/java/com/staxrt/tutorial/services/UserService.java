package com.staxrt.tutorial.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.staxrt.tutorial.model.User;

@Service
public class UserService {
	

	public User createUserBydefaultField(User user) {
		
		  user.setCreatedAt(new Date());
		  user.setCreatedBy("vikram");
		  user.setUpdatedAt(new Date());
		  user.setUpdatedBy("vikram");
		  return user;
	}
}
