package com.microservice.rating.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.rating.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long>{

	

	//custom finder method
	
	
}
