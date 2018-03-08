package com.ws.service;

import java.util.List;

import com.ws.database.entity.User;

public interface UserService {
	
	public List<User> create(User user);
	public List<User> read();
	public List<User> update(User user);
	public List<User> delete(User user);
	
}
