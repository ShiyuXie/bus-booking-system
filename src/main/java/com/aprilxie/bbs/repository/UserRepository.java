package com.aprilxie.bbs.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.aprilxie.bbs.model.user.User;

public interface UserRepository extends MongoRepository<User,String> {
	//User findById(String id);
	User findByEmail(String email);
	User findByMobile(String mobile);
}
