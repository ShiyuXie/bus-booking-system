package com.aprilxie.bbs.repository;
import com.aprilxie.bbs.model.Stop;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StopRepository extends MongoRepository<Stop, String>{
	Stop findByCode(String code);
	Stop findByName(String name);

}
