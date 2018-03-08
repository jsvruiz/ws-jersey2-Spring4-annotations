package com.ws.database.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("user")
public class User {
	
	@JsonProperty("user")
	private String user;
	
	@JsonProperty("password")
	private String password;
	
	public User(String user , String password) {
		this.user = user;
		this.password = password;
	}

}
