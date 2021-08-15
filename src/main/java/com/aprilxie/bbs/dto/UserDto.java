package com.aprilxie.bbs.dto;

import java.util.Set;

import com.aprilxie.bbs.model.user.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class UserDto {
	private String Id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private Set<Role> roles;
}
