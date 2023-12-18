package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.HotelDto;
import com.example.demo.exception.HotelNotFoundException;
import com.example.demo.mapper.HotelMapper;
import com.example.demo.model.Hotel;
import com.example.demo.repository.HotelRepository;
import com.example.demo.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepo;
	
	@Autowired
	private ModelMapper hotelMapper;
	
	@Autowired
	private RestTemplate restTemp;

	@Override
	public HotelDto createHotel(HotelDto hotelDto) {
//		Hotel hotel=HotelMapper.mapToHotel(hotelDto);
//		Hotel saveHotel=hotelRepo.save(hotel);
//		HotelDto addHotel=HotelMapper.mapToHotelDto(saveHotel);
		Hotel hotel=hotelMapper.map(hotelDto, Hotel.class);
		Hotel saveHotel=hotelRepo.save(hotel);
		HotelDto addHotel=hotelMapper.map(saveHotel, HotelDto.class);
		return addHotel;
		
		
	}

	@Override
	public HotelDto getHotelById(long id) {
		// TODO Auto-generated method stub
		Hotel hotel =hotelRepo.findById(id).get();
		return hotelMapper.map(hotel, HotelDto.class);
	}

	@Override
	public String deleteHotel(long id) {
		// TODO Auto-generated method stub
		Optional<Hotel> hotel=hotelRepo.findById(id);
		if(hotel.isPresent()) {
			hotelRepo.deleteById(id);
			return "Id with" + id +"is deleted";
		}
		else {
			throw new HotelNotFoundException("Hotel", "id", id);
		}
	
	}

	@Override
	public List<HotelDto> getAllHotels() {
		// TODO Auto-generated method stub
		List<Hotel> hotel =hotelRepo.findAll();
		List<HotelDto> hotelDto= hotel.stream().map(HotelMapper::mapToHotelDto).collect(Collectors.toList());
		return hotelDto;
		
	}




		
		
		
	}
	


	


