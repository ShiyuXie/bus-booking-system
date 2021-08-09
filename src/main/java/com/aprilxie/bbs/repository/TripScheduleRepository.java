package com.aprilxie.bbs.repository;

import com.aprilxie.bbs.model.TripSchedule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TripScheduleRepository extends MongoRepository<TripSchedule, String>{
	//TripSchedule findById(String id);
	TripSchedule findByTripDate(String date);

}
