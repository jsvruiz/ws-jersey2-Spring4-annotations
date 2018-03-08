package com.ws.header;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class HeaderService {
	
	 public Map<String, String> getHeaders(){
		 Map<String, String> headers = new HashMap<>();
	        headers.put("X-Powered-By", "jvr");
	       return headers;
	 }
	 
}
