package com.aprilxie.bbs.repository;

import com.aprilxie.bbs.model.Agency;
import com.aprilxie.bbs.model.Bus;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface BusRepository extends MongoRepository<Bus, String>{
	Bus findByCode(String code);
	
	ArrayList<Bus> findByAgency(Agency agency);
}
