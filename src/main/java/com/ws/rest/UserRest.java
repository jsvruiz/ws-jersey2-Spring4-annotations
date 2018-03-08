package com.ws.rest;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.ws.database.entity.User;
import com.ws.service.UserService;

@Service
@Validated
@Path("/user")
public class UserRest {
	
	@Autowired
    private UserService userService;
	
	@GET
    @Path("/all")
	@Produces({ MediaType.APPLICATION_JSON })
    public Response getAll() {
		
        List<User> users = userService.allUser();
        return Response.ok(users).build();
        
    }
	
	@POST
    @Path("/login")
	@Produces({ MediaType.APPLICATION_JSON })
    public Response login() {
		
        List<User> users = userService.allUser();
        return Response.ok(users).build();
        
    }

}
