package com.ws.database.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("user")
public class User {
	
	@JsonProperty("id")
	private long id;
	
	@JsonProperty("user")
	private String user;
	
	@JsonProperty("password")
	private String password;
	
	public User() {
	}
	
	@JsonCreator
	public User( @JsonProperty("id") long id, @JsonProperty("user") String user,  @JsonProperty("password") String password) {
		this.id= id;
	    this.user = user;
	    this.password = password;
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
