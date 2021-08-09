package com.aprilxie.bbs.repository;
import com.aprilxie.bbs.model.Role;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String>{
	Role findByRole(String role);

}
