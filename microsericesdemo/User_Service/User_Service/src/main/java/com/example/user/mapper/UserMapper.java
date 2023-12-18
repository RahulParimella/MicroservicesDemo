package com.example.user.mapper;

import com.example.user.dto.UserDto;

import com.example.user.model.UserModel;

public class UserMapper {
		//dto to entity
		public static UserModel mapToUserModel(UserDto userDto){
			UserModel user =new UserModel();
			user.setUserId(userDto.getUserId());
			user.setName(userDto.getName());
			user.setEmail(userDto.getName());
			user.setAbout(userDto.getAbout());
			
			
			return user;
			
		}
		//entity to dto
		public static UserDto mapToUserDto(UserModel userModel) {
			UserDto userDto =new UserDto();
			userDto.setUserId(userModel.getUserId());
			userDto.setEmail(userModel.getEmail());
			userDto.setName(userModel.getName());
			userDto.setAbout(userModel.getAbout());
			
			return userDto;
			
		}
}
