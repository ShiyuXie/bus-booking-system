package com.aprilxie.bbs.repository;

import com.aprilxie.bbs.model.Agency;
import com.aprilxie.bbs.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgencyRepository extends MongoRepository<Agency, String>{
	Agency findByCode(String agencyCode);
	
	Agency findByOwner(User owner);
	
	Agency findByName(String name);
}
