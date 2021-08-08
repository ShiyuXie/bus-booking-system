package com.aprilxie.bbs.utils;

import com.aprilxie.bbs.dto.UserDto;
import com.aprilxie.bbs.model.User;

public class UserMapper {
	public static UserDto toUserDto(User user) {
		return new UserDto()
				.setId(user.getId())
				.setEmail(user.getEmail())
				.setPassword(user.getPassword())
				.setFirstName(user.getFirstName())
				.setLastName(user.getLastName())
				.setMobileNumber(user.getMobileNumber())
				.setRoleCode(user.getRole().getRole())
				;
	}
}
