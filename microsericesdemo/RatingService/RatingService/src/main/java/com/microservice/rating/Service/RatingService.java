package com.microservice.rating.Service;



import java.util.List;

import com.microservice.rating.dto.RatingDto;




public interface RatingService {
	//create
	RatingDto create(RatingDto ratingDto);
	
	//get all ratings by id
	RatingDto getRatingById(long id);
	List<RatingDto> getAllRatings();
	String deleteRating(long id);
	//get all by userID
//	RatingDto getRatingByUserId(long userId);
	
	//get all by hotelid
	RatingDto getRatingByHotelId(long hotelId);

}
