package com.ws.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.ws.database.entity.User;
import com.ws.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Override
	public List<User> allUser() {
		// TODO We create dummies data with users and passwords
		List<User> users = new ArrayList<User>();
		for( int i = 0 ; i < 9 ; i++) {
			users.add(new User("User " + i , "user" + i));
		}
		return users;
	}

}
