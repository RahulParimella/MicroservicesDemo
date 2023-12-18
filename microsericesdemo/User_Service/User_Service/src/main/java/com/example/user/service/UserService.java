package com.example.user.service;






import java.util.List;

import com.example.user.dto.UserDto;


public interface UserService {
	UserDto saveUser(UserDto userDto);
	List<UserDto> getAllUsers();
	UserDto getUser(long id);
	UserDto updateUser(long id,UserDto userDto);
	String deleteUser(long id);
}
