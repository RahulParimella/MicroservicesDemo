package com.example.demo.mapper;

import com.example.demo.dto.HotelDto;
import com.example.demo.model.Hotel;

public class HotelMapper {
		//dto to entity
		public static Hotel mapToHotel(HotelDto hotelDto) {
			Hotel hotel =new Hotel();
			
			hotel.setAddress(hotelDto.getAddress());
			hotel.setName(hotelDto.getName());
			hotel.setHotelId(hotelDto.getHotelId());
			return hotel;
			
		}
		
		public static HotelDto mapToHotelDto(Hotel hotel) {
			HotelDto hotelDto =new HotelDto();
		hotelDto.setAddress(hotel.getAddress());
		hotelDto.setName(hotel.getName());
		hotelDto.setHotelId(hotel.getHotelId());

			return hotelDto;
			
			
		}
}
