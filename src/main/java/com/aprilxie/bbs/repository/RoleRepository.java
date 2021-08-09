package com.aprilxie.bbs.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.aprilxie.bbs.model.user.Role;

public interface RoleRepository extends MongoRepository<Role, String>{
	Role findByRole(String role);

}
