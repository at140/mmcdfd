package com.mmc.iframepoc;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RestControllerClass {
	
	/*@GetMapping("/api/login")
	public ModelAndView echoTheUsersEmailAddress() {
	   return new ModelAndView("login");//"Hey there! Your email address is: " ; //+principal.getName();
	}*/
	
	@GetMapping("/api/msg")
	public ResponseEntity<?> echoTheUsersEmailAddress() {
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("Access-Control-Allow-Origin", 
	      "*");
	    responseHeaders.set("Access-Control-Allow-Credentials", "true");
	    responseHeaders.set("Access-Control-Max-Age","86400");
	    responseHeaders.set("Access-Control-Allow-Methods","PUT, POST, GET, DELETE, PATCH, OPTIONS");
	    responseHeaders.set("Access-Control-Allow-Headers", "Origin, content-type, Authorization, X-Auth-Token");
		 return ResponseEntity.ok().headers(responseHeaders).body("Successfully Loggedin");//.getHeaders().setAccessControlAllowOrigin("http://localhost:8071/"); //new String("Successfully Loggedin");
	}
}
