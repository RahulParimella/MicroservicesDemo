package com.example.demo.service;

import com.example.demo.dto.AddressDto;

public interface AddressDtoService {
	AddressDto createAddress(AddressDto addressDto);
	AddressDto getAddressById(Long id);

}
