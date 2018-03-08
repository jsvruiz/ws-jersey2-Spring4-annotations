package com.ws.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.ws.database.entity.User;
import com.ws.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	/**
	 * 
	 * We simulate obtain a user list 
	 * 
	 * **/
	@Override
	public List<User> read() {
		return generateDummyData();
	}

	
	/**
	 * 
	 * We simulate to create a user and We add the new user to list : generateDummyData();
	 * 
	 * **/
	@Override
	public List<User> create(User user) {
		List<User> users = generateDummyData();
		users.add(user);
		return users;
	}
	

	/**
	 * 
	 * We simulate to update a user of list : generateDummyData();
	 * 
	 * **/
	@Override
	public List<User> update(User user) {
		
		List<User> users = generateDummyData();
		
		for( int i = 0 ; i < users.size() ; i++ ) {
			if(users.get(i).getId() == user.getId()) {
				users.set(i, user);
				return users;
			}
		}
		
		return null;
	}
	
	
	/**
	 * 
	 * We simulate to delete a user of list : generateDummyData();
	 * 
	 * **/
	@Override
	public List<User> delete(User user) {
		
		List<User> users = generateDummyData();
		
		for( int i = 0 ; i < users.size() ; i++ ) {
			if(users.get(i).getId() == user.getId()) {
				users.remove(i);
				return users;
			}
		}
		
		return null;
	}
	
	
	/**
	 * 
	 * We generate a list the dummy user
	 * 
	 * **/
	private List<User> generateDummyData(){
		// TODO We create dummies data with users and passwords
		List<User> users = new ArrayList<User>();
		for( int i = 0 ; i < 5 ; i++) {
			long index = i + 1;
			users.add(new User( /*id*/ index , /* user */ "User " + index , /*password*/ "user" + index));
		}
		return users;
	}

}
