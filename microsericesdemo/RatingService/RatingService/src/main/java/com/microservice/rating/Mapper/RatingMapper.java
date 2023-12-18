package com.microservice.rating.Mapper;

import com.microservice.rating.dto.RatingDto;
import com.microservice.rating.entity.Rating;

public class RatingMapper {
	//dto to entity
	public static Rating mapToRating(RatingDto ratingDto) {
		Rating rating = new Rating();
		rating.setFeedback(ratingDto.getFeedback());
	rating.setRating(ratingDto.getRating());
	rating.setRatingId(ratingDto.getRatingId());
	
		return rating;
		
	}
	//entity to dto
	public static RatingDto mapToRatingDto(Rating rating) {
		RatingDto ratingDto =new RatingDto();
		ratingDto.setFeedback(rating.getFeedback());
//		ratingDto.setHotelId(rating.getHotelId());
		ratingDto.setRating(rating.getRating());
		ratingDto.setRatingId(rating.getRatingId());
		return ratingDto;
		
		
		
	}
}
