package com.aprilxie.bbs.repository;
import com.aprilxie.bbs.model.Ticket;
import com.aprilxie.bbs.model.TripSchedule;
import com.aprilxie.bbs.model.user.User;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String>{
	//Ticket findById(String id);
	
	ArrayList<Ticket> findByPassenger(User passenger);
	
	ArrayList<Ticket> findByTripSchedule(TripSchedule schedule);
}
