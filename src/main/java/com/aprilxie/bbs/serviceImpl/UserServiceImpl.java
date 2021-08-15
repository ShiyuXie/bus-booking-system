package com.aprilxie.bbs.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.aprilxie.bbs.dto.UserDto;
import com.aprilxie.bbs.model.user.Role;
import com.aprilxie.bbs.model.user.User;
import com.aprilxie.bbs.model.user.UserRoles;
import com.aprilxie.bbs.repository.RoleRepository;
import com.aprilxie.bbs.repository.UserRepository;
import com.aprilxie.bbs.service.UserService;
import com.aprilxie.bbs.utils.UserMapper;

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	RoleRepository roleRepo;
	
	@Override
	public UserDto signUp(UserDto userDto) {
		Role userRole;
		String userEmail = userDto.getEmail();
		User user = userRepo.findByEmail(userEmail);
		if (user == null ) {
			if ( userDto.isAdmin() ) {
				userRole = roleRepo.findByRole(UserRoles.ADMIN);
			}
			else {
				userRole = roleRepo.findByRole(UserRoles.PASSENGER);
			}
			
			User newUser = new User()
							.setEmail(userEmail)
							.setPassword(userDto.getPassword())
							.setFirstName(userDto.getFirstName())
							.setLastName(userDto.getLastName())
							.setRoles(new HashSet<>(Arrays.asList(userRole)))
							.setMobileNumber(userDto.getMobileNumber());
			return UserMapper.toUserDto(userRepo.save(newUser));
		}
		else {
			throw new Exception("User exists!");
		}
	}

}
