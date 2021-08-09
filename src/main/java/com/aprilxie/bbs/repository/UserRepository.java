package com.aprilxie.bbs.repository;
import com.aprilxie.bbs.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
	//User findById(String id);
	User findByEmail(String email);
	User findByMobile(String mobile);
}
