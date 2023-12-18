package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.HotelDto;



public interface HotelService {
	
	HotelDto createHotel(HotelDto hotelDto);
	HotelDto getHotelById(long id);
	String deleteHotel(long id);
	List<HotelDto> getAllHotels();
	
	
	
}

