package com.aprilxie.bbs.repository;

import com.aprilxie.bbs.model.Bus;
import com.aprilxie.bbs.model.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TripRepository extends MongoRepository<Trip, String>{
	//Trip findById(String id);
	
	Trip findByJourneyTime(String date);
	
	Trip findByBus(Bus bus);

}
