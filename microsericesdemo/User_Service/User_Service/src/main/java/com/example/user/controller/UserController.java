package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.dto.UserDto;
import com.example.user.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
		 return new ResponseEntity<>(userService.saveUser(userDto), HttpStatus.CREATED);	
	}
	

	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> getHotels(){
		return ResponseEntity.ok(userService.getAllUsers());
		
	}
	


	@GetMapping("/user/{id}")
	//Type2
	public ResponseEntity<UserDto> getUserById(@PathVariable long id) {
		UserDto userIdRetrieved = userService.getUser(id);
		return new ResponseEntity<UserDto>(userIdRetrieved,HttpStatus.OK);
	}
	@PutMapping("/user/{id}")
	public ResponseEntity<UserDto> updateUsers(@PathVariable long id ,UserDto user) {
		return ResponseEntity.ok(userService.updateUser(id, user));
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteUserId(@PathVariable long id) {
		return ResponseEntity.ok( userService.deleteUser(id));
	}
}
