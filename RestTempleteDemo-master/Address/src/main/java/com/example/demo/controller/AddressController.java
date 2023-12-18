package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AddressDto;
import com.example.demo.service.AddressDtoService;

@RestController
@RequestMapping("/api")
public class AddressController {
	
	@Autowired
	private AddressDtoService addService;
	
	@PostMapping("/address")
	public AddressDto addUser(@RequestBody  AddressDto addressDto)
	{
		return addService.createAddress(addressDto);
		
	}
	
	@GetMapping("address/{id}")
	public AddressDto getUserById( @PathVariable("id") Long id) {
		return addService.getAddressById(id);
	}

}
