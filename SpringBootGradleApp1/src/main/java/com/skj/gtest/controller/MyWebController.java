package com.skj.gtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skj.gtest.entity.AppUser;
import com.skj.gtest.service.AppUserService;

@RestController
@RequestMapping("/facebook")
public class MyWebController {

	@Autowired
	AppUserService userService;
	
	
	
	public MyWebController() {
		System.out.println("\n\n\n====>> Inside Constructor "+this);
	}
	@GetMapping("/welcome")
	public String abc()
	{
		return "Welcome to Facebook";
	}
	


	@PostMapping("/user")
	public String addUser(@RequestBody AppUser user) 
	public ResponseEntity<String> addUser(@RequestBody AppUser user) 
	{
		/*
		 * // request body annotation  , help u 
		 * to take user information as JSON , so it convert JSON object to AppIser Object
		 * */
		try {
			return userService.insertUser(user);
			AppUser savedUser =  userService.insertUser(user);
			String responseMsg = savedUser.getUsername()+" save with Id "+savedUser.getUserId();
			return new ResponseEntity<String>(responseMsg,HttpStatus.OK);
			
		} catch (Exception e) {
			return "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
			String errorMsg =  "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
			return new ResponseEntity<String>(errorMsg,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	// http://localhost:8001/facebook/userandrole/ramesh
		@GetMapping("/roles/{role}")
		public List<AppUser> abc(@PathVariable String role)throws Exception
		{
			System.out.println(" --->> 1 Inside controller "+role);
			return userService.getUsersByRole(role);
		}
	
	
		@GetMapping("/usersbyId")
		public List<AppUser> usersById(@RequestParam int r1 , @RequestParam int r2)throws Exception
		{
			
			return userService.getUsersBetweenIds(r1, r2);
		}	
	
	
	
	
	// http://localhost:8001/facebook/userandrole/ramesh
	@GetMapping("/user/{searchUsername}")
	public AppUser abc2(@PathVariable String searchUsername)throws Exception
	{
		return userService.getUserByUserName(searchUsername);
	}
	
	// http://localhost:8001/facebook/userandrole/ramesh?role=user
	@GetMapping("/userandrole/{searchUsername}")
	public AppUser abc3(@PathVariable String searchUsername,@RequestParam String role)throws Exception
	{
		if(role != null)
		{
			return userService.getUserByUserNameAndRole(searchUsername,role);
		}
		else return null;
		
	}
	
	
	
	
	
	@GetMapping("/users")
	public List<AppUser> getAllUsers()
	{
		// write some code to extract users
		try {
			List<AppUser>  allExtractedUsers = userService.getAllUsers();
			
			return allExtractedUsers;
			
		} catch (Exception e) {
			// code missing for expection handling 
			System.out.println(e);
			
		}
		
		return null;
	}
	
}

