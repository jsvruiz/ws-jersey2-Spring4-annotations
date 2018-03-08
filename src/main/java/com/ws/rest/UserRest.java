package com.ws.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.ws.database.entity.User;
import com.ws.response.PayloadResponse;
import com.ws.service.UserService;


/**
 * 
 * In this class , We implement the basic operations for Rest Services.
 * 
 * C reate
 * R ead
 * U pdate
 * D elete
 * 
 * **/

@Service
@Validated
@Path("/user")
public class UserRest {
	
	/** 
	 * 
	 * We inject the object with Spring
	 * 
	 * **/
	@Autowired
    private UserService userService; 
	
	/**
	 * 
	 * We implements a generic response with the use of generics, We inject also this object
	 * 
	 * **/
	@Autowired
    private PayloadResponse<Object> payloadResponse; 
	
	
	/**
	 * 
	 *  POST Method commond use for to insert resources
	 * 
	 * **/
	@POST
    @Path("/create")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
    public Response create(User user ) {
		
		if( user != null) {
			
			//We create new user and get list of users
			List<User> users = userService.create(user);
			
			//We get generic response
			payloadResponse.setMessage("ok");
			payloadResponse.setData(users);
			
			return Response.ok(payloadResponse).build();
			
		}else {
			
			//We not acceptable request response if user is not received
			return Response.status(Response.Status.NOT_ACCEPTABLE).build();
			
		}
        
        
    }
	
	
	/**
	 * 
	 *  GET Method for to get resources 
	 * 
	 * **/
	@GET
    @Path("/read")
	@Produces({ MediaType.APPLICATION_JSON })
    public Response read() {
		
		//We read all users recorded
		List<User> users = userService.read();
		
		if( users != null && users.size() > 0 ) {
			payloadResponse.setMessage("ok");
			payloadResponse.setData(users);
			
			return Response.ok(payloadResponse).build();
			
		}else {
			
			//If We don't have users recorded , We no content response 
			return Response.noContent().build();
			
		}
		
    }
	
	
	/**
	 * 
	 *  UPDATE Method commond use for to update resources
	 * 
	 * **/
	@PUT 
    @Path("/update")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
    public Response update(User user ) {
		
		if(user == null) {
			
			//We not acceptable request response if user is not received
			return Response.status(Response.Status.NOT_ACCEPTABLE).build();
			
		}else {
			
			List<User> users = userService.update(user);
			
			if( users != null ) {
				
				payloadResponse.setMessage("ok");
				payloadResponse.setData(users);
				
				return Response.ok(payloadResponse).build();
				
			}else {
				
				//We send not modified response if it didn't update the record
				return Response.notModified().build();
				
			}
			
		}
        
    }
	
	
	/**
	 * 
	 *  DELETE Method commond use for to delete resources
	 * 
	 * **/
	@DELETE 
    @Path("/delete")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
    public Response delete(User user ) {
		
		if(user == null) {
			
			//We not acceptable request response if user is not received
			return Response.status(Response.Status.NOT_ACCEPTABLE).build();
			
		}else {
			
			List<User> users = userService.delete(user);
			
			if( users != null ) {
				
				payloadResponse.setMessage("ok");
				payloadResponse.setData(users);
				
				return Response.ok(payloadResponse).build();
				
			}else {
				
				//We send not modified response if it didn't delete the record
				return Response.notModified().build();
				
			}
			
		}
        
    }
	

}
