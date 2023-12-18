package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.dto.UserDto;
import com.example.user.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {

	void save(UserDto userDto);



}
