package com.ws.response;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@Service
@JsonRootName("payloadResponse")
public class PayloadResponse<T> {
	
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("error")
	private boolean error;
	
	@JsonProperty("data")
	private T data;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	

}
