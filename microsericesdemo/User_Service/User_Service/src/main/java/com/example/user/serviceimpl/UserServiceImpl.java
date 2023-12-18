package com.example.user.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.dto.HotelDto;
import com.example.user.dto.UserDto;
import com.example.user.exception.UserNotFoundException;
import com.example.user.mapper.UserMapper;
import com.example.user.model.UserModel;
import com.example.user.repository.UserRepository;
import com.example.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private ModelMapper userMapper;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public UserDto saveUser(UserDto userDto) {
		// TODO Auto-generated method stub
		UserModel user =userMapper.map(userDto, UserModel.class);
		UserModel saveUser =userRepo.save(user);
		UserDto adduserDto =userMapper.map(saveUser, UserDto.class);
		return adduserDto;
	}

	

	@Override
	public UserDto updateUser(long id, UserDto userDto) {
		
		UserModel userModel=userRepo.findById(id).get();
		userModel.setAbout(userDto.getAbout());
		userModel.setEmail(userDto.getEmail());
		userModel.setName(userDto.getName());
		 
		UserModel updatedUser=userRepo.save(userModel);
		
		return UserMapper.mapToUserDto(updatedUser);
		
		// TODO Auto-generated method stub
		

		
	
	}
	@Override
	public String deleteUser(long id) {
		// TODO Auto-generated method stub
		Optional<UserModel> userModel =userRepo.findById(id);
		if(userModel.isPresent()) {
			userRepo.deleteById(id);
			return "Id with" + id +"is deleted";
		}
		else {
			throw new UserNotFoundException("User id is not found" + id);
		}
		
	}







	@Override
	public UserDto getUser(long id) {
		// TODO Auto-generated method stub
		UserModel userModel =userRepo.findById(id).get();
		UserDto userDto =userMapper.map(userModel, UserDto.class);
		HotelDto hotelDto=restTemplate.getForObject("http://localhost:8085/api/hotel/{id}" ,HotelDto.class,id);//restTemplate .getForObject(url,response,uri)
		userDto.setHotelResponse(hotelDto);
		
		
		return userDto;
		
	}



	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		List<UserModel> userModel =userRepo.findAll();
		List<UserDto> userDto =userModel.stream().map(UserMapper::mapToUserDto).collect(Collectors.toList());
		return userDto;
		
		
	}



		
		
}





